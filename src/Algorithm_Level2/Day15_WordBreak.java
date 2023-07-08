/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Algorithm_Level2;

import java.util.HashMap;
import java.util.List;

/**
 *
 * @author User
 */
public class Day15_WordBreak {
    
    HashMap<String, Boolean> map = new HashMap<>();
    public boolean wordBreak(String s, List<String> wordDict) {
        if(wordDict.contains(s)){
            return true;
        }
        
        if(map.containsKey(s)){
            return map.get(s);
        }
        
        for(int i = 1; i <= s.length(); i++){
            String left = s.substring(0, i);
            if(wordDict.contains(left) && wordBreak(s.substring(i, s.length()), wordDict)){
                map.put(s, true);
                return true;
            }
        }
        map.put(s, false);
        return false;
    }
    
}
