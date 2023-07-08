/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Algorithm_Level1;

import java.util.PriorityQueue;

/**
 *
 * @author Acer
 */
public class SquareOfASortedArray_Day2 {
    
    public static int[] sortedSquares(int[] nums) {
        //Priority Queue Approach
//        PriorityQueue<Integer> queue = new PriorityQueue<>();
//        for(int i = 0; i < nums.length; i++){
//            queue.add(nums[i]*nums[i]);
//        }
//       
//        int i = 0;
//        while(!queue.isEmpty()){
//            nums[i] = queue.poll();
//            i++;
//        }
//        return nums;
        
        //Two Pointers Approach
        int left = 0;
        int right = nums.length-1;
        int i = nums.length-1;
        int ans[] = new int[nums.length];
        while(left <= right){
            if(Math.abs(nums[left]) > Math.abs(nums[right])){
                ans[i] = nums[left]*nums[left];
                left++;
            }
            else{
                ans[i] = nums[right]*nums[right];
                right--;
            }
            i--;
        }
        return ans;
    }
    
    public static void main(String[] args) {
        int nums[] = {-4,-3,0,1,2,3,3,4,5,10};
        int ans[] = sortedSquares(nums);
        for (int i = 0; i < ans.length; i++) {
            System.out.print(ans[i]+" ");
        }
        System.out.println();
    }
    
}
