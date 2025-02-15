package com.uniformsearchalgorithms.uniformcostsearchalgorithm.algorithm;

import java.util.List;
import java.util.LinkedList;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Collections;

import javax.swing.JDialog;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

import com.uniformsearchalgorithms.node.WeightedNode;

public class UniformCostSearchAlgorithm {

   public static String search(WeightedNode rootNode, int totalNodes, String goalState){

    List <MyQueue> priorityQueue = new ArrayList<MyQueue>();

    WeightedNode currentNode = rootNode;
    MyQueue currentMyQueue, temp;

    currentMyQueue = new MyQueue(0, new WeightedNode[]{currentNode});

    // Initialize Queue with Starting Node.
    priorityQueue.add(currentMyQueue);
    
    int steps = 1;

    String result= "";

 // Repeat until Queue is empty  
   while( !priorityQueue.isEmpty()) {
    	
	   
	    //Pick minimum cost path from Queue.
    	currentMyQueue = priorityQueue.get(0);
        priorityQueue.remove(0);

        currentNode = currentMyQueue.getPath()[0];

        
        //  If the minimum path is goal, stop algorithm you found the solution.
        
        if(currentMyQueue.getPath()[0].getItem().equalsIgnoreCase(goalState)){
        	
        	result += "\n\n Step # %s \n\t".formatted(steps) + "\n\t    " + currentMyQueue + "\n";

        	result += "\n\tPriority Queue" + priorityQueue + "\n";
        	
        	return ("\n********************************** Uniform Cost Search Algorithm ****************************** \n"+"\n*********************** Shortest Path: " + currentMyQueue.toString().replaceAll("\n","").replaceAll("\t", "") + " ************************" +  "\n\n\tGoal State: " + goalState   + result);

        }
    
        result +=  "\n\n Step # %s \n\tFrom the path we have:".formatted(steps) + "\n\t    " + currentMyQueue + "\n";

        List<WeightedNode> list ;

        // For each neighbor node v add expanded path < v ,P > to Queue.
        
        for(int i = 0; i < currentNode.getchildren().length; i++){

            list = new ArrayList<WeightedNode>();

            list.add(currentNode.getchildren()[i]); 

            list.addAll(Arrays.asList(currentMyQueue.getPath()));     
            
            WeightedNode[] path =  (WeightedNode[]) list.toArray(new WeightedNode[list.size()]);
            
            int cost = currentMyQueue.getCost() + currentNode.getCost()[i];
            
            temp = new MyQueue(cost, path);
    
            if(!isCycle(temp)){
                priorityQueue.add(temp);
            }
            
        }
    
        Collections.sort(priorityQueue,new PriorityComparator());

        result += "\n\tPriority Queue" + priorityQueue + "\n";

        steps++;
    }
   
    return ("\n********************************** Uniform Cost Search Algorithm ****************************** \n"+ "\n\n************************************** Goal Does not Exist! **************************************\n"+ "\n\n\tGoal State: " + goalState   + result);

    }

    
    static boolean isCycle(MyQueue temp){

        if(temp.getPath()[0] == temp.getPath()[temp.getPath().length-1]){

            return true;
        }

        else{

            for (int i = 0; i <temp.getPath().length - 1; i++){

                for(int  j = i + 1; j < temp.getPath().length - 1; j++){

                    if(temp.getPath()[i] == temp.getPath()[j]){

                        return true;
                    }
                }

            }
        }

        return false;

    }

}
