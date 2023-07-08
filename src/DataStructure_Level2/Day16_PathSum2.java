/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DataStructure_Level2;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Acer
 */
public class Day16_PathSum2 {
    
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
    
    public List<List<Integer>> pathSum(TreeNode root, int targetSum){
        List<List<Integer>> ans = new ArrayList<>();
        helper(root, targetSum, ans);
        return ans;
    }
    
    List<Integer> innerList = new ArrayList<>();
    public void helper(TreeNode root, int targetSum, List<List<Integer>> ans){
        if(root == null){
            return;
        }
        
        innerList.add(root.val);
        targetSum-=root.val;
        if(targetSum == 0 && root.left == null && root.right == null){
            ans.add(new ArrayList<>(innerList));
        }
        
        //Recursive Call For Left and Right Subtree
        helper(root.left, targetSum, ans);
        helper(root.right, targetSum, ans);
        
        //When path ends but targetSum not found then remove the last inserted value
        innerList.remove(innerList.size()-1);
    }
    
    public static void main(String[] args) {
        Day16_PathSum2 t = new Day16_PathSum2();
        t.createBinaryTree();
        System.out.println(t.pathSum(t.root, 7));
    }
    
}
