/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DataStructure_Level2;

import java.util.LinkedList;
import java.util.Queue;

/**
 *
 * @author Acer
 */
public class Day18_SerializeAndDeserializeBinaryTree {
    
    TreeNode root;
    class TreeNode{
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(){
            
        }
        TreeNode(int val){
            this.val = val;
        }
        TreeNode(int val, TreeNode left, TreeNode right){
            this.val = val;
            this.left = left;
            this.right = right;
        }       
    }
    
    public void createBinaryTree(){
        TreeNode first = new TreeNode(1);
        TreeNode second = new TreeNode(2);
        TreeNode third = new TreeNode(3);
        TreeNode fourth = new TreeNode(4);
        TreeNode fifth = new TreeNode(5);
        TreeNode sixth = new TreeNode(6);
        TreeNode seventh = new TreeNode(7);
        
        root = first;            //           1
        first.left = second;     //         /    \
        first.right = third;     //       2        3
                                 //     /   \     /   \
        second.left = fourth;    //    4     5   6     7
        second.right = fifth;    //
                                 //
        third.left = sixth;      //
        third.right = seventh;   //
    }
    
    // Encodes a tree to a single string.
    String s = "";
    public String serialize(TreeNode root){
        preOrder(root);
        return s;
    }
    
    public void preOrder(TreeNode root){
        if(root == null){
            s+="#"+",";
            return;
        }
        
        s+=String.valueOf(root.val)+",";
        preOrder(root.left);
        preOrder(root.right);
    }
    
    // Decodes String to Binary Tree
    public TreeNode deserialize(String data){
        String arr[] = data.split(",");
        Queue<String> queue = new LinkedList<>();
        return buildTree(queue);
    }
    
    public TreeNode buildTree(Queue<String> queue){
        if(queue.isEmpty()){
            return null;
        }
        
        String temp = queue.poll();
        if(temp.equals("#")){
            return null;
        }
        
        TreeNode root = new TreeNode(Integer.parseInt(temp));
        
        root.left = buildTree(queue);
        root.right = buildTree(queue);
        
        return root;
    }
    
    public static void main(String[] args) {
        Day18_SerializeAndDeserializeBinaryTree t = new Day18_SerializeAndDeserializeBinaryTree();
        t.createBinaryTree();
        System.out.println(t.serialize(t.root));
    }
    
}
