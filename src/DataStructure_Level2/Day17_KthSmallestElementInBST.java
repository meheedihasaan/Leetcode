/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DataStructure_Level2;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Acer
 */
public class Day17_KthSmallestElementInBST {
    
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
        
        root = first;
        first.left = second; //         1
        first.right = third; //        | |
                             //       2   3
        second.left = fourth;//       |
        second.right = fifth;//     4   5
    }
    
    public int smallest(TreeNode root, int k){
        List<Integer> list = new ArrayList<>();
        preOrder(root, list);
        return list.get(k-1);
    }
    
    public void preOrder(TreeNode root, List<Integer> list){
        if(root == null){
            return;
        }
        
        list.add(root.val);
        preOrder(root.left, list);
        preOrder(root.right, list);
    }
    
    public static void main(String[] args) {
        Day17_KthSmallestElementInBST t = new Day17_KthSmallestElementInBST();
        t.createBinaryTree();
        System.out.println(t.smallest(t.root, 1));
    }
    
}
