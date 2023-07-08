/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Daily_Challenge;

import java.util.ArrayList;

/**
 *
 * @author Acer
 */
public class SplitArrayIntoConsecutiveSubsequences_659 {
    
    public static void main(String[] args) {
        int nums[] = {1,2,3,4,5,6};
        int freq[] = new int[1001];
        ArrayList<Integer> list = new ArrayList<>();
        for(int i = 0; i < nums.length; i++){
            freq[nums[i]]++;
            if(!list.contains(nums[i])){
                list.add(nums[i]);
            }
        }
        
        System.out.println(list);
        
        for(int i = 0; i < list.size()-2; i++){
            if(list.get(i+1)-list.get(i) > 1){
                continue;
            }
            
            if(list.get(i+2)-list.get(i) == 2){
                if(freq[list.get(i)] >= 2 && freq[list.get(i+1)] >= 2 && freq[list.get(i+2)] >= 2){
                    System.out.println("True");
                    return;
                }
            }
            
            if(i < list.size()-3){
                if(list.get(i+3)-list.get(i) == 3){
                    if(freq[list.get(i+1)] >= 2 && freq[list.get(i+2)] >= 2){
                        System.out.println("True");
                        return;
                    }
                }
            }
            
            if(i < list.size()-4){
                if(list.get(i+4)-list.get(i) == 4){
                    if(freq[list.get(i+2)] >= 2){
                        System.out.println("True");
                        return;
                    }
                }
            }
            
            if(i < list.size()-5){
                if(list.get(i+5)-list.get(i) == 5){
                    System.out.println("True");
                    return;
                }
            }
        }
        System.out.println("False");
    }
    
}
