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
public class Day12_PathSum_112 {
    
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
        TreeNode first = new TreeNode(1);
        TreeNode second = new TreeNode(2);
        TreeNode third = new TreeNode(3);
        TreeNode fourth = new TreeNode(4);
        TreeNode fifth = new TreeNode(5);
        TreeNode sixth = new TreeNode(6);
        TreeNode seventh = new TreeNode(7);
        
        root = first;            //              1
        first.left = second;     //          /       \
        first.right = third;     //         2         3
                                 //       /   \     /   \
        second.left = fourth;    //      4     5   6     7
        second.right = fifth;    //
                                 //
        third.left = sixth;      //
        third.right = seventh;   //
    }
    
    public boolean hasPathSum(TreeNode root, int targetSum){
        if(root == null){
            return false;
        }
        
        //Decrease targetSum
        targetSum-=root.data;
        
        //If targetSum becomes zero and current root is the leaf then return true
        if(root.left == null && root.right == null && targetSum == 0){
            return true;
        }
        
        //Traverse the left subtree
        boolean left = hasPathSum(root.left, targetSum);
        //Traverse the rigth subtree
        boolean right = hasPathSum(root.right, targetSum);
        
        //Return true if any of left or right is true
        if(left || right){
            return true;
        }
        return false;
    }
    
    public static void main(String[] args) {
        Day12_PathSum_112 t = new Day12_PathSum_112();
        t.createTree();
        System.out.println(t.hasPathSum(t.root, 15));
    }
    
}
