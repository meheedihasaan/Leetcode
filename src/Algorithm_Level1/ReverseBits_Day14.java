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
public class ReverseBits_Day14 {
    
    public static int reverse(int n){
        int ans = 0;
        for (int i = 1; i <= 32; i++) {
            ans = ans << 1;
            int last  = n & 1;
            ans = ans | last;
            n = n >> 1;
        }
        return ans;
    }
    
    public static void main(String[] args) {
        System.out.println(reverse(43261596));
    }
    
}
