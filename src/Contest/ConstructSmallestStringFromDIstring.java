/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Contest;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Stack;

/**
 *
 * @author Acer
 */
public class ConstructSmallestStringFromDIstring {
    
    public static String smallestNumber(String pattern){
        StringBuilder ans = new StringBuilder();
        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i <= pattern.length(); i++) {
            stack.push(i+1);
            //When Iteration Over or found 'I'
            if(i == pattern.length() || pattern.charAt(i) == 'I'){
                while(!stack.isEmpty()){
                    ans.append(stack.pop());
                }
            }
        }
        return ans.toString();
    }
    
    public static void main(String[] args) {
        String pattern = "IIIDIDDD";
        System.out.println(smallestNumber(pattern));
    }
    
}
