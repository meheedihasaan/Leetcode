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
public class PowXN {
    
    public static double powXN(double x, int n){
        long pow = n;
        if(n < 0){
            pow*=(-1);
        }
        
        double res = power(x, pow);
        if(n < 0){
            res = (double)1.0/res;
        }
        return res;
    }
    
    public static double power(double x, long pow){
        double res = 1.0;
        while(pow > 0){
            if(pow%2 == 0){
                x*=x;
                pow/=2;
            }
            else{
                res*=x;
                pow--;
            }
        }
        return res;
    }
    
    public static void main(String[] args) {
        System.out.println(powXN(2.00000, 10));
    }
    
}
