/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Algorithm_Level2;

/**
 *
 * @author User
 */
public class Day20_SuffleAnArray {
    
    public int arr[];
    public Day20_SuffleAnArray(int[] nums) {
        this.arr = nums;
    }
    
    public int[] reset() {
        return arr;
    }
    
    public int[] shuffle() {
        int[] suffled = arr.clone();
        for(int i = 0; i < suffled.length; i++){
            int index = (int)(Math.random() * (suffled.length));
            int temp = suffled[i];
            suffled[i] = suffled[index];
            suffled[index] = temp;
        }
        return suffled;
    }
    
}
