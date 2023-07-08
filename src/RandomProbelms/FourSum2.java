/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package RandomProbelms;

import java.util.ArrayList;
import java.util.HashMap;

/**
 *
 * @author Acer
 */
public class FourSum2 {
    
    public static int fourSum(int nums1[], int nums2[], int nums3[], int nums4[]){
        int ans = 0;
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums1.length; i++) {
            for (int j = 0; j < nums2.length; j++) {
                int x = nums1[i]+nums2[j];
                if(map.containsKey(x)){
                    map.put(x, map.get(x)+1);
                }
                else{
                    map.put(x, 1);
                }
            }
        }
        for (int i = 0; i < nums3.length; i++) {
            for (int j = 0; j < nums4.length; j++) {
                int y = 0-(nums3[i]+nums4[j]);
                if(map.containsKey(y)){
                    ans+=map.get(y);
                }
            }
        }
        return ans;
    }
    
    public static void main(String[] args) {
        int nums1[] = {0,1,-1};
        int nums2[] = {-1,1,0};
        int nums3[] = {0,0,1};
        int nums4[] = {-1,1,1};
        System.out.println(fourSum(nums1, nums2, nums3, nums4));
    }
    
}
