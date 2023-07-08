/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Algorithm_Level2;

/**
 *
 * @author User
 */
public class Day18_EditDistance {
    
    public static int min(int a, int b, int c){
        if(a <= b && b <= c){
            return a;
        }
        else if(b <= a && b <= c){
            return b;
        }
        else{
            return c;
        }
    }
    
    public static int minimumDistance(String word1, String word2){
        int n = word1.length();
        int m = word2.length();
        int dp[][] = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if(i == 0){
                    dp[i][j] = j;
                }
                else if(j == 1){
                    dp[i][j] = i;
                }
                else{
                    if(word1.charAt(i-1) == word2.charAt(j-1)){
                        dp[i][j] = dp[i-1][j-1];
                    }
                    else{
                        dp[i][j] = 1 + min(dp[i-1][j-1], dp[i-1][j], dp[i][j-1]);
                    }
                }
            }
        }
        return dp[n][m];
    }
    
    public static void main(String[] args) {
        String word1 = "Saturday";
        String word2 = "Sunday";
        System.out.println(minimumDistance(word1, word2));
    }
    
}
