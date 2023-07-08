/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LeetCode75_Level1;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 *
 * @author Acer
 */
public class Day6_NaryTreePreorderTraversal_589 {
    
    TreeNode root;
    class TreeNode{
        int data;
        List<TreeNode> child = new LinkedList<TreeNode>();
        
        TreeNode(){
            
        }
        
        TreeNode(int data){
            this.data = data;
        }
        
        TreeNode(int data, List<TreeNode> child){
            this.data = data;
            this.child = child;
        }
    }
    
    public void createTree(){
        TreeNode first = new TreeNode(1);
        TreeNode second = new TreeNode(3);
        TreeNode third = new TreeNode(2);
        TreeNode fourth = new TreeNode(4);
        TreeNode fifth = new TreeNode(5);
        TreeNode sixth = new TreeNode(6);
        
        root = first;
        
        root.child.add(second);
        root.child.add(third);
        root.child.add(fourth);
        
        root.child.get(0).child.add(fifth);
        root.child.get(0).child.add(sixth);
    }
    
    public List<Integer> traverse(TreeNode root){
        ArrayList<Integer> list = new ArrayList<>();
        preOrder(root, list);
        return list;
    }
    
    public static void preOrder(TreeNode root, ArrayList<Integer> list){
        if(root == null){
            return;
        }
        list.add(root.data);
        for (TreeNode temp : root.child) {
            preOrder(temp, list);
        }
    }
    
    public static void main(String[] args) {
        Day6_NaryTreePreorderTraversal_589 t = new Day6_NaryTreePreorderTraversal_589();
        t.createTree();
        List<Integer> ans = t.traverse(t.root);
        System.out.println(ans);
    }
    
}
