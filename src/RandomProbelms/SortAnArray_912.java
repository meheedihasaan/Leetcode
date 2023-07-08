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
public class SortAnArray_912 {
    
    public int[] sortArray(int[] nums) {
        int n = nums.length;
        int left = 0, right = n-1;
        mergeSort(nums, left, right);
        return nums;
    }
    
    public void mergeSort(int nums[], int left, int right){
        if(left < right){
            int mid = (left+right)/2;
            mergeSort(nums, left, mid);
            mergeSort(nums, mid+1, right);
            merge(nums, left, mid, right);
        }
    }
    
    //Declare temporary sorted array
    int sorted[] = new int[500003];
    
    public void merge(int nums[], int left, int mid, int right){
        int i = left;
        int j = mid+1;
        int k = left;
        while(i <= mid && j <= right){
            if(nums[i] < nums[j]){
                sorted[k] = nums[i];
                i++;
            }
            else{
                sorted[k] = nums[j];
                j++;
            }
            k++;
        }
        
        //If j ends but i remains
        while(i <= mid){
            sorted[k] = nums[i];
            k++;
            i++;
        }
        
        //If i ends but j remains
        while(j <= right){
            sorted[k] = nums[j];
            k++;
            j++;
        }
        
        //Copy sorted subarray to main array
        for(k = left; k <= right; k++){
            nums[k] = sorted[k];
        }
        
    }
    
    public static void main(String[] args) {
        int nums[] = {1,2,6,7,3,2,1,9};
        SortAnArray_912 s = new SortAnArray_912();
        s.sortArray(nums);
    }
    
}
