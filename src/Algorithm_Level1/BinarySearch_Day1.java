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
public class BinarySearch_Day1 {
    
    public static int search(int[] nums, int target) {
        int l = 0;
        int r = nums.length-1;
        while(l <= r){
            int mid = l+(r-l)/2;
            if(nums[mid] == target){
                return mid;
            }
            
            if(nums[mid] < target){
                l = mid+1;
            }
            
            if(nums[mid] > target){
                r = mid-1;
            }
        }
        return -1;
    }
    
    public static void main(String[] args) {
        int nums[] = {1,3,4,5,6,7};
        System.out.println(search(nums, 3));
    }
    
}
