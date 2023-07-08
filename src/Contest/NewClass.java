/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Contest;

import java.util.ArrayList;
import java.util.HashMap;

/**
 *
 * @author Acer
 */
public class NewClass {
    
    public static boolean checkDistance(String s, int distance[]){
        HashMap<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if(map.containsKey(c)){
                map.put(c, i-1-map.get(c));
            }
            else{
                map.put(c, i);
            }
        }
        
        for (int i = 0; i < s.length(); i++) {
            if(map.get(s.charAt(i)) != distance[s.charAt(i)-'a']){
                return false;
            }
        }
        return true;
    }
    
    public static void main(String[] args) {
        String s = "aa";
        int distance[] = {1,3,0,5,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0};
        System.out.println(checkDistance(s, distance));
    }
    
}
