/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DataStructure_Level1;

/**
 *
 * @author Acer
 */
public class Day6_FirstUniqueCharacterInString_387 {
    
    public static int firstUniqChar(String s) {
        //Using Frequency Array
        int freq[] = new int[26];
        for(int i = 0; i < s.length(); i++){
            freq[s.charAt(i)-'a']++;
        }
        
        for(int i = 0; i < s.length(); i++){
            if(freq[s.charAt(i)-'a'] == 1){
                return i;
            }
        }
        return -1;
        
        //Using HashMap
//         HashMap<Character, Integer> map = new HashMap<>();
//         for(int i = 0; i < s.length(); i++){
//             char c = s.charAt(i);
//             if(map.containsKey(c)){
//                 map.put(c, map.get(c)+1);
//             }
//             else{
//                 map.put(c, 1);
//             }
//         }
        
//         for(int i = 0; i < s.length(); i++){
//             char c = s.charAt(i);
//             if(map.get(c) == 1){
//                 return s.indexOf(c);
//             }
//         }
//         return -1;
    }
    
    public static void main(String[] args) {
        System.out.println(firstUniqChar("leetcodeisgoodleet"));
    }
    
}
