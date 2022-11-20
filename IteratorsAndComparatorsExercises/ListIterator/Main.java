package IteratorsAndComparatorsExercises.ListIterator;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        IteratorsAndComparatorsExercises.ListIterator.ListIterator listIterator = null;

        while (!input.equals("END")){
            String [] commandParts = input.split(" ");
            String commandName = commandParts[0];
            switch (commandName){
                case "Create":
                    if(commandParts.length>1) {
                        String[] elementArray = Arrays.copyOfRange(commandParts, 1, commandParts.length);
                        listIterator = new ListIterator(elementArray);
                    }else {
                        listIterator = new ListIterator();
                    }
                    break;
                case"Move":
                    System.out.println(listIterator.move());
                    break;
                case "HasNext":
                    System.out.println(listIterator.hasNext());
                    break;
                case "Print":
                    try{
                        listIterator.print();
                    }catch (IllegalStateException e){
                        System.out.println(e.getMessage());
                    }
                    break;

            }
            input = scanner.nextLine();
        }
    }
}
