package GenericsExercises;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String [] input = scanner.nextLine().split(" ");
        String name = input[0] +" "+ input[1];
        String city = input[2];
        Tuple<String , String> firsTuple = new Tuple<>(name, city);

        input = scanner.nextLine().split(" ");
        String firstName = input[0];
        Integer litersOfBear = Integer.parseInt(input[1]);
        Tuple<String, Integer> secondTuple = new Tuple<>(firstName, litersOfBear);

        input = scanner.nextLine().split(" ");
        Integer number = Integer.parseInt(input[0]);
        Double decimal = Double.parseDouble(input[1]);
        Tuple<Integer, Double> thirdTuple = new Tuple<>( number, decimal);


        System.out.println(firsTuple);
        System.out.println(secondTuple);
        System.out.println(thirdTuple);
    }
}
