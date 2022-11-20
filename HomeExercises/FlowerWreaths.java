package HomeExercises;

import java.util.*;
import java.util.stream.Collectors;

public class FlowerWreaths {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);


        ArrayDeque<Integer> stackOfLilies = new ArrayDeque<>();
        ArrayDeque<Integer> queueOfRoses = new ArrayDeque<>();

        String[] lilies = scanner.nextLine().split(", ");
        for (int i = 0; i < lilies.length; i++) {
            int lilie = Integer.parseInt(lilies[i]);
            stackOfLilies.push(lilie);
        }

        String[] roses = scanner.nextLine().split(", ");
        for (int i = 0; i < roses.length; i++) {
            int rose = Integer.parseInt(roses[i]);
            queueOfRoses.offer(rose);
        }

        ArrayDeque<Integer> newStackOfFlowers = new ArrayDeque<>();

        int wreath = 0;
        while (!queueOfRoses.isEmpty() && !stackOfLilies.isEmpty()){
            int sum = stackOfLilies.peek() + queueOfRoses.peek();
            if(sum == 15){
                wreath++;
                stackOfLilies.pop();
                queueOfRoses.poll();
            }else if(sum > 15) {
                wreath++;
                stackOfLilies.pop();
                queueOfRoses.poll();
            } else if (sum < 15) {
                newStackOfFlowers.push(sum);
                stackOfLilies.pop();
                queueOfRoses.poll();
            }
        }

        int restFlowers = 0;
        while (!newStackOfFlowers.isEmpty()){
            restFlowers += newStackOfFlowers.pop();
            if(restFlowers > 15){
                restFlowers -= 15;
                wreath++;
            }
        }


        if(wreath >= 5){
            System.out.printf("You made it, you are going to the competition with %d wreaths!", wreath);
        }else {
            System.out.printf("You didn't make it, you need %d wreaths more!", Math.abs(wreath - 5));
        }
    }
}
