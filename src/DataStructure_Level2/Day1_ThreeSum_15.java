/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DataStructure_Level2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

/**
 *
 * @author Acer
 */
public class Day1_ThreeSum_15 {
    
    public static List<List<Integer>> uniqueTriplet(int nums[]){
        Arrays.sort(nums);
        int n = nums.length;
        List<List<Integer>> ans = new ArrayList<>();
        HashSet<String> unique = new HashSet<>();
        for (int i = 0; i < n-1; i++) {
            HashSet<Integer> set = new HashSet<>();
            for (int j = i+1; j < n; j++) {
                int x = 0-(nums[i]+nums[j]);
                if(set.contains(x)){
                    List<Integer> innerList = new ArrayList<>();
                    innerList.add(nums[i]);
                    innerList.add(nums[j]);
                    innerList.add(x);
                    
                    String s = nums[i]+":"+nums[j]+":"+x;
                    if(!unique.contains(s)){
                        ans.add(innerList);
                        unique.add(s);
                    }
                }
                else{
                    set.add(nums[j]);
                }
            }
        }
        return ans;
    }
    
    public static void main(String[] args) {
        int arr[] = {-1,0,1,2,-1,-4}; //-4, -1,-1, 0, 1, 2
        System.out.println(uniqueTriplet(arr));
    }
    
}
