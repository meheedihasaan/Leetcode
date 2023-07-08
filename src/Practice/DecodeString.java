/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Practice;

import java.util.Stack;

/**
 *
 * @author Acer
 */
public class DecodeString {
    
    public static String decode(String s){
        Stack<String> string = new Stack<>();
        Stack<String> nums = new Stack<>();
        String str = "";
        String n = "";
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if(Character.isDigit(c)){
                n+=c;
            }
            else if(c == '['){
                string.add(str);
                nums.add(n);
                str = "";
                n = "";
            }
            else if(c == ']'){
                int m = Integer.parseInt(nums.pop());
                StringBuilder ans = new StringBuilder(string.pop());
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
        System.out.println(decode("2[abc]3[cd]ef"));
    }
    
}
