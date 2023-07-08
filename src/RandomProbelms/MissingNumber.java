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
public class MissingNumber {
    
    public static int missingNumber(int[] nums) {
        int n = nums.length;
        boolean present[] = new boolean[n+1];
        for(int i = 0; i < n; i++){
            present[nums[i]] = true;
        }
        
        int ans = 0;
        for(int i = 0; i < present.length; i++){
            if(present[i] == false){
                ans = i;
                break;
            }
        }
        return ans;
    }
    
    public static void main(String[] args) {
        int nums[] = {0,1,3,4,5,6,7,9,8};
        System.out.println(missingNumber(nums));
    }
    
}
