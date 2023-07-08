/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package RandomProbelms;

/**
 *
 * @author Acer
 */
public class SameTree {
    
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
    
    public boolean isSame(TreeNode p, TreeNode q){
        if(p == null && q != null){
            return false;
        }
        
        if(p != null && q == null){
            return false;
        }
        
        if(p.val != q.val){
            return false;
        }
        
        if(p == null && q == null){
            return true;
        }
        
        boolean left = isSame(p.left, q.left);
        boolean right = isSame(p.right, q.right);
        return left && right;
    }
    
}
