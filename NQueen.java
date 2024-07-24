import java.util.*;
public class NQueen {
    public static boolean isSafe(int row, int col, char[][]board){
        //horizontal
        for(int i=0;i<board.length;i++){
            if(board[row][i]=='Q'){
                return false;
            }
        }
        //vertical
        for(int j=0;j<board.length;j++){
            if(board[j][col]=='Q'){
                return false;
            }
        }
        //top left
        int r=row;
        for(int c=col;c>=0 && r>=0;r--,c--){
            if(board[r][c]=='Q'){
                return false;
            }
        }
        //top right
        r=row;
        for(int c=col;c<board.length && r>=0;r--,c++){
            if(board[r][c]=='Q'){
                return false;
            }
        }
        //lower left
        r=row;
        for(int c=col;c>=0 && r<board.length;r++,c--){
            if(board[r][c]=='Q'){
                return false;
            }
        }
        //lower right
        r=row;
        for(int c=col;c<board.length && r<board.length;r++,c++){
            if(board[r][c]=='Q'){
                return false;
            }
        }
        return true;
    }
    public static void saveboard(char[][]board, List<List<String>> allboard){
        String row="";
        List<String> NewBoard = new ArrayList<>();
        for(int i=0;i<board.length;i++){
            row="";
            for(int j=0;j<board[0].length;j++){
                if(board[i][j]=='Q'){
                    row+="Q";
                }else{
                    row+=".";
                }
            }
            NewBoard.add(row);
        
        }
        allboard.add(NewBoard);

    }
    public static void helper(char [][] board, List<List<String>> allboard, int col){
        if(col==board.length){
            saveboard(board,allboard);
            return;
        }
        for(int row=0;row<board.length;row++){
            if(isSafe(row,col,board)){
                board[row][col]='Q';
                helper(board,allboard,col+1);
                board[row][col]='.';
            }
        }
    }
    public static List<List<String>> SolveNQueen(int n){
        List<List<String>> allboard = new ArrayList<>();
        char board[][] = new char[n][n];
        helper(board,allboard,0);
        return allboard;
    }
    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner Sc = new Scanner(System.in);
        int n = Sc.nextInt();
        System.out.println(SolveNQueen(n));

        
    }
    
}