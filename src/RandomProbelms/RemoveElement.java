/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package RandomProbelms;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Acer
 */
public class RemoveElement {
    
    public static int removeElement(int[] nums, int val) {
        List<Integer> list = new ArrayList<>();
        for(int i = 0; i < nums.length; i++){
            if(nums[i] != val){
                list.add(nums[i]);
            }
        }
        
        for(int i = 0; i < list.size(); i++){
            nums[i] = list.get(i);
        }
        return list.size();
    }
    
    public static void main(String[] args) {
        int arr[] = {1,2, 1, 2, -1, 0, 5, 2};
        int k = 2;
        System.out.println(removeElement(arr, k));
    }
    
}
