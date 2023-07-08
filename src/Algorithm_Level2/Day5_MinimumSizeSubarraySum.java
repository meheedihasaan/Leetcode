/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Algorithm_Level2;

/**
 *
 * @author Acer
 */
public class Day5_MinimumSizeSubarraySum {
    
    public static int minimumSize(int target, int nums[]){
        int ans = Integer.MAX_VALUE;
        int left = 0;
        int right = 0;
        int sum = 0;
        while(right < nums.length){
            sum+=nums[right];
            while(left <= right && sum >= target){
                ans = Math.min(ans, right-left+1);
                sum-=nums[left];
                left++;
            }
            right++;
        }
        
        if(ans == Integer.MAX_VALUE){
            return 0;
        }
        return ans;
    }
    
    public static void main(String[] args) {
        int nums[] = {2,3,1,2,4,3};
        int target = 7;
        System.out.println(minimumSize(target, nums));
    }
    
}
