/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DataStructure_Level1;

/**
 *
 * @author Acer
 */
public class Day5_SearchA2dMatrix_74 {
    
    public static boolean searchMatrix(int[][] matrix, int target) {
        int n = matrix.length;
        int m = matrix[0].length;
        for(int i = 0; i < n; i++){
            int l = 0;
            int r = m-1;
            int j = 0;
            while(l <= r){
                j = l+(r-l)/2;
                if(matrix[i][j] == target){
                    return true;
                }
                
                if(matrix[i][j] < target){
                    l = j+1;
                }
                
                if(matrix[i][j] > target){
                    r = j-1;
                }
            }
        }
        return false;
    }
    
    public static void main(String[] args) {
        int matrix[][] = {{1,2,3},{4,5,6},{7,8,9}};
        int target = 7;
        System.out.println(searchMatrix(matrix, target));
    }
    
}
