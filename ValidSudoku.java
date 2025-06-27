import java.util.HashSet;
    class ValidSudoku{

    public static boolean isValidSudoku(char[][] board) {

        for(int i=0;i<9;i++) {
            HashSet<Character> rows=new HashSet<>();
            HashSet<Character> cols=new HashSet<>();
            HashSet<Character> box=new HashSet<>();

               for(int j=0;j<9;j++) {
                // for rows
                if(board[i][j] !='.') {
                    if(rows.contains(board[i][j])) return false;
                    rows.add(board[i][j]);
                }
                // for cols
                if(board[j][i]!='.') {
                    if(cols.contains(board[j][i])) return false;
                    cols.add(board[j][i]);
                }
                int rowIndex=3*(i/3);
                int colIndex=3*(i%3);
                int row=rowIndex+ j/3;
                int col=colIndex+ j%3;
                if(board[row][col] !='.') {
                    if(box.contains(board[row][col])) return false;
                    box.add(board[row][col]);
                }
               } 
        }
        return true;
    }
    public static void main(String[] args) {
     char[][] board = {
            {'1','2','.','.','3','.','.','.','.'},
            {'4','.','.','5','.','.','.','.','.'},
            {'.','9','8','.','.','.','.','.','3'},
            {'5','.','.','.','6','.','.','.','4'},
            {'.','.','.','8','.','3','.','.','5'},
            {'7','.','.','.','2','.','.','.','6'},
            {'.','.','.','.','.','.','2','.','.'},
            {'.','.','.','4','1','9','.','.','8'},
            {'.','.','.','.','8','.','.','7','9'}
        };
       boolean result= isValidSudoku(board);
       System.out.println(result);
    }
}
