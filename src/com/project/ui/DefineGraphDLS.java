/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.project.ui;

import java.util.Map;

import javax.swing.JDialog;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

import com.uniformsearchalgorithms.breathfirstsearchalgorithm.algorithm.BreadthFirstSearchAlgorithm;
import com.uniformsearchalgorithms.depthlimitedsearchalgorithm.algorithm.DepthLimitedSearchAlgorithm;
import com.uniformsearchalgorithms.node.Node;

/**
 *
 * @author AHSAN
 */
public class DefineGraphDLS extends javax.swing.JFrame {

    /**
     * Creates new form DefineGraph
     */
    public DefineGraphDLS() {
        initComponents();
        
        // Loading the previous given data
        nodeTF.setText(UI.allNodes);
        childrenGroupTF.setText(UI.allNeighbourgroups);
        UI.isTraversing = (traversingRadioButton.isSelected()) ? true : false;
        depthLimitTF.setText(UI.depthLimit);
        traversingRadioButton.setSelected(true);
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

    	operationButtonGroup = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        nodeLbl = new javax.swing.JLabel();
        nodeTF = new javax.swing.JTextField();
        egNodeLbl = new javax.swing.JLabel();
        childrenGroupsLbl1 = new javax.swing.JLabel();
        childrenGroupTF = new javax.swing.JTextField();
        egChildLbl = new javax.swing.JLabel();
        depthLimitLbl = new javax.swing.JLabel();
        depthLimitTF = new javax.swing.JTextField();
        egNodeLbl2 = new javax.swing.JLabel();
        egNeighbour2Lbl = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        traversingRadioButton = new javax.swing.JRadioButton();
        searchinRButton = new javax.swing.JRadioButton();
        jLabel1 = new javax.swing.JLabel();
        subButton = new javax.swing.JButton();


        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        
        nodeLbl.setText("Enter Node");

        egNodeLbl.setText("Seperate nodes by space e.g. A B C .....");

        childrenGroupsLbl1.setText("Neighbours");

        egChildLbl.setText("Seperate each group of neighbours by a comma & within group ");

        depthLimitLbl.setText("Depth Limit");

        egNodeLbl2.setText("Limit of Depth");

        egNeighbour2Lbl.setText("seperate by space e.g. A,B C,D,E ......");

        jLabel2.setText("Operation");

        operationButtonGroup.add(traversingRadioButton);
        traversingRadioButton.setText("Traversing");

        operationButtonGroup.add(searchinRButton);
        searchinRButton.setText("Searching");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(egNeighbour2Lbl, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(egChildLbl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addComponent(egNodeLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(depthLimitLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(depthLimitTF, javax.swing.GroupLayout.DEFAULT_SIZE, 285, Short.MAX_VALUE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(childrenGroupsLbl1, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(childrenGroupTF, javax.swing.GroupLayout.DEFAULT_SIZE, 279, Short.MAX_VALUE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(nodeLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(nodeTF))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(traversingRadioButton)
                                        .addGap(32, 32, 32)
                                        .addComponent(searchinRButton))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(12, 12, 12)
                                        .addComponent(egNodeLbl2, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(0, 0, Short.MAX_VALUE)))))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nodeLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(nodeTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(egNodeLbl)
                .addGap(37, 37, 37)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(childrenGroupsLbl1, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(childrenGroupTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(egChildLbl)
                .addGap(4, 4, 4)
                .addComponent(egNeighbour2Lbl)
                .addGap(26, 26, 26)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(depthLimitLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(depthLimitTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(egNodeLbl2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 28, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(traversingRadioButton)
                    .addComponent(searchinRButton)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15))
        );

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel1.setText("Define Graph");

        subButton.setText("Submit");
        subButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                subButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(153, 153, 153)
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(151, 151, 151)
                                .addComponent(subButton, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(subButton, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(15, Short.MAX_VALUE))
        );

        pack();
        
        setLocationRelativeTo(null);
        
    }// </editor-fold>//GEN-END:initComponents

    private void subButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_subButtonActionPerformed
       
    	// Updating the List of Nodes and List of NeighbourGroups with latest values
    	UI.allNodes = nodeTF.getText().trim();
    	UI.allNeighbourgroups = childrenGroupTF.getText().trim();
    	UI.depthLimit = depthLimitTF.getText().trim();
    	
//    	UI.isTraversing = (UI.isTraversing == true) ? traversingRadioButton.setSelected(true) : searchinRButton.setSelected(true);
        
	     // Set the Operation type
	     if(UI.isTraversing) {
	      	
	    	 UI.isTraversing = true;
	     }
	      
	     else {
	    	 UI.isTraversing = false;
	     }
    	
    	 // Creating the Window based on List of Selected Algorithms
    	 UI.createWindow(UI.selectedAlgorithmsList);
    	
	    	// Add Children to Nodes
		   	Map<String, Node> children = UI.setChildren(UI.getNodesListOfNode(UI.getNodesListOfString(UI.allNodes)),UI.allNeighbourgroups, UI.getNodesListOfString(UI.allNodes));
		   	
		   	int totalNodes = children.size();
		
		   	int depthLevel = Integer.parseInt(UI.depthLimit);		

		   	// Display Result in Dialogue Box
	   		if(traversingRadioButton.isSelected()) {
	   			
	   			UI.displayResult(DepthLimitedSearchAlgorithm.traverse(children.get(UI.getNodesListOfString(UI.allNodes)[0]), totalNodes, depthLevel));	
	   		}
	   		else {
	   			UI.goalState = JOptionPane.showInputDialog("Enter Goal State");
	   			UI.displayResult(DepthLimitedSearchAlgorithm.search(children.get(UI.getNodesListOfString(UI.allNodes)[0]), totalNodes, depthLevel, UI.goalState));
	   		}
		   	
	    	
	    	return;
    }//GEN-LAST:event_subButtonActionPerformed

    private void formWindowClosing(java.awt.event.WindowEvent evt) {                                   
    	
    	// Creating the Window of operation based on List of Selected Algorithms
    	UI.createWindow(UI.selectedAlgorithmsList);
        System.out.println("You are Champion!");
    }  
    // Variables declaration - do not modify                     
    private javax.swing.JTextField childrenGroupTF;
    private javax.swing.JLabel childrenGroupsLbl1;
    private javax.swing.JLabel depthLimitLbl;
    private javax.swing.JTextField depthLimitTF;
    private javax.swing.JLabel egChildLbl;
    private javax.swing.JLabel egNeighbour2Lbl;
    private javax.swing.JLabel egNodeLbl;
    private javax.swing.JLabel egNodeLbl2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel nodeLbl;
    private javax.swing.JTextField nodeTF;
    private javax.swing.JRadioButton searchinRButton;
    private javax.swing.JButton subButton;
    private javax.swing.JRadioButton traversingRadioButton;
    private javax.swing.ButtonGroup operationButtonGroup;
    // End of variables declaration  
}
