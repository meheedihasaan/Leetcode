/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LeetCode75_Level1;

/**
 *
 * @author Acer
 */
public class Day7_BinarySearch_704 {
    
    public static int binarySearch(int nums[], int target){
        int l = 0;
        int r = nums.length-1;
        int mid = l+(r-l)/2;
        while(l <= r){  
            if(target == nums[mid]){
                return mid;
            }
            
            if(target < nums[mid]){
                r = mid-1;
            }
            
            if(target > nums[mid]){
                l = mid+1;
            }
            mid = l+(r-l)/2;
        }
        return -1;
    }
    
    public static void main(String[] args) {
        int arr[] = {-1,0,3,5,9,12};
        int target = 13;
        System.out.println(binarySearch(arr, target));
    }
    
}
