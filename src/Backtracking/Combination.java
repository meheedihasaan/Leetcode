/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Backtracking;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Acer
 */
public class Combination {
    
    public List<List<Integer>> combination(int n, int k){
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> list = new ArrayList<>();
        getCombination(1, n, k, ans, list);
        return ans;
    }
    
    public void getCombination(int start, int n, int k, List<List<Integer>> ans, List<Integer> list){
        if(list.size() == k){
            ans.add(new ArrayList(list));
            return;
        }
        
        for (int i = start; i <= n; i++) {
            list.add(i);
            getCombination(i+1, n, k, ans, list);
            
            list.remove(list.size()-1);
        }
    }
    
    public static void main(String[] args) {
        Combination  c = new Combination();                
        int n = 4;
        int k = 2;
        System.out.println(c.combination(n, k));
    }
    
}
