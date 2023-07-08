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
public class Day14_MinimumRemoveToMakeValidParenthesis {
    
    public static String minimumRemove(String s){
        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if(c == '('){
                stack.push(i);
            }
            else if(c == ')'){
                if(!stack.isEmpty() && s.charAt(stack.peek()) == '('){
                    stack.pop();
                }
                else{
                    stack.push(i);
                }
            }
        }
        
        StringBuilder ans = new StringBuilder(s);
        while(!stack.isEmpty()) {
            ans.deleteCharAt(stack.peek());
            stack.pop();
        }
        return ans.toString();
    }
    
    public static void main(String[] args) {
        String s = "lee(t(c)o)de)";
        System.out.println(minimumRemove(s));
    }
    
}
