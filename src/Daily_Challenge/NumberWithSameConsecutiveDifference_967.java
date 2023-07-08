/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Daily_Challenge;

import java.util.HashSet;

/**
 *
 * @author Acer
 */
public class NumberWithSameConsecutiveDifference_967 {
    
    public int[] numsSameConsecDiff(int n, int k) {
        HashSet<Integer> set = new HashSet<>();
        for (int i = 1; i <= 9; i++) {
            int current = 0;
            dfs(n, k, set, current, i);
        }
        
        int ans[] = new int[set.size()];
        int i = 0;
        for (int num : set) {
            ans[i] = num;
            i++;
        }
        return ans;
    }
    
    public void dfs(int n, int k, HashSet<Integer> set, int current, int digit){
        if(n == 1){
            current = (current*10) + digit;
            set.add(current);
            return;
        }
        
        current = (current*10) + digit;
        if(digit+k <= 9 && digit+k >= 0){
            dfs(n-1, k, set, current, digit+k);
        }
        
        if(digit-k <= 9 && digit-k >= 0){
            dfs(n-1, k, set, current, digit-k);
        }
    }
    
    public static void main(String[] args) {
        NumberWithSameConsecutiveDifference_967 t = new NumberWithSameConsecutiveDifference_967();             
        int ans[] = t.numsSameConsecDiff(3, 7);
        for (int i = 0; i < ans.length; i++) {
            System.out.print(ans[i]+" ");
        }
        System.out.println();
    }
    
}
