/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DataStructure_Level1;

/**
 *
 * @author Acer
 */
public class Day1_MaximumSubarray_53 {
    
    //Normal Approach
    public static int maxSubArray(int[] nums){
        int maxSum = Integer.MIN_VALUE;
        int maxEnding = 0;
        for (int i = 0; i < nums.length; i++) {
            maxEnding = maxEnding+nums[i];
            if(maxEnding > maxSum){
                maxSum = maxEnding;
            }
            
            if(maxEnding < 0){
                maxEnding = 0;
            }            
        }
        return maxSum;   
    }
    
    //DP Approach
    public static int maxSubarray(int[] nums){
        int n = nums.length;
        int dp[] = new int[n];
        dp[0] = nums[0];
        int max = dp[0];
        for (int i = 1; i < n; i++) {
            if(dp[i-1] < 0){
                dp[i] = nums[i];
            }
            else{
                dp[i] = dp[i-1]+nums[i];
            }
            max = Math.max(dp[i], max);
        }
        return max;
    }
    
    public static void main(String[] args) {
        int arr[] = {-2,1,-3,4,-1,2,1,-5,4};
        System.out.println(maxSubarray(arr));
    }
    
}
