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
public class Day13_BullsAndCows_299 {
    
    public static String getHint(String secret, String guess){
        HashMap<Character, Integer> map = new HashMap<>();
        int bulls = 0, cows = 0;
        for (int i = 0; i < secret.length(); i++) {
            char c = secret.charAt(i);
            if(map.containsKey(c)){
                map.put(c, map.get(c)+1);
            }
            else{
                map.put(c, 1);
            }
        }
        
        //For Bulls
        char[] g = guess.toCharArray();
        for (int i = 0; i < secret.length(); i++) {
            char c = g[i];
            if(secret.charAt(i) == c){
                bulls++;
                map.put(c, map.get(c)-1);
                g[i] = '#';
            }
        }
        
        //For Cows
        for (int i = 0; i < guess.length(); i++) {
            char c = g[i];
            if(map.containsKey(c) && c != '#'){
                if(map.get(c) > 0){
                    cows++;
                    map.put(c, map.get(c)-1);
                }
            }
        }
        
        StringBuilder ans = new StringBuilder();
        ans.append(bulls+"A"+cows+"B");
        return ans.toString();
    }
    
    public static void main(String[] args) {
        String secret = "1123";
        String guess = "0001";
        System.out.println(getHint(secret, guess));
    }
    
}
