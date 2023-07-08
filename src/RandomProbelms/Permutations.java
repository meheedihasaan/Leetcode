/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package RandomProbelms;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Acer
 */
public class Permutations {
    
    public List<List<Integer>> permutations(int nums[]){
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> list = new ArrayList<>();
        boolean visited[] = new boolean[nums.length];
        getPermutaion(ans, list, nums, visited);
        return ans;
    }
    
    public void getPermutaion(List<List<Integer>> ans, List<Integer> list, int nums[], boolean visited[]){
        if(list.size() == nums.length){
            ans.add(new ArrayList(list));
            return;
        }
        for (int i = 0; i < nums.length; i++) {
            if(!visited[i]){
                list.add(nums[i]);
                visited[i] = true;
                getPermutaion(ans, list, nums, visited);
                
                visited[i] = false;
                list.remove(list.size()-1);
            }
        }
    }
    
    public static void main(String[] args) {
        int nums[] = {1,2,3};
        Permutations p = new Permutations();
        System.out.println(p.permutations(nums));
    }
    
}
