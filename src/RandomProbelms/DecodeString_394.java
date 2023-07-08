/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package RandomProbelms;

import java.util.Stack;

/**
 *
 * @author Acer
 */
public class DecodeString_394 {
    
    public static String decode(String s){
        Stack<String> res = new Stack<>();
        Stack<String> nums = new Stack<>();
        String str = "";
        String num = "";
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if(Character.isDigit(c)){
                num+=c;
            }
            else if(c == '['){
                res.push(str);
                nums.push(num);
                str = "";
                num = "";
            }
            else if(c == ']'){
                StringBuilder ans = new StringBuilder(res.pop());
                int n = Integer.parseInt(nums.pop());
                for (int j = 0; j < n; j++) {
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
        String s = "3[a2[c]]";
        System.out.println(decode(s));
    }
    
}
