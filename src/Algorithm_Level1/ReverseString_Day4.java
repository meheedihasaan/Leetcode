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
public class ReverseString_Day4 {
    
    public static void reverse(char[] s){
        int left = 0;
        int right = s.length-1;
        while(left <= right){
            char temp = s[left];
            s[left] = s[right];
            s[right] = temp;
            left++;
            right--;
        }
    }
    
    public static void main(String[] args) {
        char s[] = {'a', 'b', 'c'};
        reverse(s);
        System.out.println(s);
    }
    
}
