/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DataStructure_Level2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

/**
 *
 * @author Acer
 */
public class Day8_GroupAnagrams {
    
    public static List<List<String>> groupAnagrams(String strs[]){
        HashMap<String, List<String>> map = new HashMap<>();
        for (int i = 0; i < strs.length; i++) {
            String temp = strs[i];
            char ch[] = temp.toCharArray();
            Arrays.sort(ch);
            String s = String.valueOf(ch);
            if(map.containsKey(s)){
                map.get(s).add(temp);
            }
            else{
                map.put(s, new ArrayList());
                map.get(s).add(temp);
            }
        }
        
        List<List<String>> ans = new ArrayList<>();
        for (String ss : map.keySet()) {
            ans.add(map.get(ss));
        }
        
        return ans;
    }
    
    public static void main(String[] args) {
        String strs[] = {"eat", "nat", "tan", "ate", "bat"};
        System.out.println(groupAnagrams(strs));
    }
    
}
