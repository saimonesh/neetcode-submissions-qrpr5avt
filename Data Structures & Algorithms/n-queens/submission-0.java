class Solution {
    public List<List<String>> solveNQueens(int n) {
        List<List<String>> result = new ArrayList<>();
        var temp = new int[n][n];
        arrange(temp,0,result,n);
        return result;
    }

      public void arrange(int[][] board, int col,
                        List<List<String>> result, int n) {

        // all queens placed
        if (col == n) {
            result.add(build(board, n));
            return;
        }

        for (int row = 0; row < n; row++) {

            if (valid(board, row, col, n)) {

                // place queen
                board[row][col] = 1;

                // next column
                arrange(board, col + 1, result, n);

                // backtrack
                board[row][col] = 0;
            }
        }
    }

    public boolean valid(int[][] board, int r, int c, int n) {

        // check left row
        for (int i = 0; i < c; i++) {
            if (board[r][i] == 1)
                return false;
        }

        // upper-left diagonal
        for (int i = r - 1, j = c - 1;
             i >= 0 && j >= 0;
             i--, j--) {

            if (board[i][j] == 1)
                return false;
        }

        // lower-left diagonal
        for (int i = r + 1, j = c - 1;
             i < n && j >= 0;
             i++, j--) {

            if (board[i][j] == 1)
                return false;
        }

        return true;
    }

    public List<String> build(int[][] board, int n) {

        List<String> temp = new ArrayList<>();

        for (int i = 0; i < n; i++) {

            StringBuilder sb = new StringBuilder();

            for (int j = 0; j < n; j++) {

                if (board[i][j] == 1)
                    sb.append("Q");
                else
                    sb.append(".");
            }

            temp.add(sb.toString());
        }

        return temp;
    }

}
