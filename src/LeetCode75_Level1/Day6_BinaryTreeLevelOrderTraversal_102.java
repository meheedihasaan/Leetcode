/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LeetCode75_Level1;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

/**
 *
 * @author Acer
 */
public class Day6_BinaryTreeLevelOrderTraversal_102 {
    
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
        
        root = first;            //              1
        first.left = second;     //          /       \
        first.right = third;     //         2         3
                                 //       /   \     /   \
        second.left = fourth;    //      4     5   6     7
        second.right = fifth;    //
                                 //
        third.left = sixth;      //
        third.right = seventh;   //
    }
    
    public static ArrayList<ArrayList<Integer>> LevelOrder(TreeNode root){
        ArrayList<ArrayList<Integer>> list = new ArrayList<>();
        levelOrder(root, list);
        return list;
    }
    
    public static void levelOrder(TreeNode root, ArrayList<ArrayList<Integer>> list){
        if(root== null){
            return;
        }
        Queue<TreeNode> queue = new LinkedList<TreeNode>();
        queue.offer(root);
        while(!queue.isEmpty()){
            int size = queue.size();
            ArrayList<Integer> innerList = new ArrayList<>();
            for (int i = 0; i < size; i++) {
                TreeNode temp = queue.poll();
                innerList.add(temp.data);
                if(temp.left != null){
                    queue.offer(temp.left);
                }
                if(temp.right != null){
                    queue.offer(temp.right);
                }
            }
            list.add(innerList);
        }
    }
    
    public static void main(String[] args) {
        Day6_BinaryTreeLevelOrderTraversal_102 t = new Day6_BinaryTreeLevelOrderTraversal_102();
        t.createTree();
        System.out.println(LevelOrder(t.root));;
    }
    
}
