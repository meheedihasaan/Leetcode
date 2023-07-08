/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DataStructure_Level1;

/**
 *
 * @author Acer
 */
public class Day14_LowestCommonAncestorOfABinarySearchTree_235 {
    
    TreeNode root;
    public static class TreeNode{
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
        TreeNode first = new TreeNode(6);
        TreeNode second = new TreeNode(2);
        TreeNode third = new TreeNode(8);
        TreeNode fourth = new TreeNode(0);
        TreeNode fifth = new TreeNode(4);
        TreeNode sixth = new TreeNode(7);
        TreeNode seventh = new TreeNode(9);
        TreeNode eighth = new TreeNode(3);
        TreeNode ninth = new TreeNode(5);
        
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
    
    public TreeNode LCA(TreeNode root, TreeNode node1, TreeNode node2){
        if(root.data > node1.data && root.data > node2.data){
            return LCA(root.left, node1, node2);
        }
        else if(root.data < node1.data && root.data < node2.data){
            return LCA(root.right, node1, node2);
        }
        return root;
    }
    
    public static void main(String[] args) {
        Day14_LowestCommonAncestorOfABinarySearchTree_235 t = new Day14_LowestCommonAncestorOfABinarySearchTree_235();
        t.createTree();
        
        TreeNode n1 = new TreeNode(3);
        TreeNode n2 = new TreeNode(7);
        TreeNode lca = t.LCA(t.root, n1, n2);
        System.out.println(lca.data);
    }
    
}
