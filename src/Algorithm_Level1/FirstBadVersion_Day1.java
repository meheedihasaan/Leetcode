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
public class FirstBadVersion_Day1 {
    
    public static int firstBadVersion(int n){
        int l = 1;
        int r = n;
        while(l <= r){
            int mid = l+(r-l)/2;
            if(isBadVersion(mid)){
                if(!isBadVersion(mid-1)){
                    return mid;
                }
                else{
                    r = mid-1;
                }
            }
            else{
                l = mid+1;
            }
        }
        return 0;
    }
    
    public static boolean isBadVersion(int num){
        return true;
    }
    
}
