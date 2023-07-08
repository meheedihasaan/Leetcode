/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Algorithm_Level2;

/**
 *
 * @author User
 */
public class Day18_CoinChange {
    
    public static int coinChange(int[] coins, int amount) {
        int n = coins.length;
        int m = amount;
        int dp[][] = new int[n+1][m+1];
        
        //Fill First Row by amount+1
        for(int i = 0; i <= m; i++){
            dp[0][i] = amount+1;
        }
        
        for(int i = 1; i <= n; i++){
            for(int j = 1; j <= m; j++){
                if(coins[i-1] > j){
                    dp[i][j] = dp[i-1][j];
                }
                else{
                    dp[i][j] = Math.min(dp[i-1][j], 1 + dp[i][j-coins[i-1]]);
                }
            }
        }
        
        if(dp[n][m] == amount+1){
            return -1;
        }
        else{
            return dp[n][m];
        }
    }
    
    public static void main(String[] args) {
        int coins[] = {1, 2, 5, 6};
        int amount = 11;
        System.out.println(coinChange(coins, amount));
    }
    
}
