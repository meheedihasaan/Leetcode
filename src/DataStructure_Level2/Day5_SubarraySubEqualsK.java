/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DataStructure_Level2;

import java.util.ArrayList;
import java.util.HashMap;

/**
 *
 * @author Acer
 */
public class Day5_SubarraySubEqualsK {
    
    public static int subarraySum(int nums[], int k){
        int n = nums.length;
        long prefixSum[] = new long[n];
        prefixSum[0] = nums[0];
        for (int i = 1; i < n; i++) {
            prefixSum[i] = prefixSum[i-1]+nums[i];
        }
        
        int cnt = 0;
        HashMap<Long, Integer> map = new HashMap<>();
        for (int i = 0; i < n; i++) {
            if(prefixSum[i] == k){
                cnt++;
            }
            
            long x = prefixSum[i]-k;
            if(map.containsKey(x)){
                cnt+=map.get(x);
            }
            
            if(map.containsKey(prefixSum[i])){
                map.put(prefixSum[i], map.get(prefixSum[i])+1);
            }
            else{
                map.put(prefixSum[i], 1);
            }
        }
        
        return cnt;
    }
    
    public static void main(String[] args) {
        int nums[] = {-1, 1, 0};
        System.out.println(subarraySum(nums, 0));
    }
    
}
