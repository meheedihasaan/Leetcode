/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DataStructure_Level1;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Acer
 */
public class Day10_BinaryTreeLevelorderTraversal_94 {
    
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
    
    public static List<Integer> inorder(TreeNode root){
        List<Integer> list = new ArrayList<>();
        InOrder(root, list);
        return list;
    }
    
    public static void InOrder(TreeNode root, List<Integer> ans){
        if(root== null){
            return;
        }
        InOrder(root.left, ans);
        ans.add(root.data);
        InOrder(root.right, ans);
    }
    
    public static void main(String[] args) {
        Day10_BinaryTreeLevelorderTraversal_94 t = new Day10_BinaryTreeLevelorderTraversal_94();
        t.createTree();
        System.out.println(inorder(t.root));
    }
}
