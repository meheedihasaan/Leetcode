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
public class Day14_DecodeString_394 {
    
    public static String decodeString(String s){
        Stack<String> num = new Stack<>();
        Stack<String> res = new Stack<>();
        String x = "";
        String str = "";
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if(Character.isDigit(c)){
                 x+=c;
            }
            else if(c == '['){
                num.push(x);
                x = "";
                res.push(str);
                str = "";
            }
            else if(c == ']'){
                int m = Integer.parseInt(num.pop());
                StringBuilder ans = new StringBuilder(res.pop());
                for (int j = 0; j < m; j++) {
                    ans.append(str);
                }
                str = ans.toString();
            }
            else{
                str+=c;
            }
        }
        
        return str; 
    }
    
    public static void main(String[] args) {
        System.out.println(decodeString("abc3[cd]xyz"));
    }
        
}
