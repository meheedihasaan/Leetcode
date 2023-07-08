/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package RandomProbelms;

import java.util.HashMap;
import java.util.HashSet;

/**
 *
 * @author Acer
 */
public class LongestSubstringWithoutRepeatingCharacters_3 {
    
    public static int length(String s){
        int n = s.length();
        HashMap<Character, Integer> map = new HashMap<>();
        int ans = 0;
        for (int i = 0; i < n; i++) {
            char c = s.charAt(i);
            if(map.containsKey(c)){
                ans = Math.max(ans, i-map.get(c)-1);
                map.put(c, i);
            }
            else{
                map.put(c, i);
            }
        }
        HashSet<Character> set1 = new HashSet<>();
        int cnt1 = 0;
        for (int i = 0; i < n; i++) {
            char c = s.charAt(i);
            if(set1.contains(c)){
                set1.clear();
                set1.add(c);
                ans = Math.max(ans, cnt1);
                break;
            }
            else{
                set1.add(c);
                cnt1++;
            }
        }
        
        HashSet<Character> set2 = new HashSet<>();
        int cnt2 = 0;
        for (int i = n-1; i >= 0; i--) {
            char c = s.charAt(i);
            if(set2.contains(c)){
                set2.clear();
                set2.add(c);
                ans = Math.max(ans, cnt2);
                break;
            }
            else{
                set2.add(c);
                cnt2++;
            }
        }
        return ans;
    }
    
    public static void main(String[] args) {
        String s = "pwwkewm";
        System.out.println(length(s));
    }
    
}
