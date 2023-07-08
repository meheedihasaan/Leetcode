/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Algorithm_Level1;

import java.util.HashMap;

/**
 *
 * @author Acer
 */
public class PermutaionInString_Day6 {
    
    public static boolean checkInclusion(String s1, String s2){
        if(s1.length() > s2.length()){
            return false;
        }
        
        HashMap<Character, Integer> map1 = new HashMap<>();
        for (int i = 0; i < s1.length(); i++) {
            char c = s1.charAt(i);
            if(map1.containsKey(c)){
                map1.put(c, map1.get(c)+1);
            }
            else{
                map1.put(c, 1);
            }
        }
        
        HashMap<Character, Integer> map2 = new HashMap<>();
        for (int i = 0; i < s1.length(); i++) {
            char c = s2.charAt(i);
            if(map2.containsKey(c)){
                map2.put(c, map2.get(c)+1);
            }
            else{
                map2.put(c, 1);
            }
        }
        
        int i = 0;
        int j = s1.length();
        while(j < s2.length()){
            if(map1.equals(map2)){
                return true;
            }
            else{
                char c1 = s2.charAt(i);
                char c2 = s2.charAt(j);
                map2.put(c1, map2.get(c1)-1);
                if(map2.get(c1) == 0){
                    map2.remove(c1);
                }
                
                if(map2.containsKey(c2)){
                    map2.put(c2, map2.get(c2)+1);
                }
                else{
                    map2.put(c2, 1);
                }
                
                i++;
                j++;
            }
        }
        
        if(map1.equals(map2)){
            return true;
        }
        return false;
    }
    
    public static void main(String[] args) {
        String s1 = "ab";
        String s2 = "nndkkbafiie";
        System.out.println(checkInclusion(s1, s2));
    }
    
}
