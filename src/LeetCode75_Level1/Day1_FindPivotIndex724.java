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
public class Day1_FindPivotIndex724 {
    
    
    public static int  pivotIndex(int arr[]) {
        int leftPrefix[] = new int[arr.length];
        int rightPrefix[] = new int[arr.length];
        
        leftPrefix[0] = arr[0];
        for (int i = 1; i < arr.length; i++) {
            leftPrefix[i] = leftPrefix[i-1]+arr[i];
            //System.out.println(leftPrefix[i]);
        }
        
        rightPrefix[arr.length-1] = arr[arr.length-1];
        for (int i = arr.length-2; i >= 0; i--) {
            rightPrefix[i] = rightPrefix[i+1]+arr[i];
            //System.out.println(rightPrefix[i]);
        }
        
//        for (int i = 0; i < leftPrefix.length; i++) {
//            System.out.println(leftPrefix[i]+" "+rightPrefix[i]);
//        }
        
        for (int i = 0; i < arr.length; i++) {
            if(leftPrefix[i] == rightPrefix[i]){
                return i;
            }
        }
        return -1;
    }
    
    public static void main(String[] args) {
        int arr[] = {1, 2, 3};
        //pivotIndex(arr);
        System.out.println(pivotIndex(arr));
    }
    
}
    
    
    
