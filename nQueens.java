public class nQueens {

    public static boolean issafe(char board[][], int row, int col) {

        // verticaly up

        for (int i = row - 1; i >= 0; i--) {
            if (board[i][col] == 'Q') {
                return false;
            }
        }

        // diagonal left up
        for (int i = row - 1, j = col - 1; i >= 0 && j >= 0; i--, j--) {
            if (board[i][j] == 'Q') {
                return false;
            }
        }

        // diagonal right up

        for (int i = row - 1, j = col + 1; i >= 0 && j <board.length; i--, j++) {
            if (board[i][j] == 'Q') {
                return false;
            }
        }


        return true;

    }

    public static void nQueens(char board[][], int i) {

        // i==row

        if (i == board.length) {
            pb(board);
            return;
        }

        for (int j = 0; j < board.length; j++) {

            if (issafe(board, i, j)) {

                board[i][j] = 'Q';
                nQueens(board, i + 1);
                board[i][j] = '.';
            }
        }

    }

    public static void pb(char board[][]) {
        int n = board.length;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(board[i][j] + " ");
            }
            System.out.print("\n");
        }

        System.out.println("-----------------------------------------");
    }

    public static void main(String[] args) {
        int n = 4;
        char board[][] = new char[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                board[i][j] = '.';
            }

        }

        nQueens(board, 0);
    }
}