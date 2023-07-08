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
public class Day1_SingleNumber_136 {
    
    public static int singleNumber(int nums[]){
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
            if(map.get(num) == 1){
                ans = num;
                break;
            }
        }
        return ans;
    }
    
    public static void main(String[] args) {
        int nums[] = {4,1,2,1,2};
        System.out.println(singleNumber(nums));
    }
    
}
