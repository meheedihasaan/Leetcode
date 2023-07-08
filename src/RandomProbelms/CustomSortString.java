/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package RandomProbelms;

import java.util.HashMap;

/**
 *
 * @author Acer
 */
public class CustomSortString {
    
    public static String customSortString(String order, String s) {
        HashMap<Character, Integer> map = new HashMap<>();
        for(int i = 0; i < s.length(); i++){
            char c = s.charAt(i);
            if(map.containsKey(c)){
                map.put(c, map.get(c)+1);
            }
            else{
                map.put(c, 1);
            }
        }
        
        s = "";
        for(int i = 0; i < order.length(); i++){
            char c = order.charAt(i);
            if(map.containsKey(c)){
                for(int j = 0; j < map.get(c); j++){
                    s+=c;
                }
                map.remove(c);
            }
        }
        
        for(char c : map.keySet()){
            for(int i = 0; i < map.get(c); i++){
                s+=c;
            }
        }
        return s;
    }
    
    public static void main(String[] args) {
        String order = "cbafg";
        String s = "acbacdm";
        System.out.println(customSortString(order, s));
    }
    
}
