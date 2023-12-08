import java.util.ArrayList;
import java.util.Scanner;

class nQueens {
    public static void saveBoard(ArrayList<ArrayList<String>> allBoards, char[][] charBoard){
        ArrayList<String> newBoard = new ArrayList<>();
        for(int r = 0; r < charBoard.length; r++){
            String rowEntry = "";
            for(int c = 0; c < charBoard.length; c++){
                rowEntry += charBoard[r][c];  
            }
            newBoard.add(rowEntry);
        }
        allBoards.add(newBoard);
    }

    public static void nQueensRec(ArrayList<ArrayList<String>> allBoards, char[][] charBoard, int size, int col){
        for(int row = 0; row < size; row++){
            if(col==size+1){
                saveBoard(allBoards, charBoard);
            }
            
            if(isSafe(row, col)){
                charBoard[row][col] = 'Q';
                nQueensRec(allBoards, charBoard, size, col+1);
                charBoard[row][col] = '.';
                continue;
            }
        }
        
        System.out.println(allBoards);

    }

    public static void main(String args[]){
        ArrayList<ArrayList<String>> allBoards = new ArrayList<>();
        System.out.println("Enter the board size: ");
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        char[][] charBoard = new char[size][size];
        nQueensRec();


    }
    
}
