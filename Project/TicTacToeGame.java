package Project;
import java.util.Scanner;

import javax.swing.border.Border;;
public class TicTacToeGame {
    public static void main(String[] args) {
        // 1. Set up the board: create a 3 X 3 matrix of string data type with default value
        final int BOARD_SIZE = 3;
        String currentPlayer = "X";
        boolean isGameOver = false;

        String[][] board = new String[BOARD_SIZE][BOARD_SIZE];
        setUpBoard(board);
        // 2. Print the board
        printBoard(board);

        // 3. Prompt the user to pick a spot on the board
        Scanner userInput = new Scanner(System.in);
        System.out.print("Please pick a row (0, 1, or 2): ");
        int rowId = userInput.nextInt();
        System.out.print("Please pick a column (0, 1, or 2: ");
        int columnId = userInput.nextInt(); 

        // if (isGameOver == true)
        //    Print the confirmation message
        // else
        //    Repeat step 4 to 5
        while (!isGameOver){             
            // 4. if the spot is available, then place the marker on the spot
            // else, ask the user to pick a different spot            
            if (isValidMove(board, rowId, columnId)){
                // place the marker at the spot
                placeMarker(board, rowId, columnId, currentPlayer);

                isGameOver = updateGameStatus(board, currentPlayer);
            
                 // 5. Print the board and update the game status
                printBoard(board); 
                // switch the player
                if (currentPlayer == "X")
                    currentPlayer = "O";
                else
                    currentPlayer = "X";               
            }  
            System.out.print("Please pick a row (0, 1, or 2): ");
            rowId = userInput.nextInt();
            System.out.print("Please pick a column (0, 1, or 2: ");
            columnId = userInput.nextInt();
        } 
        userInput.close();
   
    }

    private static boolean updateGameStatus(String[][] board, String currentPlayer) {
        return false;
    }

    private static void placeMarker(String[][] board, int rowId, int columnId, String currentPlayer) {
        board[rowId][columnId] = currentPlayer;
    }

    private static boolean isValidMove(String[][] board, int rowId, int columnId) {
        if (rowId >= 3 || columnId >= 3 || rowId < 0 || columnId < 0)
        {
            return false;
        }
        return true;
    }

    private static void setUpBoard(String[][] board) {
        for (int i = 0; i < board.length; i++){
            for (int j = 0; j < board[i].length; j++){
                board[i][j] = " ";
            }
        }
    }

    private static void printBoard(String[][] board) {
        for (int i = 0; i < board.length; i++){
            System.out.println("-------------");
            for (int j = 0; j < board[i].length; j++){
                System.out.printf("| %s ", board[i][j]);
            }
            System.out.println("|");
        }
        System.out.println("-------------");
    }
    

}
