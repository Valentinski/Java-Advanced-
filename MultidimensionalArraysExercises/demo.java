package MultidimensionalArraysExercises;

import java.util.*;

public class demo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //declare of matrix

        int [][] matrix = new int [2][3];
        for (int row = 0; row < 2; row++) {
            int [] rowFromConsole = Arrays.stream(scanner.nextLine()
                    .split(" "))
                    .mapToInt(Integer::parseInt)
                    .toArray();
            matrix[row] = rowFromConsole;
        }

        //printing
        int rows = Integer.parseInt(scanner.nextLine());
        int cols = Integer.parseInt(scanner.nextLine());

        for (int row = 0; row < rows; row++) {
            for (int col = 0; col < cols; col++) {
                System.out.print(matrix[row][col] + " ");
            }
            System.out.println();
        }


        //print with foreach
        for (int [] row : matrix) {
            for (int element : row) {
                System.out.print(element + " ");
            }
            System.out.println();
        }
    }
}
