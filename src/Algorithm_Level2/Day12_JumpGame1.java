/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Algorithm_Level2;

/**
 *
 * @author User
 */
public class Day12_JumpGame1 {
    
    public static boolean jumpGame(int nums[]){
        int n = nums.length;
        int r = n-1;
        int l = n-2;
        boolean flag = true;
        while(l >= 0){
            if(l+nums[l] >= r){
                r = l;
                flag = true;
            }
            else{
                flag = false;
            }
            l--;
        }
        return flag;
    }
    
    public static void main(String[] args) {
        int nums[] = {1,2,0,3,0,0,1,1,2,5,1,2,0,0,6};
        System.out.println(jumpGame(nums));
    }
    
}
