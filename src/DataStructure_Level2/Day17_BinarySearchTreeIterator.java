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
public class Day17_BinarySearchTreeIterator {
    
    static TreeNode root;
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

    List<Integer> list = new ArrayList<>();
    int it = 0;
    public Day17_BinarySearchTreeIterator(TreeNode root) {
        inOrder(root, list);
    }
    
    public void inOrder(TreeNode root, List<Integer> list){
        if(root == null){
            return;
        }
        
        inOrder(root.left, list);
        list.add(root.val);
        inOrder(root.right, list);
    }
    
    public int next() {
        int x = list.get(it);
        it++;
        return x;
    }
    
    public boolean hasNext() {
        if(it < list.size()){
            return true;
        }
        return false;
    }

}
