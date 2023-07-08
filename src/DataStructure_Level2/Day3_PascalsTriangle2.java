/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DataStructure_Level2;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Acer
 */
public class Day3_PascalsTriangle2 {
    
    public static List<Integer> pascalsTriangle(int rowIndex){
        int n = 34;
        int arr[][] = new int[n][n];
        List<List<Integer>> ans = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            List<Integer> innerList = new ArrayList<>();
            for (int j = 0; j <= i; j++) {
                if(j == 0 || j == n-1){
                    arr[i][j] = 1;
                }
                else{
                    arr[i][j] = arr[i-1][j-1]+arr[i-1][j];
                }
                innerList.add(arr[i][j]);
            }
            ans.add(innerList);
        }
        return ans.get(rowIndex);
    }
    
    public static void main(String[] args) {
        System.out.println(pascalsTriangle(4));
    }
    
}
