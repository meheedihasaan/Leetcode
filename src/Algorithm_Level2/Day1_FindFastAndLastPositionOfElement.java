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
public class Day1_FindFastAndLastPositionOfElement {
    
    public static int[] searchRange(int[] nums, int target) {
        int ans[] = new int[2];
        ans[0] = -1;
        ans[1] = -1;
        
        boolean flag = false;
        for(int i = 0; i < nums.length; i++){
            if(nums[i] == target){
                if(!flag){
                    ans[0] = i;
                    ans[1] = i;
                    flag = true;
                }
                else{
                    ans[1] = i;
                }
            }
            
            if(nums[i] > target){
                break;
            }
        }
        return ans;
    }
    
    public static void main(String[] args) {
        int nums[] = {1, 1, 2, 3, 3, 3, 4, 6};
        int ans[] = searchRange(nums, 3);
        System.out.println(ans[0]+" "+ans[1]);       
    }
    
}
