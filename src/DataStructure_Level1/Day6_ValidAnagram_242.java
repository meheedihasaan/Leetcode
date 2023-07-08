/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DataStructure_Level1;

/**
 *
 * @author Acer
 */
public class Day6_ValidAnagram_242 {
    
    public static boolean isAnagram(String s, String t) {
        if(s.length() != t.length()){
            return false;
        }
        
        int freq1[] = new int[26];
        int freq2[] = new int[26];
        for(int i = 0; i < s.length(); i++){
            freq1[s.charAt(i)-'a']++;
            freq2[t.charAt(i)-'a']++;
        } 
        
        for(int i = 0; i < s.length(); i++){
            if(freq1[s.charAt(i)-'a'] != freq2[s.charAt(i)-'a']){
                return false;
            }
        }
        return true;
    }
    
    public static void main(String[] args) {
        System.out.println(isAnagram("anagram", "aganram"));
    }
    
}
