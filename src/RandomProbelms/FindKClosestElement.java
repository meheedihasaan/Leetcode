/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package RandomProbelms;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 *
 * @author Acer
 */
public class FindKClosestElement {
    
    public static List<Integer> findClosestElements(int[] arr, int k, int x) {
        List<Integer> list = new ArrayList<>();
        int index = 0;
        if(x <= arr[0]){
            index = 0;        
        }
        else if(x >= arr[arr.length-1]){
            index = arr.length-1;    
        }
        else{
            index = binarySearch(arr, x, 0, arr.length-1);
        }
        int l = index;
        int r = index+1;

        while(list.size() < k){
            if(l >= 0 && r <= arr.length-1){
                if(Math.abs(x-arr[l]) <= Math.abs(x-arr[r])){
                    list.add(arr[l]);
                    l--;
                }
                else{
                    list.add(arr[r]);
                    r++;
                }                        
            }
            else{
                if(l >= 0){
                    list.add(arr[l]);
                    l--;
                }

                if(r <= arr.length-1){
                    list.add(arr[r]);
                    r++;
                }
            }
        }
        
        Collections.sort(list);
        return list;
    }
    
    
    //Find the index of the closest number of x
    public static int binarySearch(int arr[], int target, int l, int r){
        while(l <= r){
            int mid = l+(r-l)/2;
            if(arr[mid] == target){
                return mid;
            }
            
            if(arr[mid] < target){
                l = mid+1;
            }
            
            if(arr[mid] > target){
                r = mid-1;
            }
        }
        
        int temp = l;
        l = r;
        r = temp;
        
        int closest = 0;
        if(Math.abs(target-arr[l]) <= Math.abs(target-arr[r])){
            closest =  l;
        }
        else{
            closest = r;
        }
        return closest;
    }
    
    public static void main(String[] args) {
        int arr[] = {-3,-2,-1,-1,0,1,2,4,5,6,7,7,8};
        int k = 7;
        int x = 3;
        System.out.println(findClosestElements(arr, k, x));
    }
    
}
