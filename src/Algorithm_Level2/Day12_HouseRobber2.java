/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Algorithm_Level2;

/**
 *
 * @author User
 */
public class Day12_HouseRobber2 {
    
    public static int houseRobber(int nums[]){
        int n = nums.length;
        if(n == 1){
            return nums[0];
        }
        
        int m = n+3;
        int dp[] = new int[m];
        int max = Integer.MIN_VALUE;
        
        //Left to Right
        int j = 3;
        for(int i = 0; i < n-1; i++){
            dp[j] = nums[i] + Math.max(dp[j-3], dp[j-2]);
            max = Math.max(dp[j], max);
            j++;
        }
        
        //Right to Left
        j = 3;
        for(int i = n-1; i > 0; i--){
            dp[j] = nums[i] + Math.max(dp[j-3], dp[j-2]);
            max = Math.max(dp[j], max);
            j++;
        }
        return max;
    }
    
    public static void main(String[] args) {
        int nums[] = {2,3,2};
        System.out.println(houseRobber(nums));
    }
    
}
