/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LeetCode75_Level1;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Acer
 */
public class NewClass {
    
    public static List<Integer> findAnagram(String s, String p){
        int n = s.length();
        int m = p.length();        
        List<Integer> ans = new ArrayList<>();
        
        //If m is greater than n then return the empty list
        if(m > n){
            return ans;
        }
        
        int freqS[] = new int[26];
        int freqP[] = new int[26];
        //Count the frequency of first window of 
        for (int i = 0; i < m; i++) {
            freqS[s.charAt(i)-'a']++;
            freqP[s.charAt(i)-'a']++;
        }
        
        //If first window matches
        if(isMatched(freqS, freqP)){
            ans.add(0);
        }
        
        //Frequency for other window
        for (int i = m; i < n; i++) {
            freqS[s.charAt(i-m)-'a']--;
            freqS[s.charAt(i)-'a']++;
            
            //If frequency matched
            if(isMatched(freqS, freqP)){
                ans.add(i-m+1);
            }
        }
        return ans;
    }
    
    public static boolean isMatched(int freqS[], int freqP[]){
        for (int i = 0; i < 26; i++) {
            if(freqS[i] != freqP[i]){
                return false;
            }
        }
        return true;
    }
    
    public static void main(String[] args) {
        System.out.println(findAnagram("cbajdkabc", "abc"));
    }
    
}
