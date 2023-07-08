/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Algorithm_Level2;

/**
 *
 * @author User
 */
public class Day17_DeleteOperationForTwoString {
    
    public static int minDistance(String word1, String word2) {
        int n = word1.length();
        int m = word2.length();
        int dp[][] = new int[n+1][m+1];
        for(int i = 1; i <= n; i++){
            for(int j = 1; j <= m; j++){
                if(word1.charAt(i-1) == word2.charAt(j-1)){
                    dp[i][j] = dp[i-1][j-1]+1;
                }
                else{
                    dp[i][j] = Math.max(dp[i][j-1], dp[i-1][j]);
                }
            }
        }
        int lca = dp[n][m];
        int ans = n-lca + m-lca;   //deleted char = (n-LCA) + (m-LCA)
        return ans;
    }
    
    public static void main(String[] args) {
        String word1 = "leetcode";
        String word2 = "etdec";
        System.out.println(minDistance(word1, word2));
    }
    
}
