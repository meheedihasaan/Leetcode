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
public class TreeSum_15 {
    
    public static List<List<Integer>> triplet(int nums[]){
        Arrays.sort(nums);
        List<List<Integer>> ans = new ArrayList<>();
        HashSet<String> unique = new HashSet<>();
        for (int i = 0; i < nums.length-1; i++) {
            HashSet<Integer> set = new HashSet<>();
            for (int j = i+1; j < nums.length; j++) {
                int x = 0-(nums[i]+nums[j]);
                List<Integer> innerList = new ArrayList<>();
                if(set.contains(x)){
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
        System.out.println(triplet(arr));
    }
    
}
