/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LeetCode75_Level1;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 *
 * @author Acer
 */
public class Practice {
    
    Node root;
    
    class Node{
        int data;
        Node left;
        Node right;
        Node(){
            
        }
        Node(int data){
            this.data = data;
        }
        Node(int data, Node left, Node right){
            this.data = data;
            this.left = left;
            this.right = right;
        }
    }
    
    public void createTree(){
        Node first = new Node(2);
        Node second = new Node(1);
        Node third = new Node(3);
        Node fourth = new Node(15);
        Node fifth = new Node(7);
        
        root = first;
        root.left = second;
        root.right = third;
//        root.right.left = fourth;
//        root.right.right = fifth;
    }
    
    public static boolean isValid(Node root){
        long min = Long.MIN_VALUE;
        long max = Long.MAX_VALUE;
        return validate(root, min, max);
    }
    
    public static boolean validate(Node root, long min, long max){
        if(root == null){
            return true;
        }
        
        if(root.data <= min || root.data >= max){
            return false;
        }
        
        boolean left = validate(root.left, min, root.data);
        if(left){
            boolean right = validate(root.right, root.data, max);
            return right;
        }
        return false;
    }
    
    public static void main(String[] args) {
        Practice p = new Practice();
        
    }
    
}
