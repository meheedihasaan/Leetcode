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
public class NumberOfOneBit_Day13 {
    
    public int count(int n){
        //Bit Shifting Approach
        int cnt = 0;
//        while(n != 0){
//            if((n & 1) != 0){
//                cnt++;
//            }
//            n = n >>> 1;  //Unsigned Right Shift Operation
//        }
//        return cnt;
        
        //Second Approach
        while(n != 0){
            cnt++;
            n = n&(n-1);
        }
        return cnt;
    }
    
}
