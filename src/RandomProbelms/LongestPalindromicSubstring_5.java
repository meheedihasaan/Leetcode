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
public class LongestPalindromicSubstring_5 {
    
    public static void main(String[] args) {
        String s = "babad";
        int n = s.length();
        int dp[][] = new int[n+1][n+1];
        int row = 0, col = 0;
        for(int i = 0; i < dp.length; i++){
            for(int j = i; j < dp.length; j++){
                if(i <= 1){
                    dp[i][j] = 1;
                }
                else if(i > 1){
                    if(s.charAt(j-i) == s.charAt(j-1)){
                        if(dp[i-2][j-1] == 1){
                            dp[i][j] = 1;
                        }
                    }
                }
                
                if(dp[i][j] == 1){
                    row = i;
                    col = j;
                }
            }
        }
        String ans = s.substring(col-row, col);
        System.out.println(ans);
    }
    
}
