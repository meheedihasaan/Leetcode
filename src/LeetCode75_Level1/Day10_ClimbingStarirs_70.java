/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LeetCode75_Level1;

import java.util.Scanner;

/**
 *
 * @author Acer
 */
public class Day10_ClimbingStarirs_70 {
    
    
    public static void preCal(int dp[]){
        dp[0] = 1;
        dp[1] = 2;
        for (int i = 2; i < 10001; i++) {
            dp[i] = dp[i-1]+dp[i-2];
        }
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        int[] dp = new int[10001];
        preCal(dp);
        while(T-- > 0){
            int n = sc.nextInt();
            System.out.println(dp[n-1]);
        }
    }
    
}
