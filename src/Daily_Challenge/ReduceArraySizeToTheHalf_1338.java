/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Daily_Challenge;

import java.util.Arrays;

/**
 *
 * @author Acer
 */
public class ReduceArraySizeToTheHalf_1338 {
    
    public static int minSetSize(int[] arr) {
        int n = arr.length;
        int freq[] = new int[100001];
        for(int i : arr){
            freq[i]++;
        }
        
        Arrays.sort(freq);
        int x = 0;
        int cnt = 0;
        for(int i = freq.length-1; i >= 0; i--){
            x+=freq[i];
            cnt++;
            if(x >= n/2){
                break;
            }
        }
        return cnt;
    }
    
    public static void main(String[] args) {
        int arr[] = {3,3,3,3,5,5,5,2,2,7};
        System.out.println(minSetSize(arr));
    }
    
}
