/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Algorithm_Level2;

/**
 *
 * @author User
 */
public class Day14_LongestPalindromicSubstring {
    
    public static String longestPalindrome(String s){
        int n = s.length();
        int dp[][] = new int[n+1][n+1];
        int row = 1, col = 1;
        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {
                if(i <= 1){
                    dp[i][j] = 1;
                    continue;
                }
                
                if(s.charAt(j-i) == s.charAt(j-1)){
                    if(dp[i-2][j-1] == 1){
                        dp[i][j] = 1;
                        row = i;
                        col = j;
                    }
                }
            }
        }
        return s.substring(col-row, col);
    }
    
    public static void main(String[] args) {
        String s = "abaca";
        System.out.println(longestPalindrome(s));
    }
    
}
