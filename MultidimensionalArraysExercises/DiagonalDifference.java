package MultidimensionalArraysExercises;

import java.util.Scanner;

public class DiagonalDifference {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int size = Integer.parseInt(scanner.nextLine());
        int [][] matrix = new int[size][size];

        for (int row = 0; row < size; row++) {
            String [] rowInput = scanner.nextLine().split(" ");
            for (int col = 0; col < size; col++) {
                matrix[row][col] = Integer.parseInt(rowInput[col]);
            }
        }

        int mainDiagonal = 0;
        for (int index = 0; index < size; index++) {
            mainDiagonal += matrix[index][index];
        }

        int secondaryDiagonal = 0;
        // row ++
        // col --
        for (int row = size - 1, col = 0; col < size && row >=0 ; row--, col++) {
            secondaryDiagonal += matrix[row][col];
        }
        System.out.println(Math.abs(mainDiagonal - secondaryDiagonal));
    }
}
