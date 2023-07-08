/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Daily_Challenge;

/**
 *
 * @author Acer
 */
public class CountGoodNodeInBinaryTree_1448 {
    
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
        TreeNode first = new TreeNode(3);
        TreeNode second = new TreeNode(1);
        TreeNode third = new TreeNode(4);
        TreeNode fourth = new TreeNode(3);
        TreeNode fifth = new TreeNode(1);
        TreeNode sixth = new TreeNode(5);
        
        root = first;
        first.left = second;
        first.right = third;
        
        second.left = fourth;
        third.left = fifth;
        third.right = sixth;
    }
    
    public int ans = 0;
    public int goodNodes(TreeNode root){
        int prev = Integer.MIN_VALUE;
        good(root, prev);
        return ans;
    }
    
    public void good(TreeNode root, int prev){
        if(root == null){
            return;
        }
        
        if(root.data >= prev){
            ans++;
            prev = root.data;
        }
        
        good(root.left, prev);
        good(root.right, prev);
    } 
    
    public static void main(String[] args) {
        CountGoodNodeInBinaryTree_1448 t = new CountGoodNodeInBinaryTree_1448();
        t.createTree();
        System.out.println(t.goodNodes(t.root));
    }
    
}
