class Solution {
    public List<List<String>> solveNQueens(int n) {
        List<List<String>> allboards = new ArrayList<>();
        char[][] board = new char[n][n];
        helper(allboards, board, 0);
        return allboards;
    }
    public void helper(List<List<String>> allboards, char[][] board, int cols) {
        if(cols==board.length) {
            saveBoard(allboards, board);
            return;
        }
        
        for(int row = 0 ; row <board.length; row++) {
            if(isSafe(row,cols,board)) {
                board[row][cols] = 'Q';
                helper(allboards, board, cols+1);
                board[row][cols] = '.';
            }
        }
    }
    
    public boolean isSafe(int row, int cols, char[][] board) {
        for(int i = 0; i<board.length; i++) {
            if(board[i][cols] == 'Q') {
                return false;
            }
        }
        
        for(int i = 0; i<board.length;i++) {
            if(board[row][i] == 'Q') {
                return false;
            }
        }
        
        int r=row;
        for(int c=cols; c>=0 && r>=0; c--,r--) {
            if(board[r][c] == 'Q') {
                return false;
            }
        }
        
        r=row;
        for(int c=cols; c<board.length && r>=0; c++,r--) {
            if(board[r][c] == 'Q') {
                return false;
            }
        }
        
        r=row;
        for(int c=cols; c>=0 && r<board.length; c--,r++) {
            if(board[r][c] == 'Q') {
                return false;
            }
        }
        
        r=row;
        for(int c=cols; c<board.length && r<board.length; c++,r++) {
            if(board[r][c] == 'Q') {
                return false;
            }
        }
        
        return true;
    }
    
    public void saveBoard(List<List<String>> allboard, char[][] board) {
        String row="";
        List<String> list = new ArrayList<>();
        for(int i =0 ; i<board.length;i++) {
            row="";
            for(int j=0;j<board[i].length;j++) {
                if(board[i][j] == 'Q') {
                    row+='Q';
                }
                else {
                    row+='.';
                }
            }
            list.add(row);
        }
        allboard.add(list);
    }
}