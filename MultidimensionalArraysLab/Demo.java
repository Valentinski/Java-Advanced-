package MultidimensionalArraysLab;

import java.util.Scanner;

public class Demo {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        int [] firstArr = {13, 43};
        int [] secondArr = {13, 43};

        int [] [] arr = {firstArr, secondArr};

        int [] [] matrix =  new int[n][];

        int [] studentsNumbers = new int[n];

        for (int i = 0; i < n ; i++) {
            int number = Integer.parseInt(scanner.nextLine());
            studentsNumbers[i] = number;
        }

        for (int studentsNumber : studentsNumbers) {
            System.out.println(studentsNumber);
        }

    }
}
