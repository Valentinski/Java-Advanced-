package FunctionalProgrammingExercises;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class CustomComparator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Integer [] numbers = Arrays.stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .boxed()
                .toArray(Integer[]::new);

        Comparator<Integer> comparator = (first,second ) -> {
          if(first % 2 == 0 && second % 2 != 0){
              return -1;
              //first even
              //second odd
          }else if(first % 2!= 0 && second % 2== 0){
              return 1;
              //first odd
              //second even
          }
          // both are even
          // both are odd
          return first.compareTo(second);
        };

        Arrays.sort(numbers, comparator);

        Arrays.stream(numbers).forEach(e -> System.out.print(e + " "));
    }
}
