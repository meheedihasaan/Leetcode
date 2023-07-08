/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DataStructure_Level2;

import java.util.Arrays;
import java.util.Comparator;

/**
 *
 * @author Acer
 */
public class Day4_NonOverlappingIntervals {
    
    public static int solution(int intervals[][]){
        Arrays.sort(intervals, new Comparator<int[]>(){

            @Override
            public int compare(int[] a, int[] b) {
                return a[0]-b[0];
            }
            
        });
        
        int cnt = 0;
        int prev = intervals[0][1];
        for (int i = 1; i < intervals.length; i++) {
            int a = intervals[i][0];
            int b = intervals[i][1];
            if(a < prev){
                if(b >= prev){
                    cnt++;
                }
                else{
                    prev = b;
                    cnt++;
                }
            }
            else{
                prev = b;
            }
        }
        return cnt;
    }
    
    public static void main(String[] args) {
        int intervals[][] = {{1,2},{2,3},{3,4},{1,3}};
        System.out.println(solution(intervals));
    }
    
}
