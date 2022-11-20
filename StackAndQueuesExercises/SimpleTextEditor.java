package StackAndQueuesExercises;

import javax.print.DocFlavor;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SimpleTextEditor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numbersOfOperations = Integer.parseInt(scanner.nextLine());
        List<String> letters = new ArrayList<>();
        ArrayDeque<String> commandQueue = new ArrayDeque<>();
        ArrayDeque<String> textQueue = new ArrayDeque<>();
        textQueue.offer("");

        for (int i = 0; i < numbersOfOperations; i++) {
            String [] input = scanner.nextLine().split(" ");
            String command = input[0];


            switch (command){
                case "1": // appends
                    String [] text = input[1].split("");
                    commandQueue.offer(input[0]);
                    textQueue.offer(input[1]);
                    for (int j = 0; j < text.length; j++) {
                        String currentLetter = text[j];
                        letters.add(currentLetter);

                    }
                    break;
                case "2": //erases
                    int countToErase = Integer.parseInt(input[1]);
                    if(validIndex(letters, countToErase)){
                        for (int j = countToErase; j >= 0 ; j--) {
                            if(!letters.isEmpty()) {
                                letters.remove(letters.size() - 1);
                            }
                        }
                    }

                    break;
                case "3": //returns
                    int index = Integer.parseInt(input[1]);
                    if(validIndex(letters, index)){
                        String character = letters.get(index-1);
                        System.out.println(character);
                    }
                    break;
                case"4": //undoes
                    String [] newText = textQueue.poll().split("");
                    if(newText.length > 1) {
                        while (letters.size()>0){
                            letters.remove(0);
                        }

                        for (int k = 0; k < newText.length; k++) {
                            String currentLetter = newText[k];
                            letters.add(currentLetter);

                        }
                    }
                    break;
            }

        }
    }
    public static boolean validIndex (List<String> letters, int index){
        return letters.size() >= index ;
    }
}
