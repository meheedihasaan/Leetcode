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
public class Day5_SubarrayProductLessThanK {
    
    public static int subProduct(int nums[], int k){
        int ans = 0;
        int left = 0;
        int right = 0;
        int product = 1;
        while(right < nums.length){
            product*=nums[right];
            while(left < right && product >= k){
                product/=nums[left];
                left++;
            }
            
            if(product < k){
                ans = ans+(right-left+1);
            }
            right++;
        }
        return ans;
    }
    
    public static void main(String[] args) {
        int nums[] = {10, 2, 5, 6};
        int k = 100;
        System.out.println(subProduct(nums, k));
    }
    
}
