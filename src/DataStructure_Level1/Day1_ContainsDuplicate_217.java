/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DataStructure_Level1;

import java.util.HashSet;

/**
 *
 * @author Acer
 */
public class Day1_ContainsDuplicate_217 {
    
    public static boolean containsDuplicate(int[] nums){
        HashSet<Integer> set = new HashSet<>();
        for (int i = 0; i < nums.length; i++) {
            set.add(nums[i]);
        }
        
        if(set.size() == nums.length){
            return false;
        }
        return true;
    }
    
    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 1};
        System.out.println(containsDuplicate(arr));
    }
    
}
