/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package RandomProbelms;

import java.util.LinkedList;
import java.util.Queue;

/**
 *
 * @author Acer
 */
public class MinimumDepthofABinaryTree {
    
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
    
    public int minimumLength(TreeNode root){
        int minLength = levelOrder(root);
        return minLength;
    }
    
    public int levelOrder(TreeNode root){
        if(root == null){
            return 0;
        }
        
        int level = 0;
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        while(queue.isEmpty()){
            level++;
            int size = queue.size();
            for (int i = 0; i < size; i++) {
                TreeNode temp = queue.poll();
                //If temp is the last node of a path, then it's level is the minimum depth
                if(temp.left == null && temp.right == null){
                    return level;
                }
                
                if(temp.left != null){
                    queue.offer(temp.left);
                }                
                if(temp.right != null){
                    queue.offer(temp.right);
                }
            }
        }
        return level;
    }
    
}
