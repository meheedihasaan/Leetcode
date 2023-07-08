/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Algorithm_Level2;

import java.util.Stack;

/**
 *
 * @author Acer
 */
public class Day4_BackspaceStringComare {
    
    public static boolean backspaceCompare(String s, String t) {
        Stack<Character> stack1 = new Stack<>();
        for(int i = 0; i < s.length(); i++){
            char c = s.charAt(i);
            if(Character.isAlphabetic(c)){
                stack1.push(c);
            }
            else{
              if(!stack1.isEmpty()){
                  stack1.pop();
              }  
            }
        }
        
        Stack<Character> stack2 = new Stack<>();
        for(int i = 0; i < t.length(); i++){
            char c = t.charAt(i);
            if(Character.isAlphabetic(c)){
                stack2.push(c);
            }
            else{
                if(!stack2.isEmpty()){
                    stack2.pop();
                }
            }
        }
        
        if(stack1.equals(stack2)){
            return true;
        }
        return false;
    }
    
    public static void main(String[] args) {
        String s = "ab##";
        String t = "c#d#";
        System.out.println(backspaceCompare(s,t));
    }
    
}
