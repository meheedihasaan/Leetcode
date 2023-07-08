/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DataStructure_Level2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;

/**
 *
 * @author Acer
 */
public class Day20_TopKFrequentElements {
    
    public static int[] topKFrequent(int nums[], int k){
        final HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if(map.containsKey(nums[i])){
                map.put(nums[i], map.get(nums[i])+1);
            }
            else{
                map.put(nums[i], 1);
            }
        }
        
        List<Integer> list = new ArrayList<>(map.keySet());
        Collections.sort(list, new Comparator<Integer>(){

            @Override
            public int compare(Integer num1, Integer num2) {
                int comparison = map.get(num2).compareTo(map.get(num1));
                return comparison;
            }
            
        });
        
        int ans[] = new int[k];
        for (int i = 0; i < k; i++) {
            ans[i] = list.get(i);
        }
        
        return ans;
    }
    
    public static void main(String[] args) {
        int nums[] = {1, 2, 3, 2, 1, 1, 5, 6, 4, 4, 4, 3};
        int ans[] = topKFrequent(nums, 3);
        for (int i = 0; i < ans.length; i++) {
            System.out.print(ans[i]+" ");
        }
        System.out.println();
    }
    
}
