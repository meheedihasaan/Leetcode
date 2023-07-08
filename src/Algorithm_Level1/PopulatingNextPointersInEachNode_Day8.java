/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Algorithm_Level1;

import java.util.LinkedList;
import java.util.Queue;

/**
 *
 * @author Acer
 */
public class PopulatingNextPointersInEachNode_Day8 {
    
    class Node {
        public int val;
        public Node left;
        public Node right;
        public Node next;

        public Node() {}

        public Node(int val) {
            this.val = val;
        }

        public Node(int val, Node left, Node right, Node next) {
            this.val = val;
            this.left = left;
            this.right = right;
            this.next = next;
        }
    }
    
    public Node connect(Node root){
        levelOrder(root);
        return root;
    }
    
    public void levelOrder(Node root){
        if(root == null){
            return;
        }
        
        Queue<Node> queue = new LinkedList<>();
        queue.offer(root);
        while(!queue.isEmpty()){
            int size = queue.size();
            Node prev = null;
            for(int i = 0; i < size; i++){                
                Node temp = queue.poll();
                if(i == 0){
                    prev = temp;
                }
                else{
                    prev.next = temp;
                    //prev = temp; or,
                    prev = prev.next;
                }
                
                if(temp.left != null){
                    queue.offer(temp.left);
                }
                
                if(temp.right != null){
                    queue.offer(temp.right);
                }
            }
            prev.next = null;
        }
    }
    
}
