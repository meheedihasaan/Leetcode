/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DataStructure_Level2;

import java.util.HashMap;

/**
 *
 * @author Acer
 */
public class Day6_LongestPalindrome {
    
    public static int longestPalindrome(String s) {
        int n = s.length();
        HashMap<Character, Integer> map = new HashMap<>();
        for(int i = 0; i < n; i++){
            char c = s.charAt(i);
            if(map.containsKey(c)){
                map.put(c, map.get(c)+1);
            }
            else{
                map.put(c, 1);
            }
        }
        
        int ans = 0;
        boolean odd = false;
        for(char c : map.keySet()){
            if(map.get(c)%2 == 1){
                if(!odd){
                    ans+=map.get(c);
                    odd = true;
                }
                else{
                    ans+=map.get(c)-1;
                }
            }
            else{
                ans+=map.get(c);
            }
        }
        return ans;
    }
    
    public static void main(String[] args) {
        System.out.println(longestPalindrome("ahncnaaanc"));
    }
    
}
