/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LeetCode75_Level1;

import java.util.HashMap;
import java.util.Scanner;

/**
 *
 * @author Acer
 */
public class Day5_LongestPalindrome_409 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while(T-- > 0){
            String s = sc.next();
            HashMap<Character, Integer> map = new HashMap<>();
            for (int i = 0; i < s.length(); i++) {
                char c = s.charAt(i);
                if(map.containsKey(c)){
                    map.put(c, map.get(c)+1);
                }
                else{
                    map.put(c, 1);
                }
            }
            
            int length = 0;
            boolean odd = false;
            for (char c : map.keySet()) {
                if(map.get(c)%2 == 0){
                    length+=map.get(c);
                }
                else{
                    if(!odd){
                        length+=map.get(c);
                        odd = true;
                    }
                    else{
                        length+=map.get(c)-1;
                    }
                }
            }
            System.out.println(length);
        }
    }
}
