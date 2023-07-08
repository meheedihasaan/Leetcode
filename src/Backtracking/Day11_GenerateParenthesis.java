/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Backtracking;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author User
 */
public class Day11_GenerateParenthesis {
    
    public static List<String> generateParenthesis(int n){
        List<String> ans = new ArrayList<>();
        generate("(", 1, 0, n, ans);
        return ans;
    }
    
    public static void generate(String s, int open, int close, int n, List<String> ans){
        if(s.length() == 2*n){
            ans.add(s);
           // break;
        }
        
        if(open < n){
            generate(s+"(", open+1, close, n, ans);
        }
        
        if(close < open){
            generate(s+")", open, close+1, n, ans);
        }
    }
    
    public static void main(String[] args) {
        int n = 3;
        System.out.println(generateParenthesis(n));
    }
    
}
