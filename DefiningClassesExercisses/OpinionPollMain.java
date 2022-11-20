package DefiningClassesExercisses;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class OpinionPollMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numberOfPeople = Integer.parseInt(scanner.nextLine());

        List<OpPearson> people = new ArrayList<>();

        for (int i = 0; i < numberOfPeople; i++) {
            String [] personData = scanner.nextLine().split(" ");
            String firsName = personData[0];
            int age = Integer.parseInt(personData[1]);

            OpPearson person = new OpPearson(firsName, age);
            people.add(person);

        }

        people.stream()
                .filter(person -> person.getAge() > 30 )
                .sorted((left, right) -> left.getName().compareTo(right.getName()))
                .forEach(person -> System.out.printf("%s - %d%n", person.getName(), person.getAge()));
    }
}
