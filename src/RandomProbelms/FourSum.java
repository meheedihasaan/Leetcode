/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package RandomProbelms;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

/**
 *
 * @author Acer
 */
public class FourSum {
    
    public static List<List<Integer>> fourSum(int nums[], int target){
        Arrays.sort(nums);
        List<List<Integer>> ans = new ArrayList<>();
        HashSet<String> unique = new HashSet<>();
        int n = nums.length;
        for (int i = 0; i < n-3; i++) {
            for (int j = i+1; j < n-2; j++) {
                int left = j+1;
                int right = n-1;
                while(left < right){
                    long x = (long)nums[i]+nums[j]+nums[left]+nums[right];
                    if(x == target){
                        List<Integer> innerList = new ArrayList<>();
                        innerList.add(nums[i]);
                        innerList.add(nums[j]);
                        innerList.add(nums[left]);
                        innerList.add(nums[right]);
                        
                        String s = nums[i]+":"+nums[j]+":"+nums[left]+":"+nums[right];
                        if(!unique.contains(s)){
                            ans.add(innerList);
                            unique.add(s);
                        }
                    }
                    
                    if(x < target){
                        left++;
                    }
                    else{
                        right--;
                    }
                }
            }
        }
        return ans;
    }
    
    public static void main(String[] args) {
        int nums[] = {1000000000,1000000000,1000000000,1000000000};
        int target = -294967296;
        System.out.println(fourSum(nums, target));
    }
    
}
