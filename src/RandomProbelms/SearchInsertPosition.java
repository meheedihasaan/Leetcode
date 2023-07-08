/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package RandomProbelms;

/**
 *
 * @author Acer
 */
public class SearchInsertPosition {
    
    public static int searchInsert(int[] nums, int target) {
        int left = 0; 
        int right = nums.length-1;
        int ans = 0;
        while(left <= right){
            int mid = (left+right)/2;
            if(nums[mid] == target){
                ans = mid;
                break;
            }
            if(nums[mid] > target){
                right = mid-1;
            }

            if(nums[mid] < target){
                left = mid+1;
                ans = left;
            }
        }
        return ans;
    }
    
    public static void main(String[] args) {
        int nums[] = {0,1,2,4,5,6};
        System.out.println(searchInsert(nums, 3));
    }
    
}
