/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Algorithm_Level2;

import java.util.Arrays;

/**
 *
 * @author User
 */
public class Day16_LongestIncreasingSubsequence {
    
    public static int longest(int nums[]){
        int n = nums.length;
        int dp[] = new int[n];
        Arrays.fill(dp, 1);
        int ans = 1;
        for (int i = 1; i < n; i++) {
            for (int j = 0; j < i; j++) {
                if(nums[j] < nums[i]){
                    dp[i] = Math.max(dp[i], dp[j]+1);
                }
                ans = Math.max(dp[i], ans);
            }
        }
        return ans;
    }
    
    public static void main(String[] args) {
        int nums[] = {10,9,2,5,3,7,101,18};
        System.out.println(longest(nums));
    }
    
}
