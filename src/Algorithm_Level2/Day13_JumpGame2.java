/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Algorithm_Level2;

/**
 *
 * @author User
 */
public class Day13_JumpGame2 {
    
    //3,4,5,2,3,4,6
    public static int jumpGame(int[] nums){
        int n = nums.length;
        int current = 0;
        int max = 0;
        int count = 0;
        for (int i = 0; i < n; i++) {
            if(i > current){
                current = max;
                count++;
            }
            max = Math.max(max, nums[i]+1);
        }
        return count;
    }
    
    public static void main(String[] args) {
        int nums[] = {3,4,5,2,3,4,6};
        System.out.println(jumpGame(nums));
    }
    
}
