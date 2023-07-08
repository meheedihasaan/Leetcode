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
public class Day12_FindAllAngramsInAString_438 {
    
    public static List<Integer> findAngram(String s, String p){
        int n = s.length();
        int m = p.length();
        List<Integer> ans = new ArrayList<>();
        int freqP[] = new int[26];
        int freqS[] = new int[26];
        
        //Frequency for first window and P
        for (int i = 0; i < m; i++) {
            freqS[s.charAt(i)-'a']++;
            freqP[p.charAt(i)-'a']++;
        }
        
        //Check For the first Window
        if(isMatched(freqP, freqS)){
            ans.add(0);
        }
        
        //Frequency For Other Window
        for (int i = m; i < n; i++) {
            freqS[s.charAt(i-m)-'a']--;
            freqS[s.charAt(i)-'a']++;
            
            //Check for the other window
            if(isMatched(freqP, freqS)){
                ans.add(i-m+1);
            }
        }
        return ans;
    }
    
    public static boolean isMatched(int freqP[], int freqS[]){
        for (int i = 0; i < freqP.length; i++) {
            if(freqP[i] != freqS[i]){
                return false;
            }
        }
        return true;
    }
   
    
    public static void main(String[] args) {
        String s = "cbafghicbjbac";
        String p = "abc";
        List<Integer> ans  = findAngram(s, p);
        System.out.println(ans);
//        int ans[] = findAngram(s,p);
//        for (int i = 0; i < ans.length; i++) {
//            System.out.print(ans[i]+" ");
//        }
    }
    
}
