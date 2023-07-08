/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DataStructure_Level1;

import java.util.HashMap;

/**
 *
 * @author Acer
 */
public class Day2_TwoSum_1 {
    
    public static int[] twoSum(int[] nums, int target){
        int[] ans = new int[2];
        int n = nums.length;
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < n; i++) {
            int temp = target-nums[i];
            if(map.containsKey(temp)){
                ans[0] = map.get(temp);
                ans[1] = i;
                break;
            }
            map.put(nums[i], i);
        }
        return ans;
    }
    
    public static void main(String[] args) {
        int[] num = {2,7,11,1};
        int target = 9;
        int ans[] = twoSum(num, target);
        
        System.out.println(ans[0]);
        System.out.println(ans[1]);
    }
    
}
