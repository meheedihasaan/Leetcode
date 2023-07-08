/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Algorithm_Level1;

/**
 *
 * @author Acer
 */
public class HouseRobber_Day12 {
    
    public static int rob(int nums[]){
        int n = nums.length;
        int m = n+3;
        int dp[] = new int[m];
        for (int i = 0; i < n; i++) {
            dp[i+3] = nums[i]+Math.max(dp[i+1], dp[i]);
        }
        int ans = Math.max(dp[m-1], dp[m-2]);
        return ans;
    }
    
    public static void main(String[] args) {
        int nums[] = {2,7,9,3,1};
        System.out.println(rob(nums));
    }
    
}
