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
public class Day1_SearchInRotatedSortedArray {
    
    public static int search(int nums[], int target){
        int left = 0; 
        int right = nums.length-1;
        while(left <= right){
            int mid = left+(right-left)/2;
            if(nums[mid] == target){
                return mid;
            }
            
            if(nums[left] <= nums[mid]){
                if(target >= nums[left] && target < nums[mid]){
                    right = mid-1 ;
                }
                else{
                    left = mid+1;
                }
            }
            else{
                if(target > nums[mid] && target <= nums[right]){
                    left = mid+1;
                }
                else{
                    right = mid-1;
                }
            }
        }
        return -1;
    }
    
    public static void main(String[] args) {
        int nums[] = {4,5,6,7,0,1,2,3};
        System.out.println(search(nums, 0));
    }
    
}
