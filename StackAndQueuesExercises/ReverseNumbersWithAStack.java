package StackAndQueuesExercises;

import java.util.ArrayDeque;
import java.util.Scanner;

public class ReverseNumbersWithAStack {
    public static void main (String [] args){
        Scanner scanner = new Scanner(System.in);

        String [] input = scanner.nextLine().split(" ");
        ArrayDeque <String> stack = new ArrayDeque<>();

        for (String number : input) {
            stack.push(number);
        }

        while (!stack.isEmpty()){
            System.out.printf("%s ", stack.pop());
        }
    }
}
