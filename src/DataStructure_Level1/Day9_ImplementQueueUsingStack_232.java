/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DataStructure_Level1;

import java.util.Stack;

/**
 *
 * @author Acer
 */
public class Day9_ImplementQueueUsingStack_232 {
    
    static class MyQueue{
        Stack<Integer> stack1 = new Stack<>();
        Stack<Integer> stack2 = new Stack<>();
        public MyQueue(){
            
        }
        
        public void push(int x){
            while(!stack1.isEmpty()){
                int y = stack1.pop();
                stack2.push(y);
            }
            stack1.push(x);
            while(!stack2.isEmpty()){
                int y = stack2.pop();
                stack1.push(y);
            }
        }
        
        public int pop(){
            return stack1.pop();
        }
        
        public int peek(){
            return stack1.pop();
        }
        
        public boolean isEmpty(){
            return stack1.isEmpty();
        }
    }
    
    public static void main(String[] args) {
        MyQueue queue = new MyQueue();
        queue.push(1);
        queue.push(2);
        queue.push(3);
        System.out.println(queue.pop());
        System.out.println(queue.peek());
        System.out.println(queue.isEmpty());
    }
    
}
