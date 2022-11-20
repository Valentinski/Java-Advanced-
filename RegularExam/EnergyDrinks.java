package RegularExam;

import java.util.ArrayDeque;
import java.util.Scanner;

public class EnergyDrinks {
    private static ArrayDeque<Integer> queueOfRoses;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        ArrayDeque<Integer> stackOfCaffeine = new ArrayDeque<>();
        ArrayDeque<Integer> queueOfEnergyDrinks = new ArrayDeque<>();

        String[] lilies = scanner.nextLine().split(", ");
        for (int i = 0; i < lilies.length; i++) {
            int lilie = Integer.parseInt(lilies[i]);
            stackOfCaffeine.push(lilie);
        }

        String[] roses = scanner.nextLine().split(", ");
        for (int i = 0; i < roses.length; i++) {
            int rose = Integer.parseInt(roses[i]);
            queueOfEnergyDrinks.offer(rose);
        }

        int stamatCoffeine = 300;
        int energyDrink = 0;
        int sum = 0;
        int stamatDailyCaffeine = 0;
        while (!stackOfCaffeine.isEmpty() && !queueOfEnergyDrinks.isEmpty()){
            sum = stackOfCaffeine.peek() * queueOfEnergyDrinks.peek();

            if (sum < stamatCoffeine) {
                stackOfCaffeine.pop();
                queueOfEnergyDrinks.poll();
                stamatDailyCaffeine = sum;
                if(isThereCaffeine(stamatCoffeine, sum)) {
                    stamatCoffeine -= sum;
                }else {
                    sum = 0;
                }
            }else {
                stackOfCaffeine.pop();
                energyDrink = queueOfEnergyDrinks.poll();
                queueOfEnergyDrinks.offer(energyDrink);
                stamatDailyCaffeine -= 30;

            }
        }


        StringBuilder sb = new StringBuilder();
        if(!queueOfEnergyDrinks.isEmpty()){
            String restEnergyDrinks = null;
            while (!queueOfEnergyDrinks.isEmpty()) {
                String rest = queueOfEnergyDrinks.poll().toString();
                sb.append(String.format("%s, ",rest));
                restEnergyDrinks = sb.substring(0, sb.length() - 2);
            }
            System.out.print("Drinks left: " + restEnergyDrinks);
            System.out.println();
        }else {
            System.out.println("At least Stamat wasn't exceeding the maximum caffeine.");
        }

        System.out.printf("Stamat is going to sleep with %d mg caffeine.", stamatDailyCaffeine);
    }

    private static boolean isThereCaffeine(int stamatCoffeine, int sum) {
        return stamatCoffeine > sum ;
    }


}
