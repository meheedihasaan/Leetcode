/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package RandomProbelms;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Acer
 */
public class BinaryTreePaths {
    
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
        
        root = first;
        root.left = second;
        root.right = third;
        
        second.left = fourth;
        second.right = fifth;
        
        third.left = sixth;
        third.right = seventh;
    }
    
    public List<String> treePaths(TreeNode root){
        List<String> ans = new ArrayList<>();
        preOrder(root, ans, "");
        return ans;
    }
    
    public void preOrder(TreeNode root, List<String> ans, String s){
        if(root == null){
            return;
        }
        
        s+=String.valueOf(root.val);
        if(root.left == null && root.right == null){
            ans.add(s);
        }
        
        if(root.left != null){
            preOrder(root.left, ans, s+"->");
        }
        
        if(root.right != null){
            preOrder(root.right, ans, s+"->");
        }
    }
    
    public static void main(String[] args) {
        BinaryTreePaths t = new BinaryTreePaths();
        t.createBinaryTree();
        System.out.println(t.treePaths(t.root));
    }
    
}
