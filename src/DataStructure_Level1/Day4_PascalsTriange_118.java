/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DataStructure_Level1;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Acer
 */
public class Day4_PascalsTriange_118 {
    
    public static List<List<Integer>> generate(int numRows){
        List<List<Integer>> ans = new ArrayList<>();
        
        //Initialize the first Two Row
        List<Integer> first = new ArrayList<>();
        first.add(1);        
        ans.add(first);
        //If numRows equal 1 then return ans;
        if(numRows == 1){
            return ans;
        }
        List<Integer> second = new ArrayList<>();
        second.add(1);
        second.add(1);
        
        ans.add(second);
        
        //Start From 3rd Row
        int k = 3;
        for (int i = 2; i < numRows; i++) {
            List<Integer> innerList = new ArrayList<>();
            for (int j = 0; j < k; j++) {
                if(j == 0 || j == k-1){
                    innerList.add(1);
                }
                else{
                    int x = ans.get(i-1).get(j-1)+ans.get(i-1).get(j);
                    innerList.add(x);
                }
            }
            ans.add(innerList);
            k++;
        }
        return ans;
    }
    
    public static void main(String[] args) {
        int rowNum = 5;
        List<List<Integer>> ans = generate(rowNum);
        System.out.println(ans);
    }
    
}
