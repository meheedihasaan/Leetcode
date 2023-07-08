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
public class Day2_FindMinimumInRotatedSortedArray {
    
    public static int search(int nums[]){
        int left = 0;
        int right = nums.length-1;
        while(left < right){
            int mid = left + (right - left)/2;
            if(nums[mid] <= nums[right]){
                right = mid;
            }
            else{
                left = mid+1;
            }
        }
        return nums[left];
    }
    
    public static void main(String[] args) {
        int nums[] = {4,5,6,1,2,3};
        System.out.println(search(nums));
    }
    
}
