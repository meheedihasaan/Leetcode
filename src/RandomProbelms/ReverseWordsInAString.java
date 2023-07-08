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
public class ReverseWordsInAString {
    
    public static String reverseWords(String s) {
        String arr[] = s.trim().split("\\s+");
        StringBuilder ans = new StringBuilder();
        for(int i = arr.length-1; i >= 0; i--){
            ans.append(arr[i]);
            if(i > 0){
                ans.append(" ");
            }
        }
        
//        if(ans.charAt(ans.length()-1) == ' '){
//            ans.deleteCharAt(ans.length()-1);
//        }
        return ans.toString();
    }
    
    public static void main(String[] args) {
        String s = " the. sky is blue ";
        System.out.println(reverseWords(s));
    }
    
}
