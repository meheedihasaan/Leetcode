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
public class Day10_CombinationSum {
    
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> list = new ArrayList<>();
        uniqueCombination(0, candidates, target, ans, list);
        return ans;
    }
    
    public void uniqueCombination(int start, int candidates[], int target, List<List<Integer>> ans, List<Integer> list){
        if(target == 0){
            ans.add(new ArrayList(list));
        }
        
        if(target < 0){
            return;
        }
        for(int i = start; i < candidates.length; i++){
            list.add(candidates[i]);
            //Taking same element again and again
            uniqueCombination(i, candidates, target-candidates[i], ans, list);
            
            //Backtracking
            list.remove(list.size()-1);
        }
    }
    
    public static void main(String[] args) {
        int candidates[] = {2,3,6,7};
        int target = 7;
        Day10_CombinationSum c = new Day10_CombinationSum();
        System.out.println(c.combinationSum(candidates, target));
    }
    
}
