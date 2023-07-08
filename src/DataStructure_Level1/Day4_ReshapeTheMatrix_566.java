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
public class Day4_ReshapeTheMatrix_566 {
    
    public static int[][] matrixReshape(int[][] mat, int r, int c) {
        if(r*c != mat.length*mat[0].length){
            return mat;
        }
        
        int ans[][] = new int[r][c];
        int n = 0; int m = 0;
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[0].length; j++) {
                ans[n][m] = mat[i][j];
                m++;
                if(m == c){
                    n++;
                }
            }
        }
        return ans;
    }
    
    public static void main(String[] args) {
        int mat[][] = {{1,2},{3,4}};
        int ans[][] = matrixReshape(mat, 1, 4);
        for (int i = 0; i < ans.length; i++) {
            for (int j = 0; j < ans[0].length; j++) {
                System.out.print(ans[i][j]+" ");
            }
            System.out.println();
        }
    }
    
}
