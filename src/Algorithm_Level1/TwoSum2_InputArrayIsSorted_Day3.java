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
public class TwoSum2_InputArrayIsSorted_Day3 {
    
    public static int[] twoSum(int nums[], int target){
        int ans[] = new int[2];
        int left = 0;
        int right = nums.length-1;
        while(left <= right){
            int sum = nums[left]+nums[right];
            if(sum == target){
                ans[0] = left+1;
                ans[1] = right+1;
                break;
            }
            
            if(sum < target){
                left++;
            }
            
            if(sum > target){
                right--;
            }
        }
        return ans;
    }
    
    public static void main(String[] args) {
        int nums[] = {1,3,6,8,9};
        int ans[] = twoSum(nums, 4);
        System.out.println(ans[0]+" "+ans[1]);
    }
    
}
