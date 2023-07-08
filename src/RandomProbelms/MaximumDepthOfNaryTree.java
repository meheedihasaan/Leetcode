/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package RandomProbelms;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 *
 * @author Acer
 */
public class MaximumDepthOfNaryTree {
    
    Node root;
    class Node{
        int val;
        List<Node> children = new ArrayList<>();
        Node(){
            
        }
        Node(int val){
            this.val = val;
        }
        Node(int val, List<Node> children){
            this.val = val;
            this.children = children;
        }
    }
    
    public void createTree(){
        Node first = new Node(1);
        Node second = new Node(2);
        Node third = new Node(3);
        Node fourth = new Node(4);
        Node fifth = new Node(5);
        Node sixth = new Node(6);
        Node seventh = new Node(7);
        Node eighth = new Node(8);
        
        root = first;
        root.children.add(second);
        root.children.add(third);
        root.children.get(0).children.add(fourth);
        root.children.get(0).children.add(fifth);
        root.children.get(1).children.add(sixth);
        root.children.get(1).children.add(seventh);
        root.children.get(0).children.get(0).children.add(eighth);
    }
    
    public int maximumDepth(Node root){
        List<List<Integer>> list = new ArrayList<>();
        levelOrder(root, list);
        int maxDepth = list.size();
        return maxDepth;
    }
    
    public void levelOrder(Node root, List<List<Integer>> list){
        if(root == null){
            return;
        }
        
        Queue<Node> queue = new LinkedList<>();
        queue.offer(root);
        while(!queue.isEmpty()){
            List<Integer> innerList = new ArrayList<>();
            int size = queue.size();
            for (int i = 0; i < size; i++) {
                Node temp = queue.poll();
                innerList.add(temp.val);
                for (Node child : temp.children) {
                    queue.offer(child);
                }
            }
            list.add(innerList);
        }
    }
    
    public static void main(String[] args) {
        MaximumDepthOfNaryTree t = new MaximumDepthOfNaryTree();
        t.createTree();
        System.out.println(t.maximumDepth(t.root));
    }
    
}
