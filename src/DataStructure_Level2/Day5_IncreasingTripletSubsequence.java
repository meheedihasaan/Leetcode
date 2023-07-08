/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DataStructure_Level2;

/**
 *
 * @author Acer
 */
public class Day5_IncreasingTripletSubsequence {
    
    public static boolean increasingTriplet(int nums[]){
        //int minNum = nums[0];
        int min = nums[0];
        int maxSeq = Integer.MAX_VALUE;
        for (int i = 1; i < nums.length; i++) {
            if(nums[i] < min){
                min = nums[i];
            }
            else if(nums[i] > min && nums[i] < maxSeq){
                maxSeq = nums[i];
                
                //minNum = min;
            }
            else if(nums[i] > maxSeq){
                return true;
                //System.out.println(minNum+" "+maxSeq+" "+nums[i]);
            }
        }
        return false;
    }
    
    public static void main(String[] args) {
        int nums[] = {1,2,3,4,5};
        System.out.println(increasingTriplet(nums));
    }
    
}
