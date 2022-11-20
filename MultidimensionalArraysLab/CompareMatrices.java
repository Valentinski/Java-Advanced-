package MultidimensionalArraysLab;

import java.util.Arrays;
import java.util.Scanner;

public class CompareMatrices {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int arrayCount = scanner.nextInt(); // R
        int sizeOfArray = scanner.nextInt(); // C

        int [][] first = new int[arrayCount][sizeOfArray];


        for (int i = 0; i < arrayCount ; i++) {
            for (int j = 0; j < sizeOfArray; j++) {
                first[i][j]= scanner.nextInt();
            }

        }

        arrayCount = scanner.nextInt();
        sizeOfArray = scanner.nextInt();

        int [][] second = new int [arrayCount][sizeOfArray];

        for (int r = 0; r < second.length ; r++) {
            for (int c = 0; c < second[r].length ; c++) {
                second[r][c] = scanner.nextInt();
            }
        }

        boolean areEqual = first.length == second.length && areArraysAreEqual(first, second);

        System.out.println(areEqual ? "equal" : "not equal");


    }

    private static boolean areArraysAreEqual(int[][] first, int[][] second) {

        for (int i = 0; i < first.length; i++) {

            int[] firstArr = first[i];
            int[] secondArr = second[i];

            if (firstArr.length != secondArr.length) {
                return false;
            }

            for (int j = 0; j < firstArr.length; j++) {
                int firstNumber = firstArr[j];
                int secondNumber = secondArr[j];

                if (firstNumber != secondNumber) {
                    return false;
                }
            }
        }
        return true;
    }
        // printing the matrix !!!
    public static void printMatrix (int [] [] matrix){
        for (int[] arr : matrix) {
            for ( int num : arr) {
                System.out.print(num + " ");
            }
            System.out.println();
        }

    }
}
