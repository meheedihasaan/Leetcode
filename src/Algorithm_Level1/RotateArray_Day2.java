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
public class RotateArray_Day2 {
    
    public static void rotate(int[] nums, int k) {
        int n = nums.length;
        int start = n-(k%n);
        int temp[] = new int[n];
        int j = 0;
        for(int i = start; i < n; i++){
            temp[j] = nums[i];
            j++;
        }
        
        for(int i = 0; i < start; i++){
            temp[j] = nums[i];
            j++;
        }
        
        for(int i = 0; i < n; i++){
            nums[i] = temp[i];
        }
    }
    
    public static void main(String[] args) {
        int nums[] = {1,2,3,4,5,6,7};
        rotate(nums, 3);
        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i]+" ");
        }
        System.out.println();
    }
    
}
