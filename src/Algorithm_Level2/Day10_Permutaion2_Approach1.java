/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Algorithm_Level2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

/**
 *
 * @author User
 */
public class Day10_Permutaion2_Approach1 {
    
    public static List<List<Integer>> permuteUnique(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> list = new ArrayList<>();
        boolean visited[] = new boolean[nums.length];
        HashSet<String> set = new HashSet<>();
        getPermutation(nums, visited, ans, list, set, "");
        return ans;
    }
    
    public static void getPermutation(int nums[], boolean visited[], List<List<Integer>> ans, List<Integer> list, HashSet<String> set, String s){
        if(list.size() == nums.length){
            if(!set.contains(s)){
                ans.add(new ArrayList(list));
                set.add(s);
            }
            return;
        }
        
        for(int i = 0; i < nums.length; i++){
            if(!visited[i]){
                list.add(nums[i]);
                visited[i] = true;
                getPermutation(nums, visited, ans, list, set, s+nums[i]+"");
                
                //Backtracking
                list.remove(list.size()-1);
                visited[i] = false;
            }
        }
    }
    
    public static void main(String[] args) {
        int nums[] = {1,2,2};
        System.out.println(permuteUnique(nums));
    }
    
}
