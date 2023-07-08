/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DataStructure_Level2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;

/**
 *
 * @author Acer
 */
public class Day21_SortCharactersByFrequency {
    
    public static String frequencySort(String s){
        final HashMap<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if(map.containsKey(c)){
                map.put(c, map.get(c)+1);
            }
            else{
                map.put(c, 1);
            }
        }
        
        List<Character> list = new ArrayList<>(map.keySet());
        Collections.sort(list, new Comparator<Character>(){

            @Override
            public int compare(Character c1, Character c2) {
                int comparison = map.get(c2).compareTo(map.get(c1));
                return comparison;
            }
            
        });
        
        String ans = "";
        for (int i = 0; i < list.size(); i++) {
            char c = list.get(i);
            for (int j = 0; j < map.get(c); j++) {
                ans+=c;
            }
        }
        return ans;
    }
    
    public static void main(String[] args) {
        String s = "ioewrieiiiifjjj";
        System.out.println(frequencySort(s));
    }
    
}
