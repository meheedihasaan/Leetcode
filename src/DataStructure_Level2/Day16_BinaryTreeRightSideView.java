/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DataStructure_Level2;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 *
 * @author Acer
 */
public class Day16_BinaryTreeRightSideView {
    
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
    
    public List<Integer> rightView(TreeNode root){
        List<Integer> ans = new ArrayList<>();
        levelOrder(root, ans);
        return ans;
    }
    
    public void levelOrder(TreeNode root, List<Integer> ans){
        if(root == null){
            return;
        }
        
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        while(!queue.isEmpty()){
            List<Integer> innerList = new ArrayList<>();
            int size = queue.size();
            for (int i = 0; i < size; i++) {
                TreeNode temp = queue.poll();
                innerList.add(temp.val);
                if(temp.left != null){
                    queue.offer(temp.left);
                }
                
                if(temp.right != null){
                    queue.offer(temp.right);
                }
            }
            ans.add(innerList.get(innerList.size()-1));
        }
    }
    
    public static void main(String[] args) {
        Day16_BinaryTreeRightSideView t = new Day16_BinaryTreeRightSideView();
        t.createBinaryTree();
        System.out.println(t.rightView(t.root));
    }
    
}
