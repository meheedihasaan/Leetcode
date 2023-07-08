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
public class PowerOfTwo_Day13 {
    
    public static boolean isPower(int n){
        if(n <= 0){
            return false;
        }
        
        boolean ans = true;
        while(n > 1){
            if(n%2 == 0){
                n/=2;
            }
            else{
                ans = false;
                break;
            }
        }
        return ans;
    }
    
    public static void main(String[] args) {
        int n = 32;
        System.out.println(isPower(n));
    }
    
}
