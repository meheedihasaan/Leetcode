/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LeetCode75_Level1;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 *
 * @author Acer
 */
public class NaryTreeLevelOrderTraversal {
    
    TreeNode root;
    class TreeNode{
        int data;
        List<TreeNode> children = new ArrayList<>();
        TreeNode(int data){
            this.data = data;
        }
        
        TreeNode(int data, List<TreeNode> children){
            this.data = data;
            this.children = children;
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
        root.children.add(second);
        root.children.add(third);
        root.children.add(fourth);
        
        root.children.get(0).children.add(fifth);
        root.children.get(0).children.add(sixth);
    }
    
    public List<List<Integer>> levelOrder(TreeNode root){
        List<List<Integer>> ans = new ArrayList<>();
        traverse(root, ans);
        return ans;
    }
    
    public void traverse(TreeNode root, List<List<Integer>> ans){
        if(root == null){
            return;
        }
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        while(!queue.isEmpty()){
            List<Integer> innerList = new ArrayList<>();
            int size = queue.size();
            for (int i = 0; i < size; i++) {
                TreeNode temp = queue.poll();
                innerList.add(temp.data);
                for (TreeNode child : temp.children) {
                    queue.offer(child);
                }
            }
            ans.add(innerList);
        }        
    }
    
    public static void main(String[] args) {
        NaryTreeLevelOrderTraversal t = new NaryTreeLevelOrderTraversal();
        t.createTree();
        
        List<List<Integer>> ans = t.levelOrder(t.root);
        System.out.println(ans);
    }
    
}
