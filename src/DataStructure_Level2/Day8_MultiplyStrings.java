/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DataStructure_Level2;

import java.math.BigInteger;

/**
 *
 * @author Acer
 */
public class Day8_MultiplyStrings {
    
    public static String multiply(String num1, String num2){
        BigInteger a = new BigInteger(num1);
        BigInteger b = new BigInteger(num2);
        
        BigInteger c = a.multiply(b);
        String ans = String.valueOf(c);
        
        return ans;
    }
    
    public static void main(String[] args) {
        System.out.println(multiply("82889000039903202","829928991299292998"));
    }
    
}
