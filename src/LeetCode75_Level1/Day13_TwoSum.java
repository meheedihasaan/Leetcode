/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LeetCode75_Level1;

import java.util.HashMap;

/**
 *
 * @author Acer
 */
public class Day13_TwoSum {
    
    public static int[] twoSum(int arr[], int target){
        int ans[] = new int[2];
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            int temp = target - arr[i];
            if(map.containsKey(temp)){
                ans[0] = map.get(temp);
                ans[1] = i;
                break;
            }
            map.put(arr[i], i);
        }
        return ans;
    }
    
    public static void main(String[] args) {
        int arr[] = {3,2,3};
        int ans[] = twoSum(arr, 6);
        System.out.println(ans[0]+" "+ans[1]);
    }
    
}
