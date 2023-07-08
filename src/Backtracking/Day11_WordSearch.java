/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Backtracking;

/**
 *
 * @author User
 */
public class Day11_WordSearch {
    
    public boolean exist(char[][] board, String word){
        int n = board.length;
        int m = board[0].length;
        for(int i = 0; i < board.length; i++){
            for (int j = 0; j < board[0].length; j++) {
                if(board[i][j] == word.charAt(0)){
                    if(dfs(i, j, board, 0, word)){
                        return true;
                    }
                }
            }
        }
        return false;
    }
    
    public boolean dfs(int i, int j, char[][] board, int index, String word){
        if(index == word.length()){
            return true;
        }
        
        if(i < 0 || j < 0 || i >= board.length || j >= board[0].length){
            return false;
        }
        
        if(board[i][j] != word.charAt(index)){
            return false;
        }
        
        char current = board[i][j];
        board[i][j] = '#';
        
        boolean top = dfs(i-1, j, board, index+1, word);
        boolean bottom = dfs(i+1, j, board, index+1, word);
        boolean left = dfs(i, j-1, board, index+1, word);
        boolean right = dfs(i, j+1, board, index+1, word);
        
        //Backtracking
        board[i][j] = current;
        
        return top || bottom || left || right;
    }
    
}
