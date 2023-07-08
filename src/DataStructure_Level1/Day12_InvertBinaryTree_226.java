/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DataStructure_Level1;

/**
 *
 * @author Acer
 */
public class Day12_InvertBinaryTree_226 {
    
    TreeNode root;
    class TreeNode{
        int data;
        TreeNode left;
        TreeNode right;
        TreeNode(){
        
        }
        TreeNode(int data){
            this.data = data;
        }
        TreeNode(int data, TreeNode left, TreeNode right){
            this.data = data;
            this.left = left;
            this.right = right;
        }
    }
    
    public void createTree(){
        TreeNode first = new TreeNode(1);
        TreeNode second = new TreeNode(2);
        TreeNode third = new TreeNode(3);
        TreeNode fourth = new TreeNode(4);
        TreeNode fifth = new TreeNode(5);
        TreeNode sixth = new TreeNode(6);
        TreeNode seventh = new TreeNode(7);
        TreeNode eighth = new TreeNode(8);
        TreeNode ninth = new TreeNode(9);
        
        root = first;            //              1
        first.left = second;     //          /       \
        first.right = third;     //         2         3
                                 //       /   \     /   \
        second.left = fourth;    //      4     5   6     7
        second.right = fifth;    //
                                 //
        third.left = sixth;      //
        third.right = seventh;   //
        
        fourth.left = eighth;
        fourth.right = ninth;
    }
    
    public TreeNode invertTree(TreeNode root){
        invert(root);
        return root;
    }
    
    public void invert(TreeNode root){
        if(root == null){
            return;
        }
        
        //Traverse The Left SubTree
        invert(root.left);
        
        //Traverse The Right SubTree
        invert(root.right);
        
        //Swap the left and right
        TreeNode temp = root.left;
        root.left = root.right;
        root.right = temp;
    }
    
    public void PreOrder(TreeNode root){
        if(root == null){
            return;
        }
        
        System.out.print(root.data+" ");
        PreOrder(root.left);
        PreOrder(root.right);
    }
    
    public static void main(String[] args) {
        Day12_InvertBinaryTree_226 t = new Day12_InvertBinaryTree_226();
        t.createTree();
        t.invertTree(t.root);
        t.PreOrder(t.root);
    }
    
}
