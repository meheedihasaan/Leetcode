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
public class Day1_RunningSumOf1DArray1480 {
    public int[] runningSum(int arr[]){
        for (int i = 1; i < arr.length; i++) {
            arr[i]+=arr[i-1];
        }
        return arr;
    }
}
