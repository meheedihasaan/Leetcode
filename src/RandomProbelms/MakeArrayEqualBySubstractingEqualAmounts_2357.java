/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package RandomProbelms;

import java.util.Arrays;

/**
 *
 * @author Acer
 */
public class MakeArrayEqualBySubstractingEqualAmounts_2357 {
    
    public static int minimumOperations(int[] nums) {
        Arrays.sort(nums);
        int prev = 0;
        int cnt = 0;
        int max = nums[nums.length-1];
        for(int i = 0; i < nums.length; i++){
            if(nums[i] != 0){
                int x = nums[i] - prev;
                if(x <= 0){
                    continue;
                }
                prev = prev + x;
                cnt++;
                
                if(max-prev == 0){
                    break;
                }
            }
        }
        return cnt;
        
        //Normal Approach
//        Arrays.sort(nums);
//        if(nums[nums.length-1] == 0){
//            return 0;
//        }
//        int min = nums[0];
//        int cnt = 0;
//        if(min == 0){
//            cnt--;
//        }
//        while(true){
//            int x = Integer.MAX_VALUE;
//            boolean flag = false;
//            for(int i = 0; i < nums.length; i++){
//                if(nums[i] != 0){
//                    nums[i]-=min;
//                    flag = true;
//                }
//                
//                if(nums[i] != 0){
//                    x = Math.min(x, nums[i]);
//                }
//            }
//            min = x;
//            if(!flag){
//                break;
//            }
//            cnt++;
//        }
//        return cnt;
    }
    
    public static void main(String[] args) {
        int nums[] = {1,5,0,3,5};
        System.out.println(minimumOperations(nums));
    }
    
}
