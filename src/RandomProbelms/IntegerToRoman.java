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
public class IntegerToRoman {
    
    public static String intToRoman(int num){
        StringBuilder ans = new StringBuilder();
        String roman[] = {"M", "IM", "D", "ID", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};
        int val[] = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
        int i = 0;
        while(num > 0){
            while(num >= val[i]){
                num-=val[i];
                ans.append(roman[i]);
            }
            i++;
        }
        return ans.toString();
    }
    
    public static void main(String[] args) {
        System.out.println(intToRoman(2943));
    }
    
}
