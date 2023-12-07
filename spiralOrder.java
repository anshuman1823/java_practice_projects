import java.util.Scanner;

class spiralOrder{
    public static void main(String[] args) {   
        System.out.print("Enter the size of the 2D array (rows & cols) that you want to create: ");
        Scanner sc = new Scanner(System.in);
        int rows = sc.nextInt();
        int cols = sc.nextInt();
        int matrix[][] = new int[rows][cols];
        rows = rows-1;
        cols = cols-1;

        //input
        for(int i = 0; i<=rows; i++){
            for(int j = 0; j <=cols; j++){
                System.out.println("Enter matrix element " + i + "," + j);
                matrix[i][j] = sc.nextInt();
            }
        }

        //output
        for(int i = 0; i<=rows; i++){
            for(int j = 0; j <=cols; j++){
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

        for(int n = 0; (n < (rows/2 + 1)) && (n< (cols/2+1)); n++){
            for (int j = n; j <=cols - n; j++){
                System.out.print(matrix[n][j] + " ");
            }
        
            for (int i = n+1; i <=rows - n; i++){
                System.out.print(matrix[i][cols-n] + " ");
            }

            for (int j = cols-(n+1); j >= n; j--){
                System.out.print(matrix[rows-n][j] + " ");
            }

            for (int i = rows-(n+1); i >= (n+1); i--){
                System.out.print(matrix[i][n] + " ");
            }
        }
        
    }
}