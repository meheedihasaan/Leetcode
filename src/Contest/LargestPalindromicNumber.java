/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Contest;

import java.util.Arrays;
import java.util.HashMap;

/**
 *
 * @author Acer
 */
public class LargestPalindromicNumber {
    
    public static String largestPalindromic(String num){
        char ch[] = num.toCharArray();
        Arrays.sort(ch);
        HashMap<Character, Integer> map = new HashMap<>();
        for (int i = ch.length-1; i >= 0; i--) {
            if(map.containsKey(ch[i])){
                map.put(ch[i], map.get(ch[i])+1);
            }
            else{
                map.put(ch[i], 1);
            }
        }
        
        
        String a = "";
        String b = "";
        boolean odd = false;
        char d = '#';
        for(int i = ch.length-1; i >= 0; i--){
            char c = ch[i];
            if(map.get(c) >= 1){
                if(map.get(c)%2 == 1){
                if(!odd){
                    d = c;
                    odd = true;
                }
            }
            for (int j = 0; j < map.get(c)/2; j++) {
                a = a+c;
                b = c+b;
            }
            map.put(c, 0);
            }
        }
        String ans = a+b;
        if(d != '#'){
            ans = a+d+b;
        }
        if(ans.charAt(0) == '0'){
            ans = "";
            if(d != '#'){
                ans+=d;
            }
            else{
                ans = "0";
            }
        }
        return ans;
    }
    
    public static void main(String[] args) {
        System.out.println(largestPalindromic("0000"));
    }
    
}
