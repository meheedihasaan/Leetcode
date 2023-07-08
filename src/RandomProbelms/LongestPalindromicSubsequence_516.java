/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package RandomProbelms;

/**
 *
 * @author Acer
 */
public class LongestPalindromicSubsequence_516 {
    
    public static int maxLength(String s){
        int n = s.length();
        int dp[][] = new int[n][n];
        for (int i = n-1; i >= 0; i--) {
            for (int j = i; j < n; j++) {
                if(i == j){
                    dp[i][j] = 1;
                }
                else{
                    if(s.charAt(i) == s.charAt(j)){
                        dp[i][j] = dp[i+1][j-1]+2;
                    }
                    else{
                        dp[i][j] = Math.max(dp[i][j-1], dp[i+1][j]);
                    }
                }
            }
        }
        return dp[0][n-1];
    }
    
    public static void main(String[] args) {
        String s = "cbbd";
        System.out.println(maxLength(s));
    }
    
}
