/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Algorithm_Level1;

import java.util.HashSet;

/**
 *
 * @author Acer
 */
public class LongestSubstringWithoutRepeatingCharacters_Day6 {
    
    public static int longestSubstring(String s){
        int start = 0;
        int end = 0;
        int maxLength = 0;
        HashSet<Character> set = new HashSet<>();
        while(end < s.length()){
            char c = s.charAt(end);
            if(set.contains(c)){
                set.remove(s.charAt(start));
                start++;
            }
            else{
                set.add(c);
                maxLength = Math.max(maxLength, end-start+1);
                end++;
            }
        }
        return maxLength;
    }
    
    public static void main(String[] args) {
        String s = "abcbc";
        System.out.println(longestSubstring(s));
    }
    
}
