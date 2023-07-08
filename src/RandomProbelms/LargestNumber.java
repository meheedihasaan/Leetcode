/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package RandomProbelms;

import java.util.Arrays;
import java.util.Comparator;

/**
 *
 * @author Acer
 */
public class LargestNumber {
    
    public static String largestNumber(int nums[]){
        String arr[] = new String[nums.length];
        for (int i = 0; i < nums.length; i++) {
            arr[i] = String.valueOf(nums[i]);
        }
        
        Arrays.sort(arr, new Comparator<String>(){

            @Override
            public int compare(String x, String y) {
                String xy = x+y;
                String yx = y+x;
                int comparison = yx.compareTo(xy);
                return comparison;
            }
            
        });
        
        if(arr[0] == "0"){
            return "0";
        }
        
        String ans = "";
        for (int i = 0; i < arr.length; i++) {
            ans+=arr[i];
        }
        return ans;
    }
    
    public static void main(String[] args) {
        int num[] = {87, 90, 12, 9, 8};
        System.out.println(largestNumber(num));
    }
    
}
