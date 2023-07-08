/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LeetCode75_Level1;

/**
 *
 * @author Acer
 */
public class Day7_IsBadVersion_278 {
    
    //Driver Method - will return true or false;
    public static boolean isBadVersion(int data){
        if(data >= 4){
            return true;
        }
        return false;
    }
    
    public static int firstBadVersion(int n) {
        int left = 1;
        int right = n;
        int mid = 0;
        while(left <= right){
            mid = left+(right-left)/2;
            
            if(isBadVersion(mid)){
                if(!isBadVersion(mid-1)){
                    return mid;
                }
                right = mid-1;
            }
            else{
                left = mid+1;
            }
        }
        return n;
    }
    
    public static void main(String[] args) {
        System.out.println(firstBadVersion(5));
    }
    
}
