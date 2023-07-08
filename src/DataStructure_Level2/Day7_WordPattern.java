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
public class Day7_WordPattern {
    
    public static boolean wordPattern(String pattern, String s){
        String arr[] = s.split("\\s++");
        if(pattern.length() != arr.length){
            return false;
        }
        HashMap<Character,String> map = new HashMap<>();
        for (int i = 0; i < pattern.length(); i++) {
            char c = pattern.charAt(i);
            String d = arr[i];
            if(map.containsKey(c)){
                if(!map.get(c).equals(d)){
                    return false;
                }
            }
            else{
                if(map.containsValue(d)){
                    return false;
                }
                map.put(c, d);
            }
        }
        return true;
    }
    
    public static void main(String[] args) {
        String pattern = "abba";
        String s = "dog dog dog dog";
        System.out.println(wordPattern(pattern, s));
    }
    
}
