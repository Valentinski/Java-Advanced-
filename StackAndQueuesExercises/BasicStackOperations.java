package StackAndQueuesExercises;

import java.util.ArrayDeque;
import java.util.Scanner;

public class BasicStackOperations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String [] command = scanner.nextLine().split(" ");

        int countToPush = Integer.parseInt(command[0]);
        int countToPop = Integer.parseInt(command[1]);
        int elementToSearch = Integer.parseInt(command[2]);

        ArrayDeque <Integer> stack = new ArrayDeque<>();

        String [] numbersToAdd = scanner.nextLine().split(" ");

        for (int i = 0; i < countToPush; i++) {
            stack.push(Integer.parseInt(numbersToAdd[i]));
        }

        for (int i = 0; i < countToPop ; i++) {
            stack.pop(); // removing the elements
        }

        // if we find the number print true
        // if is not there print the minimum element
        // if the stack is empty print 0

        if(stack.isEmpty()){
            System.out.println("0");
        }else if(stack.contains(elementToSearch)){
            System.out.println(true);
        }else {
            int minElement = Integer.MAX_VALUE;
            for (Integer number : stack) {
                if (number < minElement) {
                    minElement = number;
                }
            }
            System.out.println(minElement);
        }

    }
}
