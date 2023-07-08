/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Algorithm_Level2;

/**
 *
 * @author User
 */
public class Day8_SurroundedRegion {
    
    public void solve(char[][] board) {
        int n = board.length;
        int m = board[0].length;
        
        //If any cell of 1st row, last row, 1st column and last colunm is 'O' then 4-diagonally connected cell of that cell which is 'O' can not be 'X'. So mark these cell as 'M' using dfs. The rest of the 'O' cell can be 'X'. So change them.
        
        //For first and last row
        for(int i = 0; i < m; i++){
            if(board[0][i] == 'O'){
                dfs(0, i, board);
            }
            
            if(board[n-1][i] == 'O'){
                dfs(n-1, i, board);
            }
        }
        
        //For first and last column
        for(int i = 0; i < n; i++){
            if(board[i][0] == 'O'){
                dfs(i, 0, board);
            }
            
            if(board[i][m-1] == 'O'){
                dfs(i, m-1, board);
            }
        }
        
        //Update Cell
        for(int i = 0; i < n; i++){
            for(int j = 0; j < m; j++){
                if(board[i][j] == 'O'){
                    board[i][j] = 'X';
                }
                
                if(board[i][j] == 'M'){
                    board[i][j] = 'O';
                }
            }
        }
    } 
    
    //Applying dfs
    public void dfs(int i, int j, char[][] board){
        if(i < 0 || i >= board.length || j < 0 || j >= board[0].length){
          return;
        }
        
        if(board[i][j] == 'X' || board[i][j] == 'M'){
            return;
        }
        
        if(board[i][j] == 'O'){
            board[i][j] = 'M';
        }    
        
        dfs(i, j+1, board);
        dfs(i, j-1, board);
        dfs(i+1, j, board);
        dfs(i-1, j, board);
    }
    
}
