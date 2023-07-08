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
public class Day9_RepeatedDNASequence {
    
    public static List<String> findRepeatedDnaSequences(String s) {
        List<String> ans = new ArrayList<>();
        HashMap<String, Integer> map = new HashMap<>();
        for(int i = 0; i+9 < s.length(); i++){
            String temp = s.substring(i, i+10);
            if(map.containsKey(temp)){
                map.put(temp, map.get(temp)+1);   
            }
            else{
                map.put(temp, 1);
            }
        }
        
        for(String ss : map.keySet()){
            if(map.get(ss) >= 2){
                ans.add(ss);
            }
        }
        return ans;
    }
    
    public static void main(String[] args) {
        String s = "AAAAACCCCCAAAAACCCCCCAAAAAGGGTTT";
        System.out.println(findRepeatedDnaSequences(s));
    }
    
}
