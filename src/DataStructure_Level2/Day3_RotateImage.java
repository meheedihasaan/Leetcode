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
public class Day3_RotateImage {
    
    public static void rotate(int[][] matrix) {
        int n = matrix.length;
        int temp[][] = new int[n][n];
        int p = 0, q = 0;
        for(int i = 0; i < n; i++){
            q = 0;
            for(int j = n-1; j >= 0; j--){
                temp[p][q] = matrix[j][i];
                q++;
            }
            p++;
        }
        
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                matrix[i][j] = temp[i][j];
            }
        }
    }
    
    public static void main(String[] args) {
        int matrix[][] = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        rotate(matrix);
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
    }
    
}
