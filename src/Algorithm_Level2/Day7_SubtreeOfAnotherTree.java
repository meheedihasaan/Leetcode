/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Algorithm_Level2;

/**
 *
 * @author Acer
 */
public class Day7_SubtreeOfAnotherTree {
    
    TreeNode root;
    class TreeNode{
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode next;
        TreeNode(){
            
        }
        TreeNode(int val){
            this.val = val;
        }
        
        TreeNode(int val, TreeNode left, TreeNode right, TreeNode next){
            this.val = val;
            this.left = left;
            this.right = right;
            this.next = next;
        }
    }
    
    public boolean isSubtree(TreeNode root, TreeNode subRoot){
        if(root == null){
            return false;
        }
        
        if(isSame(root, subRoot)){
            return true;
        }
        
        boolean left = isSubtree(root.left, subRoot);
        boolean right = isSubtree(root.right, subRoot);
        
        return left || right;
    }
    
    public boolean isSame(TreeNode root, TreeNode subRoot){
        if(root == null && subRoot == null){
            return true;
        }
        
        if(root == null || subRoot == null){
            return false;
        }
        
        if(root.val != subRoot.val){
            return false;
        }
        
        boolean left = isSame(root.left, subRoot.left);
        boolean right = isSame(root.right, subRoot.right);
        
        return left && right;
    }
    
}
