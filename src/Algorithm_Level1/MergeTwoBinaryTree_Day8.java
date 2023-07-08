/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Algorithm_Level1;

/**
 *
 * @author Acer
 */
public class MergeTwoBinaryTree_Day8 {
    
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
    
    public TreeNode mergeTree(TreeNode root1, TreeNode root2){
        return Merge(root1, root2);
    }
    
    //Approach 1
    public TreeNode Merge(TreeNode root1, TreeNode root2){
        //If root1 is empty then return root2
        if(root1 == null){
            return root2;
        }
        
        //If root2 is empty then return root1
        if(root2 == null){
            return root1;
        }
        
        //If both are non-empty then add their value and build left and right subtree
        root1.val+=root.val;
        root1.left = Merge(root1.left, root2.left);
        root1.right = Merge(root1.right, root.right);
        
        return root;
    }
    
    public TreeNode merge(TreeNode root1, TreeNode root2){
        if(root1 == null && root2 == null){
            return null;
        }
        
        TreeNode root;
        if(root1 != null && root2 == null){
            root = new TreeNode(root1.val);
            root.left = merge(root1.left, null);
            root.right = merge(root1.right, null);
        }
        else if(root1 == null && root2 != null){
            root = new TreeNode(root2.val);
            root.left = merge(null, root2.left);
            root.right = merge(null, root2.right);
        }
        else{
            int val = root1.val+root2.val;
            root = new TreeNode(val);
            root.left = merge(root1.left, root2.left);
            root.right = merge(root1.right, root2.right);
        }
        return root;
    }
    
}
