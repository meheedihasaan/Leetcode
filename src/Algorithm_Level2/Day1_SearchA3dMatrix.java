/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Algorithm_Level2;

/**
 *
 * @author Acer
 */
public class Day1_SearchA3dMatrix {
    
    public static boolean searchMatrix(int[][] matrix, int target) {
        int n = matrix.length;
        int m = matrix[0].length;
        int i = 0;
        int j = m-1;
        while(i < n && j >= 0){
            if(matrix[i][j] == target){
                return true;
            }
            
            if(matrix[i][j] < target){
                i++;
            }
            else if(matrix[i][j] > target){
                j--;
            }
        }
        return false;
    }
    
    public static void main(String[] args) {
        int matrix[][] = {{1,2,3},{4,5,6},{7,8,9}};
        System.out.println(searchMatrix(matrix, 5));
    }
    
}
