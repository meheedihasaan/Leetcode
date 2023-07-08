/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DataStructure_Level2;

/**
 *
 * @author Acer
 */
public class Day6_AddString {
    
    public static String addStrings(String num1, String num2) {
        if(num1.length() < num2.length()){
            String temp = num1;
            num1 = num2;
            num2 = temp;
        }
        
        int n = num1.length();
        int m = num2.length();
        String ans = "";
        int carry = 0;
        for(int i = 0; i < m; i++){
            int x = Character.getNumericValue(num1.charAt(n-1-i));
            int y = Character.getNumericValue(num2.charAt(m-1-i));
            int z = x+y+carry;
            if(z >= 10){
                z-=10;
                carry = 1;
            }
            else{
                carry = 0;
            }
            ans = String.valueOf(z)+ans;
        }
        
        for (int i = n-m-1; i >= 0; i--) {
            int z = Character.getNumericValue(num1.charAt(i));
            z+=carry;
            if(carry == 1){                
                if(z >= 10){
                    z-=10;
                    carry = 1;
                }
                else{
                    carry = 0;
                }
            }
            ans = String.valueOf(z)+ans;
        }
        
        if(carry == 1){
            ans = String.valueOf(carry)+ans;
        }
        
        return ans;
    }
    
    public static void main(String[] args) {
        String num1 = "12323";
        String num2 = "989";
        System.out.println(addStrings(num1, num2));
    }
    
    
    
}
