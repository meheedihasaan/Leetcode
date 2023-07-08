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
public class Day6_RansomNote_383 {
    
    public static boolean canConstruct(String ransomNote, String magazine) {
        int freqNote[] = new int[26];
        for(int i = 0; i < ransomNote.length(); i++){
            freqNote[ransomNote.charAt(i)-'a']++;
        }
        
        int freqMagazine[] = new int[26];
        for(int i = 0; i < magazine.length(); i++){
            freqMagazine[magazine.charAt(i)-'a']++;
        }
        
        for(int i = 0; i < ransomNote.length(); i++){
            int x = freqNote[ransomNote.charAt(i)-'a'];
            int y = freqMagazine[ransomNote.charAt(i)-'a'];
            if(x > y){
                return false;
            }
        }
        return true;
    }
    
    public static void main(String[] args) {
        System.out.println(canConstruct("aa", "aab"));
    }
    
}
