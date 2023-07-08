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
public class Day9_ValidParentheses_20 {
    
    public static boolean isValid(String s){
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if(c == '(' || c == '{' || c == '['){
                stack.push(c);
            }
            else{
                if(stack.isEmpty()){
                    return false;
                }
                
                char last = stack.pop();
                if(last != '(' && c == ')'){
                    return false;
                }
                if(last != '{' && c == '}'){
                    return false;
                }
                if(last != '[' && c == ']'){
                    return false;
                }
            }
        }
        return stack.size() == 0;
    }
    
    public static void main(String[] args) {
        System.out.println(isValid("({}[]{([])})"));
    }
    
}
