/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DataStructure_Level2;

import java.util.HashMap;

/**
 *
 * @author Acer
 */
public class Day1_MajorityElement_169 {
    
    public static int majorityElement(int nums[]){
        int n = nums.length;
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int num : nums) {
            if(map.containsKey(num)){
                map.put(num, map.get(num)+1);
            }
            else{
                map.put(num, 1);
            }
        }
        
        int ans = 0;
        for (int num : map.keySet()) {
            if(map.get(num) > n/2 ){
                ans = num;
                break;
            }
        }
        return ans;
    }
    
    public static void main(String[] args) {
        int nums[] = {2,2,1,1,1,2,2};
        System.out.println(majorityElement(nums));
    }
    
}
