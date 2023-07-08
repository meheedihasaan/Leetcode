/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LeetCode75_Level1;

import java.util.Scanner;

/**
 *
 * @author Acer
 */
public class Day10_FibonacciNumber_509 {
    
    //Normal Approach
    public static long fibonacci(int n){
        if(n == 0){
            return 0;
        }
        
        if(n == 1){
            return 1;
        }
       
        int l1 = 0, l2 = 1, sum = 0;
        for (int i = 2; i <=n; i++) {
            sum = l1+l2;
            l1 = l2;
            l2 = sum;
        }
        return sum;
    }
    
    //Recursive Approach
    public static long fib(int n){
        if(n == 0){
            return 0;
        }
        if(n == 1){
            return 1;
        }
        
        return fib(n-1)+fib(n-2);
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while(T-- > 0){
            int n = sc.nextInt();
            System.out.println(fibonacci(n));
        }
    }
    
}
