class Solution {
    public List<List<String>> solveNQueens(int n) {
        List<List<String>> allBoards = new ArrayList<>();
        char[][] board = new char[n][n];
        helper(allBoards, board, 0);
        return allBoards;
    }
    
    public void helper(List<List<String>> allBoards, char[][] board, int col) {
        if(col == board.length) {
            saveBoard(allBoards,board);
            return;
        }
        for(int row = 0 ; row<board.length; row++) {
            if(isSafe(row,col,board)) {
                board[row][col] = 'Q';
                helper(allBoards, board, col+1);
                board[row][col] = '.';
            }
        }
    }
    
    public boolean isSafe(int row, int col, char[][] board) {
        //Horizontal line
        for(int j= 0; j<board.length; j++) {
            if(board[row][j] == 'Q') {
                return false;
            }
        }
        //Vertical line
        for(int i = 0; i<board[0].length ; i++) {
            if(board[i][col] == 'Q') {
                return false;
            }
        }
        //upper left
        int r= row;
        for(int c = col; c>=0 && r>=0; c--,r--) {
            if(board[r][c] == 'Q') {
                return false;
            }
        }
        
        //upper right
        r= row;
        for(int c=col; c<board.length && r>=0 ;c++,r--) {
            if(board[r][c] == 'Q') {
                return false;
            }
        }
        
        //lower left
        r= row;
        for(int c = col ; c>=0 && r<board.length ; r++,c--) {
            if(board[r][c] == 'Q') {
                return false;
            }
        }
        
        //lower right
        r= row;
        for(int c = col ;c<board.length && r<board.length ; r++,c++) {
            if(board[r][c] == 'Q') {
                return false;
            }
        }
        
        //Queen is in safe square
        return true;
    }
    
    public void saveBoard(List<List<String>> allBoards, char[][] board) {
        String row="";
        List<String> newBoard = new ArrayList<>();
        for(int i=0; i<board.length;i++) {
            row="";
            for(int j=0; j<board[i].length;j++) {
                if(board[i][j] == 'Q') {
                    row+='Q';
                }
                else {
                    row+='.';
                }
            }
            newBoard.add(row);
        }
        allBoards.add(newBoard);
    }
}