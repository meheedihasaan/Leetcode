/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LeetCode75_Level1;

import java.util.HashMap;

/**
 *
 * @author Acer
 */
public class Day12_LongestRepeatingCharacterReplacement {
    
    public static int characterReplacement(String s, int k){
        HashMap<Character, Integer> map = new HashMap<>();
        int start = 0;
        int end = 0;
        int maxLength = 0;
        int maxFreq = 0;
        for (end = 0; end < s.length(); end++) {
            char right = s.charAt(end);
            if(map.containsKey(right)){
                map.put(right, map.get(right)+1);
            }
            else{
                map.put(right, 1);
            }
            
            maxFreq = Math.max(maxFreq, map.get(right));
            if(end-start+1 - maxFreq > k){
                char left = s.charAt(start);
                map.put(left, map.get(left)-1);
                start++;
            }
            maxLength = Math.max(maxLength, end-start+1);
        }
        return maxLength;
    }
    
    public static void main(String[] args) {
        String s = "ABAA";
        System.out.println(characterReplacement(s, 0));
    }
    
}
