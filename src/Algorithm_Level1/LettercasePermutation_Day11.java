/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Algorithm_Level1;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Acer
 */
public class LettercasePermutation_Day11 {
    
    public List<String> letterCasePermutation(String s){
        List<String> ans = new ArrayList<>();
        permutation(0, s.toCharArray(), ans);
        return ans;
    }
    
    
    public void permutation(int index, char ch[], List<String> ans){
        if(index == ch.length){
            ans.add(new String(ch));
            return;
        }
        
        if(Character.isLetter(ch[index])){
            char c = ch[index];
            if (Character.isUpperCase(ch[index])){
                ch[index] = Character.toLowerCase(ch[index]);
                permutation(index + 1, ch, ans);
                
                //Backtracking
                ch[index] = Character.toUpperCase(ch[index]);
            }
            else {
                ch[index] = Character.toUpperCase(ch[index]);
                permutation(index + 1, ch, ans);
                
                //Backtracking
                ch[index] = Character.toLowerCase(ch[index]);
            }
        }
        
        permutation(index+1, ch, ans);
    }
    
    public static void main(String[] args) {
        LettercasePermutation_Day11 p = new LettercasePermutation_Day11();
        String s = "a1b2";
        System.out.println(p.letterCasePermutation(s));
    }
    
}
