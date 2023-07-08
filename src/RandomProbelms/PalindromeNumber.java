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
public class PalindromeNumber {
    
    public static boolean isPalindrome(int x){
        if(x < 0){
            return false;
        }
        
        int temp = x;
        int num = 0;
        while(temp!=0){
            int rem = temp%10;
            num = (num*10)+rem;
            temp/=10;
        }
        return x == num;
    }
    
    public static void main(String[] args) {
        System.out.println(isPalindrome(121));
    }
    
}
