/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Algorithm_Level2;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Acer
 */
public class Day9_Subsets2 {
    
    public static List<List<Integer>> subsets(int nums[]){
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> list = new ArrayList<>();
        generateSubsets(0, nums, ans, list);
        return ans;
    }
    
    public static void generateSubsets(int start, int nums[], List<List<Integer>> ans, List<Integer> list){
        ans.add(new ArrayList(list));
        for (int i = start; i < nums.length; i++) {
            if(i > start && nums[i] == nums[i-1]){
                continue;
                //if two adjecent numbers are same then jump out from the branch to avoid duplicate subset
            }
            
            list.add(nums[i]);
            generateSubsets(i+1, nums, ans, list);
            
            //Backtracking
            list.remove(list.size()-1);
        }
    }
    
    public static void main(String[] args) {
        int nums[] = {1,2,2};
        System.out.println(subsets(nums));
    }
    
}
