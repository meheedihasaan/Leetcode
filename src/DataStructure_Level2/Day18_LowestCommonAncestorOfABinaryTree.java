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
public class Day18_LowestCommonAncestorOfABinaryTree {
    
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
        TreeNode sixth = new TreeNode(6);
        TreeNode seventh = new TreeNode(7);
        
        root = first;            //           1
        first.left = second;     //         /    \
        first.right = third;     //       2        3
                                 //     /   \     /   \
        second.left = fourth;    //    4     5   6     7
        second.right = fifth;    //
                                 //
        third.left = sixth;      //
        third.right = seventh;   //
    }
    
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q){
        //If root == null, then return null
        if(root == null){
            return null;
        }     
        
        //If p or q is found then return root
        if(root.val == p.val || root.val == q.val){
            return root;
        }
        
        //Recursive Call for left and right subtree
        TreeNode left = lowestCommonAncestor(root.left, p, q);
        TreeNode right = lowestCommonAncestor(root.right, p, q);
        
        //If left and rigt both are not null then root is the ancestor
        if(left != null && right != null){
            return root;
        }
        
        //If left is not null then return left
        if(left != null){
            return left;
        }
        
        //If right is not null then return right
        if(right != null){
            return right;
        }
        
        //If both are null then return null
        return null;
    }
    
    public static void main(String[] args) {
        
    }
    
}
