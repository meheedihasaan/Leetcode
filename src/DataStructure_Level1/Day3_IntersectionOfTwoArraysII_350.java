/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DataStructure_Level1;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 *
 * @author Acer
 */
public class Day3_IntersectionOfTwoArraysII_350 {
    
    public static int[] intersect(int nums1[], int nums2[]){
        int n = nums1.length;
        int m = nums2.length;
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i < n; i++){
            if(map.containsKey(nums1[i])){
                map.put(nums1[i], map.get(nums1[i])+1);
            }
            else{
                map.put(nums1[i], 1);
            }
        }
        
        List<Integer> list = new ArrayList<>();
        for(int i = 0; i < m; i++){
            if(map.containsKey(nums2[i])){
                if(map.get(nums2[i]) > 0){
                    list.add(nums2[i]);
                    map.put(nums2[i], map.get(nums2[i])-1);
                }
            }
        }
        
        int ans[] = new int[list.size()];
        for(int i = 0; i < list.size(); i++){
            ans[i] = list.get(i);
        }
        return ans;
    }
    
    public static void main(String[] args) {
        int nums1[] = {1, 2, 2, 5, 9};
        int nums2[] = {2, 2, 5};
        int ans[] = intersect(nums1, nums2);
        for (int i = 0; i < ans.length; i++) {
            System.out.print(ans[i]+" ");
        }
        System.out.println();
    }
    
}
