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
public class Day19_FindTheTownJudge {
    
    public static int findJudge(int n, int trust[][]){
        int arr[] = new int[n+1];
        for (int i = 0; i < trust.length; i++) {
            int x = trust[i][0];
            int y = trust[i][1];
            arr[x]--;
            arr[y]++;
        }
        
        int ans = -1;
        for (int i = 1; i < arr.length; i++) {
            if(arr[i] == n-1){
                ans = i;
                break;
            }
        }
        return ans;
    }
    
    
    public static void main(String[] args) {
        int n = 4;
        int trust[][] = {{1, 3}, {2, 3}, {4, 3}, {2, 4}, {1, 4}};
        System.out.println(findJudge(n, trust));
    }
    
}
