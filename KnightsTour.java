import java.util.*;

public class KnightsTour {
int[][] board = new int[8][8];

public KnightsTour(){
        place(this.board,0,1,0);
        System.out.println("Solution Found");
        System.out.println(Arrays.deepToString(this.board).replaceAll("],", "\n"));
        System.out.println("");
}


// =============================================================================
// Check
// =============================================================================
private void place(int[][] board, int row, int coloumn,int numberOfTurns){
        if (board[row][coloumn] > 0) {
                return;
        }

        board[row][coloumn] = numberOfTurns+1;

        if(row-2 < 5 && row-2 > -1 && coloumn-1 < 8 && coloumn-1 > -1) {
                place(board, row-2, coloumn-1,numberOfTurns+1);
        }

        if(row-2 < 5 && row-2 > -1 && coloumn+1 < 8 && coloumn+1 > -1) {
                place(board, row-2, coloumn+1,numberOfTurns+1);
        }

        if(row-1 < 5 && row-1 > -1 && coloumn+2 < 8 && coloumn+2 > -1) {
                place(board, row-1, coloumn+2,numberOfTurns+1);
        }

        if(row-1 < 5 && row-1 > -1 && coloumn-2 < 8 && coloumn-2 > -1) {
                place(board, row-1, coloumn-2,numberOfTurns+1);
        }

        if(row+2 < 5 && row+2 > -1 && coloumn+1 < 8 && coloumn+1 > -1) {
                place(board, row+2, coloumn+1,numberOfTurns+1);
        }

        if(row+2 < 5 && row+2 > -1 && coloumn-1 < 8 && coloumn-1 > -1) {
                place(board, row+2, coloumn-1,numberOfTurns+1);
        }

        if(row+1 < 5 && row+1 > -1 && coloumn+2 < 8 && coloumn+2 > -1) {
                place(board, row+1, coloumn+2,numberOfTurns+1);
        }

        if(row+1 < 5 && row+1 > -1 && coloumn-2 < 8 && coloumn-2 > -1) {
                place(board, row+1, coloumn-2,numberOfTurns+1);
        }

        if(isFull() == false) {
                board[row][coloumn] = 0;
        }

}

private boolean isFull(){
        for (int i =0; i < 8; i++) {
                for (int j =0; j < 8; j++) {
                        if(this.board[i][j] == 64) {
                                return true;
                        }
                }
        }
        return false;
}

public static void main(String[] args){
        KnightsTour knight = new KnightsTour();
}
}
