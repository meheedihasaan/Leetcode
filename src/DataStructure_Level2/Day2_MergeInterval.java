/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DataStructure_Level2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashSet;

/**
 *
 * @author Acer
 */
public class Day2_MergeInterval {
    
    public static int[][] mergeInterval(int[][] intervals){
        //Sorting the array on the order of first column
        Arrays.sort(intervals, new Comparator<int[]>(){

            @Override
            public int compare(int[] a, int[] b) {
                return a[0]-b[0];
            }
            
        });
        
        ArrayList<int[]> list = new ArrayList<>();        
        int min = intervals[0][0];
        int max = intervals[0][1];
        for (int i = 0; i < intervals.length; i++) {
            int x = intervals[i][0];
            if(x <= max){
                max = Math.max(max, intervals[i][1]);
            }
            else{
                list.add(new int[]{min, max});
                //Set Current Min and Max
                min = intervals[i][0];
                max = intervals[i][1];
            }
        }
        if(!list.contains(new int[]{min, max})){
            list.add(new int[]{min, max});
        }
        int ans[][] = new int[list.size()][2];
        for (int i = 0; i < list.size(); i++) {
            ans[i][0] = list.get(i)[0];
            ans[i][1] = list.get(i)[1];
        }
        return ans;
    }
    
    public static void main(String[] args) {
        int intervals[][] = {{1,2}, {0,2}, {2,3}};
        mergeInterval(intervals);
        for (int i = 0; i < intervals.length; i++) {
            System.out.println(intervals[i][0]+" "+intervals[i][1]);
        }
    }
    
}
