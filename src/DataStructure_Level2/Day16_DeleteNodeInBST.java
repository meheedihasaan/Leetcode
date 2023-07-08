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
public class Day16_DeleteNodeInBST {
    
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
    
    public void createBinaryTree(){
        TreeNode first = new TreeNode(1);
        TreeNode second = new TreeNode(2);
        TreeNode third = new TreeNode(3);
        TreeNode fourth = new TreeNode(4);
        TreeNode fifth = new TreeNode(5);
        
        root = first;
        first.left = second; //         1
        first.right = third; //        | |
                             //       2   3
        second.left = fourth;//       |
        second.right = fifth;//     4   5
    }
    
    public TreeNode deleteNode(TreeNode root, int key){
        if(root == null){
            return null;
        }
        
        if(root.val > key){
            root.left = deleteNode(root.left, key);
        }
        else if(root.val < key){
            root.right = deleteNode(root.right, key);
        }
        else if(root.val == key){
            if(root.left == null && root.right == null){
                return null;
            }
            else if(root.left == null || root.right == null){
                if(root.left == null){
                    return root.right;
                }
                else{
                    return root.left;
                }
            }
            else{
                int rightMin = minimumRight(root.right);
                root.val = rightMin;
                root.right = deleteNode(root.right, rightMin);
            }
        }
        return root;
    }
    
    public int minimumRight(TreeNode root){
        int min = root.val;
        while(root != null){
            min = root.val;
            root = root.left;            
        }
        return min;
    }
    
}
