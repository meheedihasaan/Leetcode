/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Algorithm_Level2;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Acer
 */
public class Day5_FindAllAnagramsOfAString {
    
    public static List<Integer> findAnagrams(String s, String p) {
        //HashMap Solution
//         List<Integer> ans = new ArrayList<>();
//         if(p.length() > s.length()){
//             return ans;
//         }
        
//         HashMap<Character, Integer> map1 = new HashMap<>();
//         for(int i = 0; i < p.length(); i++){
//             char c = p.charAt(i);
//             if(map1.containsKey(c)){
//                 map1.put(c, map1.get(c)+1);
//             }
//             else{
//                 map1.put(c, 1);
//             }
//         }
        
//         HashMap<Character, Integer> map2 = new HashMap<>();
//         for(int i = 0; i < p.length(); i++){
//             char c = s.charAt(i);
//             if(map2.containsKey(c)){
//                 map2.put(c, map2.get(c)+1);
//             }
//             else{
//                 map2.put(c, 1);
//             }
//         }
    
//         int i = 0;
//         int j = p.length();
//         while(j < s.length()){
//             if(map1.equals(map2)){
//                 ans.add(i);
//             }
            
//             char c1 = s.charAt(i);
//             map2.put(c1, map2.get(c1)-1);
//             if(map2.get(c1) == 0){
//                 map2.remove(c1);
//             }

//             char c2 = s.charAt(j);
//             if(map2.containsKey(c2)){
//                 map2.put(c2, map2.get(c2)+1);
//             }
//             else{
//                 map2.put(c2, 1);
//             }
            
//             i++;
//             j++;
//         }
        
//         if(map1.equals(map2)){
//             ans.add(i);
//         }
        
//         return ans;
        
        List<Integer> ans = new ArrayList<>();
        if(s.length() < p.length()){
            return ans;
        }
        
        int freqP[] = new int[26];
        for(int i = 0; i < p.length(); i++){
            char c = p.charAt(i);
            freqP[c-'a']++;
        }
        
        int freqS[] = new int[26];
        for(int i = 0; i < p.length(); i++){
            char c = s.charAt(i);
            freqS[c-'a']++;
        }
        
        int i = 0;
        int j = p.length();
        while(j < s.length()){
            if(isMatch(freqP, freqS)){
                ans.add(i);
            }
            
            char c1 = s.charAt(i);
            freqS[c1-'a']--;
            
            char c2 = s.charAt(j);
            freqS[c2-'a']++;
            
            i++;
            j++;
        }
        
        //Check the last window
        if(isMatch(freqP, freqS)){
            ans.add(i);
        }
        
        return ans;
    }
    
    public static boolean isMatch(int arr1[], int arr2[]){
        for(int i = 0; i < 26; i++){
            if(arr1[i] != arr2[i]){
                return false;
            }
        }
        return true;
    }
    
    public static void main(String[] args) {
        String s = "cbaebabacd";
        String p = "abc";
        System.out.println(findAnagrams(s, p));
    }
    
}
