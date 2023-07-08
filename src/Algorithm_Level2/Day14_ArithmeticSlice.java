/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Algorithm_Level2;

/**
 *
 * @author User
 */
public class Day14_ArithmeticSlice {
    
    public static int arithmeticSlice(int nums[]){
        int count = 0;
        for(int i = 0; i < nums.length-2; i++){
            int diff = nums[i+1]-nums[i];
            for (int j = i+2; j < nums.length; j++) {
                if(diff == nums[j]-nums[j-1]){
                    count++;
                }
            }
        }
        return count;
    }
    
    public static void main(String[] args) {
        int nums[] = {1,2,3,4};
        System.out.println(arithmeticSlice(nums));
    }
    
}
