/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Algorithm_Level2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 *
 * @author User
 */
public class Day11_LetterCombinationOfAPhoneNumber {
    
    public static List<String> letterCombination(String digits){
        HashMap<Character, String> map = new HashMap<>();
        map.put('2', "abc");
        map.put('3', "def");
        map.put('4', "ghi");
        map.put('5', "jkl");
        map.put('6', "mno");
        map.put('7', "pqrs");
        map.put('8', "tuv");
        map.put('9', "wxyz");
        
        List<String> ans = new ArrayList<>();
        if(digits.length() == 0){
            return ans;
        }
        
        getCombination(0, "", map, ans, digits);
        return ans;
    }
    
    public static void getCombination(int len, String s, HashMap<Character, String> map, List<String> ans, String digits){
        if(len == digits.length()){
            ans.add(s);
            return;
        }
        
        for (char c : map.get(digits.charAt(len)).toCharArray()) {
            getCombination(len+1, s+c+"", map, ans, digits);
        }
    }
    
    public static void main(String[] args) {
        String digits = "23";
        System.out.println(letterCombination(digits));
    }
    
}
