/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package RandomProbelms;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 *
 * @author Acer
 */
public class TreeSumIndex {
    
    public static List<Integer> threeSumIndex(int nums[], int target){
        int n = nums.length;
        List<Integer> ans = new ArrayList<>();
        for (int i = 0; i < n-1; i++) {
            HashMap<Integer, Integer> map = new HashMap<>();
            for (int j = i+1; j < n; j++) {
                int x = target-(nums[i]+nums[j]);
                if(map.containsKey(x)){
                    ans.add(map.get(x));
                    ans.add(i);
                    ans.add(j);
                    return ans;
                }
                else{
                    map.put(nums[j], j);
                }
            }
        }
        return ans;
    }
    
    public static void main(String[] args) {
        int nums[] = {3, 5, 7, 9, 2, 6, 8};
        System.out.println(threeSumIndex(nums, 18));
    }
    
}
