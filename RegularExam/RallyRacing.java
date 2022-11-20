package RegularExam;

import java.util.Scanner;

public class RallyRacing {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int size = Integer.parseInt(scanner.nextLine());
        String racingNumber = scanner.nextLine();

        char [][] trace = new char[size][size];

        // i have to check this !!!
        int carRow = 0;
        int carCol = 0;

        for (int i = 0; i < size; i++) {
            String [] singleRow = scanner.nextLine().split(" ");
            for (int j = 0; j < size; j++) {
                    trace[i][j] = singleRow[j].charAt(0);

            }
        }

        int tunnels = 0;
        String command = scanner.nextLine();
        int km = 0;
        while (!command.equals("End")){
            trace[carRow][carCol] = '.';
            if(command.equals("right") && carCol != size -1 ){
                carCol++;
            } else if (command.equals("left") && carCol != 0) {
                carCol--;
            } else if (command.equals("down") && carRow != size - 1) {
                carRow++;
            } else if (command.equals("up") && carRow != 0) {
                carRow--;
            }else {
                trace[carRow][carCol] = '.';
            }

            if(trace[carRow][carCol] == 'T'){
                km += 30;
                trace[carRow][carCol] = '.';
                for (int i = 0; i < size; i++) {
                    for (int j = 0; j < size; j++) {
                       if(trace[i][j] == 'T') {
                           carRow = i;
                           carCol = j;
                           break;
                       }
                    }
                }
            } else if (trace[carRow][carCol] == '.') {
                km += 10;
            } else if (trace[carRow][carCol] == 'F') {
                trace[carRow][carCol] = 'C';
                km += 10;
                System.out.printf("Racing car %s finished the stage!%n", racingNumber);
                break;
            }
            command = scanner.nextLine();
        }
        if(command.equals("End")) {
            System.out.printf("Racing car %s DNF.%n", racingNumber);
            trace[carRow][carCol] = 'C';
        }
        System.out.printf("Distance covered %d km.%n",km);

        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                System.out.print(trace[i][j]);
            }
            System.out.println();
        }


    }
}
