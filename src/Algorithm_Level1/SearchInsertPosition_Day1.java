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
public class SearchInsertPosition_Day1 {
    
    public static int searchPosition(int nums[], int target){
        int l = 0;
        int r = nums.length-1;
        int ans = 0;
        while(l <= r){
            int mid = l+(r-l)/2;
            if(nums[mid] == target){
                ans = mid;
                break;
            }
            
            if(nums[mid] < target){
                l = mid+1;
                ans = l;
            }
            
            if(nums[mid] > target){
                r = mid-1;
            }
        }
        return ans;
    }
    
    public static void main(String[] args) {
        int nums[] = {1,3,4,5,6};
        System.out.println(searchPosition(nums, 2));
    }
    
}
