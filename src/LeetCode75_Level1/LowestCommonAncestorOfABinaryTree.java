/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LeetCode75_Level1;

/**
 *
 * @author Acer
 */
public class LowestCommonAncestorOfABinaryTree {
    
    TreeNode root;
    static class TreeNode{
        int data;
        TreeNode left;
        TreeNode right;
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
        TreeNode first = new TreeNode(3);
        TreeNode second = new TreeNode(5);
        TreeNode third = new TreeNode(1);
        TreeNode fourth = new TreeNode(6);
        TreeNode fifth = new TreeNode(2);
        TreeNode sixth = new TreeNode(0);
        TreeNode seventh = new TreeNode(8);
        TreeNode eighth = new TreeNode(7);
        TreeNode ninth = new TreeNode(4);
        
        root = first;
        first.left = second;
        first.right = third;
        
        second.left = fourth;
        second.right = fifth;
        
        third.left = sixth;
        third.right = seventh;
        
        fifth.left = eighth;
        fifth.right = ninth;
    }
    
    public TreeNode LCA(TreeNode root, TreeNode p, TreeNode q){
        //If root is null then return null
        if(root == null){
            return null;
        }
        
        //If p or q is found then return those particular p or q
        if(root.data == p.data || root.data == q.data){
            return root;
        }
        
        //InOrder Recursive Call
        TreeNode leftLCA = LCA(root.left, p, q);
        TreeNode rightLCA = LCA(root.right, p, q);
        
        //If leftLCA and rightLCA both are not null then simply 
        if(leftLCA != null && rightLCA != null){
            return root;
        }
        
        //If leftLCA is not null then return leftLCA
        if(leftLCA != null){
            return leftLCA;
        }
        
        //If rightLCA is not null then return rightLCA
        if(rightLCA != null){
            return rightLCA;
        }
        
        //If leftLCA and rightLCA both are null then return null
        return null;
    }
    
    public static void main(String[] args) {
        LowestCommonAncestorOfABinaryTree t = new LowestCommonAncestorOfABinaryTree();
        t.createTree();
        TreeNode p = new TreeNode(7);
        TreeNode q = new TreeNode(5);
        TreeNode ans = t.LCA(t.root, p, q);
        System.out.println(ans.data);
    }
    
}
