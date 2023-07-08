/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DataStructure_Level2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 *
 * @author Acer
 */
public class Day7_PartitionLebels {
    
    public static List<Integer> partitionLabels(String s) {
        int n = s.length();
        List<Integer> ans = new ArrayList<>();
        HashMap<Character, Integer> map = new HashMap<>();
        for(int i = 0; i < n; i++){
            map.put(s.charAt(i), i);
        }
        
        int lastIndex = 0;
        int j = 0;
        for(int i = 0; i < n; i++){
            lastIndex = Math.max(lastIndex, map.get(s.charAt(i)));
            if(i == lastIndex){
                ans.add((lastIndex-j+1));
                j = i+1;
            }
        }
        return ans;
    }
    
    public static void main(String[] args) {
        System.out.println(partitionLabels("a"));
    }
    
}
