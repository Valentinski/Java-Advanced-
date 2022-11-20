package ExamPreparation14Oct22;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.Collectors;

public class OsPlanning {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // contains all the tasks in LIFO order
        ArrayDeque<Integer> tasks = new ArrayDeque<>();

        // we read the data like a Stack
        Arrays.stream(scanner.nextLine().split(", "))
                .map(Integer::parseInt)
                .forEach(tasks::push);

        //second method to read data, the same as the first
        ArrayDeque<Integer> threads = Arrays.stream(scanner.nextLine().split("\\s+"))
                .map(Integer::parseInt)
                .collect(Collectors.toCollection(ArrayDeque::new));

        int endTask = Integer.parseInt(scanner.nextLine());

        //we have to take not to remove
        int task = tasks.peek();
        int thread = threads.peek();

        while (task != endTask){
            if(thread >= task){
                tasks.pop(); // remove element from Stack

            }
           threads.poll(); // remove element from Queue
           task = tasks.peek();
           thread = threads.peek();
        }

        System.out.println("Thread with value "+threads.peek() +" killed task "+endTask);

        String leftThreads = threads.stream()
                .map(String::valueOf)
                .collect(Collectors.joining(" "));

        System.out.println(leftThreads);
    }
}
