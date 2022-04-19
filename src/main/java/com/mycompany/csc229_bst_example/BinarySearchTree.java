package com.mycompany.csc229_bst_example;
/**
 *
 * @author MoaathAlrajab
 */
import java.util.LinkedList;
import java.util.Queue;

public class BinarySearchTree {
    private BstNode root;

    public boolean isEmpty() {
        return (this.root == null);
    }

    public void insert(Integer data) {

        System.out.print("[input: " + data + "]");
        if (root == null) {
            this.root = new BstNode(data);
            System.out.println(" -> inserted: " + data);
            return;
        }
        insertNode(this.root, data);
        System.out.print(" -> inserted: " + data);
        System.out.println();
    }

    private BstNode insertNode(BstNode root, Integer data) {

        BstNode tmpNode = null;
        System.out.print(" ->" + root.getData());
        if (root.getData() >= data) {
            System.out.print(" [L]");
            if (root.getLeft() == null) {
                root.setLeft(new BstNode(data));
                return root.getLeft();
            } else {
                tmpNode = root.getLeft();
            }
        } else {
            System.out.print(" [R]");
            if (root.getRight() == null) {
                root.setRight(new BstNode(data));
                return root.getRight();
            } else {
                tmpNode = root.getRight();
            }
        }
        return insertNode(tmpNode, data);
    }

    public void inOrderTraversal() {
        doInOrder(this.root);
    }

    private void doInOrder(BstNode root) {
        
        if(root == null){
            return;
        }
        doInOrder(root.getLeft());
        System.out.print(root.getData() + " ");
        doInOrder(root.getRight());

        // ToDo 1: complete InOrder Traversal 
    }
    public void preOrderTraversal() {
        doPreOrder(this.root);
        
        // ToDo 2: complete the pre-order travesal . 
    }
    private void doPreOrder(BstNode root) {
        if(root == null){
            return;
        }
        System.out.print(root.getData() + " ");
        doPreOrder(root.getLeft());
        doPreOrder(root.getRight());
            
    }
    public Integer findHeight() {
        return doFindHeight(this.root);

        
    }
    private Integer doFindHeight(BstNode root) {
        
        if(root == null){
            return -1;
        }
        return Math.max(
                doFindHeight(root.getLeft()), 
                doFindHeight(root.getRight()));
    }
    

    public int getDepth(BstNode node) {
        int leftNode = getDepth(node.getLeft());
        int rightNode = getDepth(node.getRight());
        
        if(leftNode < rightNode){
            return rightNode + 1;
        }
        else
            return leftNode + 1;
            
        //ToDo 4: complete getDepth of a node 
    }
    
   public void print() {
       System.out.println("\n==== BST Print ===== \n");
        print("", root, false);
        // ToDo 5: complete the print of the BST
    }

    private void print(String string, BstNode root, boolean b) {
        
    }



    


}
