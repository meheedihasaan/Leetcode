/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package RandomProbelms;

/**
 *
 * @author Acer
 */
public class ValidPalindrome {
    
    public static boolean isPalindrome(String s){
        String a = "";
        for(int i = 0; i < s.length(); i++){
            char c = s.charAt(i);
            if(Character.isAlphabetic(c) || Character.isDigit(c)){
                a+=c;
            }
        }        
        a = a.toLowerCase();
        //return a;
        int start = 0;
        int end = a.length()-1;
        while(start <= end){
            if(a.charAt(start) != a.charAt(end)){
                return false;
            }
            start++;
            end--;
        }
        return true;       
    }
    
    public static void main(String[] args) {
        String s = "A man, a plan, a canal: Panama";
        System.out.println(isPalindrome(s));
    }
    
}
