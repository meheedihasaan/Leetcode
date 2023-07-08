/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package RandomProbelms;

/**
 *
 * @author Acer
 */
public class TwoSum2_InputArrayIsSorted {
    
    public static int[] twoSum(int[] numbers, int target) {
        // int ans[] = new int[2];
        // HashMap<Integer, Integer> map = new HashMap<>();
        // for(int i = 0; i < numbers.length; i++){
        //     int x = target-numbers[i];
        //     if(map.containsKey(x)){
        //         ans[0] = map.get(x);
        //         ans[1] = i+1;
        //         break;
        //     }
        //     map.put(numbers[i], i+1);
        // }
        // return ans;
        
        //Two Pointers Technique
        int ans[] = new int[2];
        int i = 0;
        int j = numbers.length-1;
        while(i <= j){
            int sum = numbers[i]+numbers[j];
            if(sum == target){
                ans[0] = i+1;
                ans[1] = j+1;
                break;
            }
            
            if(sum < target){
                i++;
            }
            
            if(sum > target){
                j--;
            }
        }
        return ans;
    }
    
    public static void main(String[] args) {
        int nums[] = {2,7,8,10,11};
        int ans[] = twoSum(nums, 9);
        System.out.println(ans[0]+" "+ans[1]);
    }
    
}
