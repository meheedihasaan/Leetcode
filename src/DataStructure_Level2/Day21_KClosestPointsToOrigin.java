/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DataStructure_Level2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 *
 * @author Acer
 */
public class Day21_KClosestPointsToOrigin {
    
    public static int[][] kClosest(int points[][], int k){
        List<int[]> list = new ArrayList<>();
        for (int point[] : points) {
            int distance = (point[0]*point[0]) + (point[1]*point[1]);
            int arr[] = new int[]{distance, point[0], point[1]};
            list.add(arr);
        }
        
        Collections.sort(list, new Comparator<int[]>(){

            @Override
            public int compare(int[] t, int[] t1) {
                int comparison = t[0]-t1[0];
                return comparison;
            }
            
        });
        
        int ans[][] = new int[k][2];
        for (int i = 0; i < k; i++) {
            int arr[] = list.get(i);
            ans[i][0] = arr[1];
            ans[i][1] = arr[2];
        }
        return ans;
    }
    
    public static void main(String[] args) {
        int points[][] = {{1,2},{5,7},{-1,-2}};
        int ans[][] = kClosest(points, 2);
        for (int i = 0; i < ans.length; i++) {
            System.out.println(ans[i][0]+" "+ans[i][1]);
        }
    }
    
}
