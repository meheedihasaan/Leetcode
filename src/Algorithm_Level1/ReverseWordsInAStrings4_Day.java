/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Algorithm_Level1;

/**
 *
 * @author Acer
 */
public class ReverseWordsInAStrings4_Day {
    
    public static String reverseWords(String s) {
        String arr[] = s.split("\\s+");
        String ans = "";
        for(int i = 0; i < arr.length; i++){
            StringBuilder sb = new StringBuilder(arr[i]);
            sb.reverse();
            ans+=sb.toString();
            if(i < arr.length-1){
                ans+=" ";
            }
        }
        return ans;
    }
    
    public static void main(String[] args) {
        String s = "Let's take LeetCode contest";
        System.out.println(reverseWords(s));
    }
    
}
