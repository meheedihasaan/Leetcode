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
public class Day4_SearchA2dMatrix2_240 {
    
    public static boolean searchMatrix(int[][] matrix, int target) {
        int n = matrix.length;
        int m = matrix[0].length;        
        for(int i = 0; i < n; i++){
            int l = 0;
            int r = m-1;
            int mid;
            while(l <= r){
                mid = l+(r-l)/2;
                if(matrix[i][mid] == target){
                    return true;
                }
                
                if(matrix[i][mid] < target){
                    l++;
                }
                
                if(matrix[i][mid] > target){
                    r--;
                }
            }
        }
        return false;
    }
    
    public static void main(String[] args) {
        int matrix[][] = {{1,2,3},{4,5,6},{7,8,9}};
        System.out.println(searchMatrix(matrix, 10));
    }
    
}
