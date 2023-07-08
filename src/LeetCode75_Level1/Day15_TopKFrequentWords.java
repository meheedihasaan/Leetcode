/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LeetCode75_Level1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;

/**
 *
 * @author Acer
 */
public class Day15_TopKFrequentWords {
    
    public static List<String> topKFrequent(String words[], int k){
        final HashMap<String, Integer> map = new HashMap<>();
        for (String word : words) {
            if(map.containsKey(word)){
                map.put(word, map.get(word)+1);
            }
            else{
                map.put(word, 1);
            }
        }
        
        List<String> uniqueWord = new ArrayList<>(map.keySet());
        Collections.sort(uniqueWord, new Comparator<String>() {

            //If comparison is positive then word 2 will come first and then word1
            //If comparison is negative then word 1 will come first and then word2
            @Override
            public int compare(String word1, String word2) {
                //if word2 has higer frequency than word1 then comparison = 1;
                int comparison = map.get(word2).compareTo(map.get(word1));
                if(comparison == 0){
                    //If frequency of both word1 and word 2 is same then sort in lexico. order
                    comparison = word1.compareTo(word2);
                }
                
                return comparison;
            }
        
        });
        return uniqueWord.subList(0, k);
    }
    
    public static void main(String[] args) {
        String words[] = {"the","day","is","sunny","the","the","the","sunny","is","is"};
        System.out.println(topKFrequent(words, 4));
    }
    
}
