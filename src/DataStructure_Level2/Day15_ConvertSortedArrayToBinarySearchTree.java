/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DataStructure_Level2;

/**
 *
 * @author Acer
 */
public class Day15_ConvertSortedArrayToBinarySearchTree {
    
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
    
    public TreeNode createBST(int nums[]){
        int left = 0;
        int right = nums.length-1;
        return createTree(nums, left, right);
    }
    
    public TreeNode createTree(int nums[], int left, int right){
        if(left > right){
            return null;
        }
        int mid = (left+right)/2;
        TreeNode root = new TreeNode(nums[mid]);
        root.left = createTree(nums, left, mid-1);
        root.right = createTree(nums, mid+1, right);
        return root;
    }
    
    public void preOrder(TreeNode root){
        if(root == null){
            return;
        }
        System.out.print(root.val+" ");
        preOrder(root.left);
        preOrder(root.right);
    }
    
    public static void main(String[] args) {
        Day15_ConvertSortedArrayToBinarySearchTree t = new Day15_ConvertSortedArrayToBinarySearchTree();
        int nums[] = {-10,-3, 0, 5, 9};
        TreeNode root = t.createBST(nums);
        t.preOrder(root);
    }
    
}
