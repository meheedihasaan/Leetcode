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
public class Day2_IsomorphicString205 {
    
    public static boolean isIsomorphic(String a, String b){
        HashMap<Character, Character> map1 = new HashMap<>();
        for (int i = 0; i < a.length(); i++) {
            if(!map1.containsKey(a.charAt(i))){
                map1.put(a.charAt(i), b.charAt(i));
            }
            else{
                char ch = map1.get(a.charAt(i));
                if(ch != b.charAt(i)){
                    //System.out.println("NO-1");
                    return false;
                }
            }
        }
        
        map1.clear();
        for (int i = 0; i < a.length(); i++) {
            if(!map1.containsKey(b.charAt(i))){
                map1.put(b.charAt(i), a.charAt(i));
            }
            else{
                char ch = map1.get(b.charAt(i));
                if(ch != a.charAt(i)){
                    //System.out.println("NO-2");
                    return false;
                }
            }
        }
        return true;
    }
    
    public static void main(String[] args) {
        isIsomorphic("paper","title");
    }
    
}
