/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Algorithm_Level2;

/**
 *
 * @author User
 */
public class Day15_DecodeWays {
    
    public static int decodeWays(String s){
        if(s.charAt(0) == '0'){
            return 0;
        }
        int n = s.length();
        int dp[] = new int[n+1];
        dp[0] = 1;
        dp[1] = 1;
        for(int i = 2; i <= n; i++){
            int a = Character.getNumericValue(s.charAt(i-1));
            int b = Character.getNumericValue(s.charAt(i-2));
            
            //When current digit is 0
            if(a == 0){
                if(b == 1 || b == 2){
                    dp[i] = dp[i-2];
                }
                else{
                    dp[i] = 0;
                }
                continue;
            }
            
            //When current digit is non 0
            if(a >= 1 && a <= 9){
                dp[i] = dp[i-1];
            }
            
            if(b == 1){
                dp[i] = dp[i] + dp[i-2];
            }
            else if(b == 2 && a <= 6){
                dp[i] = dp[i] + dp[i-2];
            }
        }        
        return dp[n];
    }
    
    public static void main(String[] args) {
        String s = "1211";
        System.out.println(decodeWays(s));
    }
    
}
