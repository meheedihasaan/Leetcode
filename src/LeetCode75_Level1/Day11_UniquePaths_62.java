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
public class Day11_UniquePaths_62 {
    
    public static int uniquePaths(int n, int m){
        int dp[][] = new int[n][m];
        for (int i = n-1; i >= 0; i--) {
            for (int j = m-1; j >= 0; j--) {
                if(i == n-1 || j == m-1){
                    dp[i][j] = 1;
                }
                else{
                    dp[i][j] = dp[i+1][j]+dp[i][j+1];
                }
            }
        }
        return dp[0][0];
    }
    
    public static void main(String[] args) {
        int n = 4, m = 4;
//        int grid[][] = uniquePaths(n,m);
//        for (int i = 0; i < n; i++) {
//            for (int j = 0; j < m; j++) {
//                System.out.print(grid[i][j]+" ");
//            }
//            System.out.println();
//        }
        System.out.println(uniquePaths(n,m));
    }
    
}
