package MultidimensionalArraysLab;

import java.util.Arrays;
import java.util.Scanner;

public class PrintDiagonalOfSquareMatrix {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        int size =  Integer.parseInt(scanner.nextLine());

        int [][] matrix = new int[size][size];

        for (int i = 0; i < matrix.length; i++) {
            matrix[i] = Arrays.stream(scanner.nextLine().split("\\s+"))
                    .mapToInt(Integer::parseInt)
                    .toArray();
        }

        // finding the diagonals with for

       // for (int i = 0; i < matrix.length; i++) {
           // System.out.print(matrix[i][i] + " ");
       // }
       // System.out.println();

        // with while

        int row = 0;
        int col = 0;

        while (row< matrix.length && col < matrix[row].length){
            System.out.print(matrix[row][col] + " ");
            row++;
            col++;
        }

        System.out.println();

        //finding another diagonal
        row = matrix.length - 1;
        col = 0;

        while (row >=0 && col<matrix[row].length){
            System.out.print(matrix[row][col] + " ");
            row--;
            col++;
        }
    }
}
