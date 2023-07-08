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
public class MoveZeroes_Day3 {
    
    public static void move(int nums[]){
        if(nums.length == 1){
            return;
        }
        
        int left = 0;
        int right = 0;
        while(right < nums.length){
            if(nums[right] == 0){
                right++;
            }
            else{
                int temp = nums[left];
                nums[left] = nums[right];
                nums[right] = temp;
                left++;
                right++;
            }
        }
    }
    
    public static void main(String[] args) {
        int nums[] = {0,1,0,2,3,0,4};
        move(nums);
        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i]+" ");
        }
        System.out.println();
    }
    
}
