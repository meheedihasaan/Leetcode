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
public class Day13_SearchInABinarySearchTree_700 {
    
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
        TreeNode first = new TreeNode(4);
        TreeNode second = new TreeNode(2);
        TreeNode third = new TreeNode(7);
        TreeNode fourth = new TreeNode(1);
        TreeNode fifth = new TreeNode(3);
        
        root = first;
        first.left = second;
        first.right = third;
        
        second.left = fourth;
        second.right = fifth;
    }
    
    public TreeNode searchBST(TreeNode root, int val){
        if(root == null){
            return root;
        }
        
        if(root.data == val){
            return root;
        }
        
        if(root.data > val){
            return searchBST(root.left, val);
        }
        else{
            return searchBST(root.right, val);
        }
    }
    
    public static void main(String[] args) {
        Day13_SearchInABinarySearchTree_700 t = new Day13_SearchInABinarySearchTree_700();
        t.createTree();
        System.out.println(t.searchBST(t.root, 2));
    }
    
}
