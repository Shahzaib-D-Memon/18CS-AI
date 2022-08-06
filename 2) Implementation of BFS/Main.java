import java.util.Queue;
import java.util.LinkedList;
import java.util.Arrays;

// import java.util.*;
class Node{

    public String toString(){

        return item;
    }

    String item;
    Node child[];

    Node(String item, Node child[]){

        this.item = item;
        this.child = child;
    }

    Node(String item){

        this(item, null);
    }

    void setAllChild(Node child[]){

        this.child = child;
    }
}

class BFSTraversal{

   static String traverse(Node rootNode, int size){

        Queue <Node> que = new LinkedList<Node>();
     
        Node CN = rootNode;

        String vst[] = new String[size];

        int a = 0;

        vst[a] = CN.item;

        int step = 1;

        System.out.println("Step # " + step);
        System.out.println("Current Node: " + CN);
        System.out.println("Queue: " + que);
        System.out.println("Visited: " + Arrays.toString(vst));
        System.out.println();

        l:do{

            step++;

            for(int i = 0; i < CN.child.length;i++){

                if(!isVisited(CN.child[i].item, vst)){
                    
                    que.add(CN.child[i]);
                    vst[++a] = CN.child[i].item;

                    System.out.println("Step # " + step);
                    System.out.println("Current Node: " + CN);
                    System.out.println("Queue: " + que);
                    System.out.println("Visited: " + Arrays.toString(vst));
                    System.out.println();

                    continue l;
                    
                }
    
            }

            CN = que.poll();
        
           System.out.println("Step # " + step);
           System.out.println("Current Node: " + CN);
           System.out.println("Queue: " + que);
           System.out.println("Visited: " + Arrays.toString(vst));
           System.out.println();

        } while(CN != null);

        return Arrays.toString(vst);

    }

    static boolean isVisited(String n, String vst[]){

        for(int i = 0; i < vst.length; i++){

            if(n.equalsIgnoreCase(vst[i])){

                return true;
            }
        }

        return false;

    }
    

}

public class Main{

    public static void main(String args[]){

        
        int size = 0;

        // First Problem # 1
        Node f = new Node("F");
        Node b = new Node("B");
        Node g = new Node("G");
        Node a = new Node("A");
        Node d = new Node("D");
        Node i = new Node("I");
        Node c = new Node("C");
        Node e = new Node("E");
        Node h = new Node("H");
        
        f.setAllChild(new Node[]{b,g});
        b.setAllChild(new Node[]{a,d});
        g.setAllChild(new Node[]{i});
        a.setAllChild(new Node[]{});
        d.setAllChild(new Node[]{c,e});
        i.setAllChild(new Node[]{h});
        c.setAllChild(new Node[]{});
        e.setAllChild(new Node[]{});
        h.setAllChild(new Node[]{});
        
        size = 9;

        System.out.println("FINAL TRAVERSING ORDER: " + BFSTraversal.traverse(f, size));
    
        // // Sec
        // // Create Nodes
        // Node rootNode = new Node("S");

        // Node sNode = new Node("Q");
        
        // Node tNode = new Node("W");

        // Node fNode = new Node("T");

        // Node fiNode = new Node("R");

        // Node siNode = new Node("G");

        // // Set Children
        // rootNode.setAllChild(new Node[] {sNode, tNode, fNode});

        // sNode.setAllChild(new Node[]{fiNode, tNode});

        // tNode.setAllChild(new Node[]{fNode, siNode});

        // fNode.setAllChild(new Node[]{siNode});

        // // siNode, tNode
        // fiNode.setAllChild(new Node[]{ siNode, tNode});

        // siNode.setAllChild(new Node[]{});

        // size = 6;
        // //System.out.println("FINAL TRAVERSING ORDER: " + BFSTraversal.traverse(rootNode, size));
    
        
        // THIRD Problem
        // Node f = new Node("F");
        // Node b = new Node("B");
        // Node g = new Node("G");
        // Node a = new Node("A");
        // Node d = new Node("D");
        // Node i = new Node("I");
        // Node c = new Node("C");
        // Node e = new Node("E");
        // Node h = new Node("H");
        // Node j = new Node("J");
        // Node k = new Node("K");
        // Node l = new Node("L");
        // Node m = new Node("M");

        // a.setAllChild(new Node[]{b,c,d});
        // b.setAllChild(new Node[]{e});
        // c.setAllChild(new Node[]{f,g,h});
        // d.setAllChild(new Node[]{i,j});
        // e.setAllChild(new Node[]{k,l});
        // f.setAllChild(new Node[]{});
        // g.setAllChild(new Node[]{});
        // h.setAllChild(new Node[]{m});
        // i.setAllChild(new Node[]{});
        // j.setAllChild(new Node[]{});
        // k.setAllChild(new Node[]{});
        // l.setAllChild(new Node[]{});
        // m.setAllChild(new Node[]{});
        
        // size = 13;

        // // System.out.println("FINAL TRAVERSING ORDER: " + BFSTraversal.traverse(a, size));

        // Node eig = new Node("8");
        // Node thr = new Node("3");
        // Node ten = new Node("10");
        // Node one = new Node("1");
        // Node six = new Node("6");
        // Node ftn = new Node("14");
        // Node fou = new Node("4");
        // Node sev = new Node("7");
        // Node thn = new Node("13");

        // eig.setAllChild(new Node[]{thr,ten});
        // thr.setAllChild(new Node[]{one, six});
        // ten.setAllChild(new Node[]{ftn});
        // one.setAllChild(new Node[]{});
        // six.setAllChild(new Node[]{fou, sev});
        // ftn.setAllChild(new Node[]{thn});
        // fou.setAllChild(new Node[]{});
        // sev.setAllChild(new Node[]{});
        // thn.setAllChild(new Node[]{});
        
        // size = 9;

        // System.out.println("FINAL TRAVERSING ORDER: " + BFSTraversal.traverse(eig, size));


        
    }

}