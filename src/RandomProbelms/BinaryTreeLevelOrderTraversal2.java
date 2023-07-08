/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package RandomProbelms;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 *
 * @author Acer
 */
public class BinaryTreeLevelOrderTraversal2 {
    
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
    
    public void createTree(){
        TreeNode first = new TreeNode(1);
        TreeNode second = new TreeNode(2);
        TreeNode third = new TreeNode(3);
        TreeNode fourth = new TreeNode(4);
        TreeNode fifth = new TreeNode(5);
        TreeNode sixth = new TreeNode(6);
        TreeNode seventh = new TreeNode(7);
        
        root = first;
        first.left = second;
        first.right = third;
        second.left = fourth;
        second.right = fifth;
        third.left = sixth;
        third.right = seventh;
    }
    
    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        List<List<Integer>> ans = new ArrayList<>();
        levelOrder(root, ans);
        Collections.reverse(ans);
        return ans;
    }
    
    public void levelOrder(TreeNode root, List<List<Integer>> ans){
        if(root == null){
            return;
        }
        
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        while(!queue.isEmpty()){
            List<Integer> innerList = new ArrayList<>();
            int size = queue.size();
            for(int i = 0; i < size; i++){
                TreeNode temp = queue.poll();
                innerList.add(temp.val);
                if(temp.left != null){
                    queue.offer(temp.left);
                }
                
                if(temp.right != null){
                    queue.offer(temp.right);
                }
            }
            ans.add(innerList);
        }
    }
    
    public static void main(String[] args) {
        BinaryTreeLevelOrderTraversal2 b = new BinaryTreeLevelOrderTraversal2();
        b.createTree();
        
        System.out.println(b.levelOrderBottom(b.root));
    }
    
}
