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
public class Day2_FindPeakElement {
    
    public static int peak(int nums[]){
        int left = 0;
        int right = nums.length;
        while(left < right){
            int mid = left + (right-left)/2;
            if(nums[mid] > nums[mid+1]){
                right = mid;
            }
            else{
                left = mid+1;
            }
        }
        return left;
    }
    
    public static void main(String[] args) {
        int nums[] = {1,2,1,3,5,6,4};
        System.out.println(peak(nums));
    }
    
}
