/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DataStructure_Level2;

/**
 *
 * @author Acer
 */
public class Day2_SortColors {
    
    public static void sortColors(int nums[]){
        int n = nums.length;
        for (int i = 0; i < n-1; i++) {
            for (int j = i+1; j < 10; j++) {
                if(nums[i] > nums[j]){
                    int temp = nums[i];
                    nums[i] = nums[j];
                    nums[j] = temp;
                }
            }
        }
    }  
    
    public static void main(String[] args) {
        int nums[] = {1,0,2,1,2,1,2,0,1,0,1};
        sortColors(nums);
    }
    
}
