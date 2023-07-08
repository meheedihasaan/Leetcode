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
public class Day11_MinCostClimbingStaris {
    
    public static int cost(int arr[]){
        int n = arr.length;
        int dp[] = new int[1001];
        dp[0] = arr[0];
        dp[1] = arr[1];
        for (int i = 2; i < arr.length; i++) {
            dp[i] = arr[i]+Math.min(dp[i-1], dp[i-2]);
        }
        return Math.min(dp[n-1], dp[n-2]);
    }
    
    public static void main(String[] args) {
        int arr[] = {1,100,1,1,1,100,1,1,100,1};
        System.out.println(cost(arr));
    }
    
}
