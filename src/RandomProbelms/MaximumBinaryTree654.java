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
public class MaximumBinaryTree654 {
    
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
    
    public TreeNode constructMaximumBinaryTree(int[] nums) {        
        int left = 0;
        int right = nums.length-1;
        return buildTree(nums, left, right);
    }
    
    //Find The index of Max Number
    public int findMax(int nums[], int left, int right){
        int maxIndex = 0;
        int max = Integer.MIN_VALUE;
        for(int i = left; i <= right; i++){
            if(nums[i] > max){
                max = nums[i];
                maxIndex = i;
            }
        }
        return maxIndex;
    }
    
    public TreeNode buildTree(int nums[], int left, int right){
        if(left > right){
            return null;
        }
        
        int maxIndex = findMax(nums, left, right);
        TreeNode root = new TreeNode(nums[maxIndex]);
        
        root.left = buildTree(nums, left, maxIndex-1);
        root.right = buildTree(nums, maxIndex+1, right);
        
        return root;
    }
    
}
