/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package RandomProbelms;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 *
 * @author Acer
 */
public class TreeSum {
    
    public static List<Integer> threeSum(int nums[], int target){
        Arrays.sort(nums);
        List<Integer> ans = new ArrayList<>();
        int n = nums.length;
        for (int i = 0; i < n-2; i++) {
            int left = i+1;
            int right = n-1;
            while(left < right){
                int sum = nums[i]+nums[left]+nums[right];
                if(sum == target){
                    ans.add(nums[i]);
                    ans.add(nums[left]);
                    ans.add(nums[right]);
                    return ans;
                }
                
                if(sum < target){
                    left++;
                }
                if(sum > target){
                    right--;
                }
            }
        }
        return ans;
    }
    
    public static void main(String[] args) {
        int nums[] = {3, 5, 7, 9, 2, 6, 8};
        System.out.println(threeSum(nums, 25));
    }
    
}
