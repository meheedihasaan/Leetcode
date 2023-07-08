/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LeetCode75_Level1;

/**
 *
 * @author Acer
 */
public class Day2_IsSubsequence392 {
    
    public static boolean isSubsequence(String a, String s){
        int n = a.length();
        int m = s.length();
        int i = 0;
        for (int j = 0; i < n && j < m; j++) {
            if(a.charAt(i) == s.charAt(j)){
                i++;
            }
        }
        //If all the characters of String a are found in String s
        return(i == n);
    }
    
    public static void main(String[] args) {
        System.out.println(isSubsequence("abc", "bfgamfbstxc"));
    }
    
}
