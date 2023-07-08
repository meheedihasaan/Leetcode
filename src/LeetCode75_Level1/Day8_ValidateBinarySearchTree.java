/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LeetCode75_Level1;

import java.util.Stack;

/**
 *
 * @author Acer
 */
public class Day8_ValidateBinarySearchTree {
    
    TreeNode root;
    
    class TreeNode{
        int data;
        TreeNode left;
        TreeNode right;

        TreeNode() {
        }
        
        TreeNode(int data){
            this.data = data;
        }

        TreeNode(int data, TreeNode left, TreeNode right) {
            this.data = data;
            this.left = left;
            this.right = right;
        }       
    }
    
    public void createTree(){
        TreeNode first = new TreeNode(5);
        TreeNode second = new TreeNode(1);
        TreeNode third = new TreeNode(4);
        TreeNode fourth = new TreeNode(3);
        TreeNode fifth = new TreeNode(6);
        
        root = first;
        first.left = second;
        first.right = third;
        
        third.left = fourth;
        third.right = fifth;
    }
    
    public boolean isValid(TreeNode root){       
        long min = Long.MIN_VALUE;
        long max = Long.MAX_VALUE;
        return validate(root, min, max);
    }
    
    public boolean validate(TreeNode root, long min, long max){
        if(root == null){
            return true;
        }
        
        if(root.data <= min || root.data >= max){
            return false;
        }
        
        boolean left = validate(root.left, min, root.data);
        if(left){
            boolean right = validate(root.right, root.data, max);
            return right;
        }
        return false;
    }
    
    public static void main(String[] args) {
        Day8_ValidateBinarySearchTree bt = new Day8_ValidateBinarySearchTree();
        bt.createTree();
        System.out.println(bt.isValid(bt.root));
    }
    
}
