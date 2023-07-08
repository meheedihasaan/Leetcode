/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Algorithm_Level2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

/**
 *
 * @author Acer
 */
public class Day3_ThreeSum {
    
    public static List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> ans = new ArrayList<>();
        HashSet<String> set = new HashSet<>();
        for(int i = 0; i < nums.length-2; i++){
            int left = i+1;
            int right = nums.length-1;
            while(left < right){
                int x = nums[i]+nums[left]+nums[right];
                if(x == 0){
                    List<Integer> list = new ArrayList<>();
                    list.add(nums[i]);
                    list.add(nums[left]);
                    list.add(nums[right]);
                    
                    String s = nums[i]+" "+nums[left]+" "+nums[right];
                    if(!set.contains(s)){
                        ans.add(list);
                        set.add(s);
                    }
                }
                
                if(x < 0){
                    left++;
                }
                else{
                    right--;
                }
            }
        }
        return ans;
    }
    
    public static void main(String[] args) {
        int nums[] = {-1,0,1,2,-1,-4};
        System.out.println(threeSum(nums));
    }
    
}
