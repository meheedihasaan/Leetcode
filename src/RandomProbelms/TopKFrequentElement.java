/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package RandomProbelms;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;

/**
 *
 * @author Acer
 */
public class TopKFrequentElement {
    
    public static int[] topFrequent(int nums[], int k){
        final HashMap<Integer, Integer> map = new HashMap<>();
        for (int num : nums) {
            if(map.containsKey(num)){
                map.put(num, map.get(num)+1);
            }
            else{
                map.put(num, 0);
            }
        }
        
        List<Integer> list = new ArrayList<>(map.keySet());
        Collections.sort(list, new Comparator<Integer>(){

            @Override
            public int compare(Integer a, Integer b) {
                int comparison = map.get(b).compareTo(map.get(a));
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
        int nums[] = {1,1,1,2,2,3};
        int k = 2;
        int ans[] = topFrequent(nums, k);
        for (int i = 0; i < ans.length; i++) {
            System.out.print(ans[i]+" ");
        }
        System.out.println();
    }
    
}
