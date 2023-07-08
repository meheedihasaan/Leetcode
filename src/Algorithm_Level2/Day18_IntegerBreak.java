/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Algorithm_Level2;

/**
 *
 * @author User
 */
public class Day18_IntegerBreak {
    
    public static int integerBreak(int n) {
        if(n == 2){
            return 1;
        }
        
        if(n == 3){
            return 2;
        }
        
        int ans = 0;
        if(n%3 == 0){
            ans = power(3, n/3);
        }
        if(n%3 == 1){
            ans = 2 * 2 * power(3, (n/3)-1);
        }
        if(n%3 == 2){
            ans = 2 * power(3, n/3);
        }
        
        return ans;
    }
    
    public static int power(int base, int pow){
        int res = 1;
        while(pow > 0){
            if(pow%2 == 0){
                base = base*base;
                pow = pow/2;
            }
            else{
                res = res*base;
                pow--;
            }
        }
        return res;
    }
    
    public static void main(String[] args) {
        System.out.println(integerBreak(10));
    }
    
}
