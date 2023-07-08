/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LeetCode75_Level1;

import java.util.Stack;

/**
 *
 * @author Acer
 */
public class Day14_BackspaceStringCompare_844 {
    
    public static boolean backspaceCompare(String s, String t){
        Stack<Character> stack1 = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if(c == '#'){
                if(!stack1.isEmpty()){
                    stack1.pop();
                }
            }
            else{
                stack1.push(c);
            }
        }
        
        Stack<Character> stack2 = new Stack<>();
        for (int i = 0; i < t.length(); i++) {
            char c = t.charAt(i);
            if(c == '#'){
                if(!stack2.isEmpty()){
                    stack2.pop();
                }
            }
            else{
                stack2.push(c);
            }
        }
        
        //If size are not equal then return false;
        if(stack1.size() != stack2.size()){
            return false;
        }
        
        for (int i = 0; i < stack1.size(); i++) {
            if(stack1.get(i) != stack2.get(i)){
                return false;
            }
        }
        return true;
    }
    
    public static void main(String[] args) {
        String s = "ab#c";
        String t = "d";
        //Stack<Character> ans = backspaceCompare(s,t);
        System.out.println(backspaceCompare(s,t));
    }
    
}
