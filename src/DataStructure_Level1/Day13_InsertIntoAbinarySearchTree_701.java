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
public class Day13_InsertIntoAbinarySearchTree_701 {
    
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
        TreeNode first = new TreeNode(4);
        TreeNode second = new TreeNode(2);
        TreeNode third = new TreeNode(7);
        TreeNode fourth = new TreeNode(1);
        TreeNode fifth = new TreeNode(3);
        
        root = first;
        first.left = second;
        first.right = third;
        
        second.left = fourth;
        second.right = fifth;
    }
    
    public TreeNode insertBST(TreeNode root, int val){
        if(root == null){
            root = new TreeNode(val);
            return root;
        }
        
        if(root.data > val){
            root.left = insertBST(root.left, val);
        }
        else{
            root.right = insertBST(root.right, val);
        }
        return root;
    }
    
    public static void main(String[] args) {
        Day13_InsertIntoAbinarySearchTree_701 t = new Day13_InsertIntoAbinarySearchTree_701();
        t.createTree();
        t.insertBST(t.root, 5);
    }
    
}
