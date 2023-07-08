/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Algorithm_Level1;

/**
 *
 * @author Acer
 */
public class SingleNumber_Day14 {
    
    public static int single(int nums[]){
        int ans = 0;
        for (int x : nums) {
            ans = ans^x;
        }
        return ans;
    }
    
    public static void main(String[] args) {
        int nums[] = {1,1,3,3,2,4,4};
        System.out.println(single(nums));
    }
    
}
