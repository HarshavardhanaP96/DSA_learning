class Solution {
    int ans=0;
    public int totalNQueens(int n) {
        boolean[][] board = new boolean[n][n];
        helper(board, n,0);
        return ans;
    }

    public void helper(boolean[][] board, int n, int row){
        if(row==n){
            ans++;
            return;
        }

        for(int col=0;col<n;col++){
            board[row][col]=true;
            if(isValid(board,n,row,col)){
                helper(board,n,row+1);
            }
            board[row][col]=false;
        }

        return;
    }

    public boolean isValid(boolean[][] board, int n, int row, int col){

        for(int i=0;i<n;i++){
            if(col!=i && board[row][i]) return false;
        }

        for(int i=0;i<n;i++){
            if(row!=i && board[i][col]) return false;
        }

        int tr =row+1, tc=col+1;

        while(tr<n&&tc<n &&tr>=0&&tc>=0){
            if(board[tr][tc]) return false;
            tr++;
            tc++;
        }

        tr =row-1;tc=col-1;

        while(tr<n&&tc<n &&tr>=0&&tc>=0){
            if(board[tr][tc]) return false;
            tr--;
            tc--;
        }

        tr =row+1;tc=col-1;

        while(tr<n&&tc<n &&tr>=0&&tc>=0){
            if(board[tr][tc]) return false;
            tr++;
            tc--;
        }

        tr =row-1;tc=col+1;

        while(tr<n&&tc<n &&tr>=0&&tc>=0){
            if(board[tr][tc]) return false;
            tr--;
            tc++;
        }

        return true;
    }
}