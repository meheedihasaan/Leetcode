/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DataStructure_Level1;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

/**
 *
 * @author Acer
 */
public class Day14_TwoSumIV_InputIsBST_653 {
    
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
        TreeNode first = new TreeNode(5);
        TreeNode second = new TreeNode(3);
        TreeNode third = new TreeNode(6);
        TreeNode fourth = new TreeNode(2);
        TreeNode fifth = new TreeNode(4);
        TreeNode sixth = new TreeNode(7);
        
        root = first;
        first.left = second;
        first.right = third;
        
        second.left = fourth;
        second.right = fifth;
        third.right = sixth;
    }
    
    public boolean findTarget(TreeNode root, int k) {
        List<Integer> list = new ArrayList<>();
        PreOrder(root, list);
        
        HashSet<Integer> set = new HashSet<>();
        for(int i = 0; i < list.size(); i++){
            int x = k-list.get(i);
            if(set.contains(x)){
                return true;
            }
            else{
                set.add(list.get(i));
            }
        }
        return false;
    }
    
    public static void PreOrder(TreeNode root, List<Integer> list){
        if(root == null){
            return;
        }
        
        list.add(root.data);
        PreOrder(root.left, list);
        PreOrder(root.right, list);
    }
    
    public static void main(String[] args) {
        Day14_TwoSumIV_InputIsBST_653 t = new Day14_TwoSumIV_InputIsBST_653();
        t.createTree();
        System.out.println(t.findTarget(t.root, 11));
    }
    
}
