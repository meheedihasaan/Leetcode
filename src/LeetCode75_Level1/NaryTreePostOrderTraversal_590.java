/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LeetCode75_Level1;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Acer
 */
public class NaryTreePostOrderTraversal_590 {
    
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
    
    public List<Integer> postOrder(TreeNode root){
        List<Integer> ans = new ArrayList<>();
        traverse(root, ans);
        return ans;
    }
    
    public void traverse(TreeNode root, List<Integer> ans){
        if(root == null){
            return;
        }
        
        for (TreeNode child : root.children) {
            traverse(child, ans);
        }
        ans.add(root.data);
    }
    
    public static void main(String[] args) {
        NaryTreePostOrderTraversal_590 t = new NaryTreePostOrderTraversal_590();
        t.createTree();
        
        List<Integer> ans = t.postOrder(t.root);
        System.out.println(ans);
    }
    
}
