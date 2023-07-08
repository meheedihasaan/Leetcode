/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DataStructure_Level2;

import java.util.HashMap;

/**
 *
 * @author Acer
 */
public class Day15_ConstructBinaryTreeFromInorderAndPreOrderTraversal {
    
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
    
    HashMap<Integer, Integer> map = new HashMap<>();
    int preIndex = 0;
    public TreeNode buildTree(int[] preorder, int[] inorder){
        for (int i = 0; i < inorder.length; i++) {
            map.put(inorder[i], i);
        }
        
        int left = 0, right = preorder.length-1;
        return createTree(preorder, inorder, left, right);
    }
    
    public TreeNode createTree(int preorder[], int inorder[], int left, int right){
        if(left > right){
            return null;
        }
        
        TreeNode root = new TreeNode(preorder[preIndex++]);
        int index = map.get(root.val);
        
        //Recursive Call To Build left Subtree and Right Subtree
        root.left = createTree(preorder, inorder, left, index-1);
        root.right = createTree(preorder, inorder, index+1, right);
        
        return root;
    }
    
    public static void main(String[] args) {
        int preorder[] = {3,9,20,15,7};
        int inorder[] = {9,3,15,20,7};
        Day15_ConstructBinaryTreeFromInorderAndPreOrderTraversal t = new Day15_ConstructBinaryTreeFromInorderAndPreOrderTraversal();
        t.buildTree(preorder, inorder);
    }
    
}
