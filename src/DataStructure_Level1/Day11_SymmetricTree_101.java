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
public class Day11_SymmetricTree_101 {
    
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
    
    public boolean isSymmetric(TreeNode root){
        if(root == null){
            return true;
        }
        else{
            return isMirror(root.left, root.right);
        }
    }
    
    public static boolean isMirror(TreeNode node1, TreeNode node2){
        //If Tree has only one element then it is symmetric.
        if(node1 == null && node2 == null){
            return true;
        }
        
        //If one is null and another is not null
        if(node1 == null || node2 == null){
            return false;
        }
        
        //Node1's data and Node2's data not matches
        if(node1.data != node2.data){
            return false;
        }
        
        //Node1's data and Node2's data not matches
        boolean call1 = isMirror(node1.left, node2.right);
        boolean call2 = isMirror(node1.right, node2.left);
        
        //If both recursive call are true then Tree is Symmetric
        return call1 && call2;
    }
    
    public void createTree(){
        TreeNode first = new TreeNode(1);
        TreeNode second = new TreeNode(2);
        TreeNode third = new TreeNode(2);
        TreeNode fourth = new TreeNode(3);
        TreeNode fifth = new TreeNode(4);
        TreeNode sixth = new TreeNode(4);
        TreeNode seventh = new TreeNode(3);
        
        root = first;
        first.left = second;
        first.right = third;
        
        second.left = fourth;
        second.right = fifth;
        third.left = sixth;
        third.right = seventh;
        
    }
    
    public static void main(String[] args) {
        Day11_SymmetricTree_101 t = new Day11_SymmetricTree_101();
        t.createTree();
        System.out.println(t.isSymmetric(t.root));
    }
    
}
