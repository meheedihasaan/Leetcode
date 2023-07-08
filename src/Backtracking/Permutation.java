/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Backtracking;

import Algorithm_Level1.*;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Acer
 */
public class Permutation {
    
    public List<List<Integer>> permutaions(int nums[]){
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> list = new ArrayList<>();
        boolean visited[] = new boolean[nums.length];
        getPermutations(ans, list, nums, visited);
        return ans;
    }
    
    public void getPermutations(List<List<Integer>> ans, List<Integer> list, int nums[], boolean visited[]){
        if(list.size() == nums.length){
            ans.add(new ArrayList(list));
            return;
        }
        
        for (int i = 0; i < nums.length; i++) {
            if(!visited[i]){
                list.add(nums[i]);
                visited[i] = true;
                getPermutations(ans, list, nums, visited);
                
                //Backtracking
                list.remove(list.size()-1);
                visited[i] = false;
            }
        }
    }
    
    public static void main(String[] args) {
        Permutation p = new Permutation();
        int nums[] = {1,2,3};
        System.out.println(p.permutaions(nums));
    }
    
}
