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
public class SortingTheSentense {
    
    public static String sortSentence(String s) {
        String[] temp = s.split("\\s+");
        String[] ans = new String[temp.length];
        for(int i = 0; i < temp.length; i++){
            String x = temp[i];
            int j = Character.getNumericValue(x.charAt(x.length()-1));
            String y = x.substring(0, x.length()-1);
            ans[j-1] = y;
        }
        
        String a = "";
        for(int i = 0; i < ans.length; i++){
            if(i == ans.length-1){
                a+=ans[i];
            }
            else{
                a+=ans[i]+" ";
            }
        }
        return a;
    }
    
    public static void main(String[] args) {
        String s = "homeland4 my3 is2 Bangladesh1";
        System.out.println(sortSentence(s));
    }
    
}
