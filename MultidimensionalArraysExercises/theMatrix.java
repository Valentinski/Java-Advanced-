package MultidimensionalArraysExercises;

import java.util.Arrays;
import java.util.Scanner;

public class theMatrix {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int [] rowsAndCols = Arrays.stream(scanner.nextLine().split("\\s+"))
                .mapToInt(Integer::parseInt)
                .toArray();

        int rows = rowsAndCols[0];
        int cols = rowsAndCols[1];

        char [][] matrix = new char[rows][cols];

        for (int r = 0; r < rows; r++) {
            matrix[r] = scanner.nextLine().replace("\\s+", "").toCharArray();
        }

        char newColor = scanner.nextLine().charAt(0);

        int [] clickedPixels = Arrays.stream(scanner.nextLine().split("\\s+"))
                .mapToInt(Integer::parseInt)
                .toArray();

        int clickedRow = clickedPixels[0];
        int clickedCol = clickedPixels[1];

        char oldColor = matrix[clickedRow][clickedCol];

        paint (matrix, newColor, oldColor, clickedRow, clickedCol);

        for (char[] line : matrix) {
            for (char c : line) {
                System.out.print(c);
            }
            System.out.println();
        }
    }

    private static void paint(char[][] matrix, char newColor, char oldColor, int clickedRow, int clickedCol) {

        if(isOutOfBounds(matrix, clickedRow,clickedCol) || matrix[clickedRow][clickedCol] != oldColor){
            return;
        }

        matrix[clickedRow][clickedCol] = newColor;

        paint(matrix, newColor, oldColor, clickedRow +1, clickedCol);
        paint(matrix, newColor, oldColor, clickedRow -1, clickedCol);
        paint(matrix, newColor, oldColor, clickedRow , clickedCol + 1);
        paint(matrix, newColor, oldColor, clickedRow , clickedCol -1);



    }

    private static boolean isOutOfBounds(char[][] matrix, int r, int c) {
        return r < 0 || r >= matrix.length || c < 0  || c >= matrix[r].length;
    }
}
