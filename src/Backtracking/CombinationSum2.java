/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Backtracking;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 *
 * @author Acer
 */
public class CombinationSum2 {
    
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        Arrays.sort(candidates);
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> list = new ArrayList<>();
        combination(0, candidates, target, ans, list);
        return ans;
    }
    
    public void combination(int start, int candidates[], int target, List<List<Integer>> ans, List<Integer> list){        
        if(target == 0){
            ans.add(new ArrayList(list));
        }
        
        if(target < 0){
            return;
        }
        
        for(int i = start; i < candidates.length; i++){
            if(i > start){
                if(candidates[i] == candidates[i-1]){
                    continue;
                }
            }
            list.add(candidates[i]);
            combination(i+1, candidates, target-candidates[i], ans, list);
            
            //Backtracking
            list.remove(list.size()-1);
        }        
    }
    
    public static void main(String[] args) {
        int candidates[] = {10,1,2,7,6,1,5};
        int target = 8;
        CombinationSum2 c = new CombinationSum2();
        System.out.println(c.combinationSum2(candidates,target));
    }
    
}
