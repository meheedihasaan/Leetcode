/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package RandomProbelms;

import java.util.Arrays;

/**
 *
 * @author Acer
 */
public class TreeSumClosest {
    
    public static int threeSum(int nums[], int target){
        Arrays.sort(nums);
        int n = nums.length;
        int closestSum = Integer.MAX_VALUE;
        for (int i = 0; i < n-2; i++) {
            int left = i+1;
            int right = n-1;
            while(left < right){
                int sum = nums[i]+nums[left]+nums[right];
                if(sum == target){
                    return sum;
                }
                
                if(Math.abs(target-sum) < Math.abs(target-closestSum)){
                    closestSum = sum;
                }
                
                if(sum < target){
                    left++;
                }
                if(sum > target){
                    right--;
                }
            }
        }
        return closestSum;
    }
    
    public static void main(String[] args) {
        int arr[] = {0,0,0,0};
        int target = 1;
        System.out.println(threeSum(arr, target));
    }
    
}
