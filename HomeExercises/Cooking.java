package HomeExercises;

import javax.print.DocFlavor;
import java.util.*;

public class Cooking {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayDeque<Integer> queueOfLiquids = new ArrayDeque<>();
        ArrayDeque<Integer> stackOfIngredients = new ArrayDeque<>();

        Arrays.stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .forEach(queueOfLiquids::offer);

        Arrays.stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .forEach(stackOfIngredients::push);

        Map<Integer, String> dishes = new HashMap<>();
        dishes.put(25, "bread");
        dishes.put(50, "cake");
        dishes.put(75, "pastry");
        dishes.put(100, "fruitPie");

        int bread = 25;
        int cake = 50;
        int pastry = 75;
        int fruitPie = 100;

        int countOfBread = 0;
        int countOfCake = 0;
        int countOfPastry = 0;
        int countOfFruitPie = 0;

        while (!queueOfLiquids.isEmpty() && !stackOfIngredients.isEmpty()){
            int ingredients = stackOfIngredients.peek();
            int totalProducts = queueOfLiquids.poll() + ingredients;

            switch (totalProducts) {
                case 25:
                    countOfBread++;
                    stackOfIngredients.pop();
                    break;
                case 50:
                    countOfCake++;
                    stackOfIngredients.pop();
                    break;
                case 75:
                    countOfPastry++;
                    stackOfIngredients.pop();
                    break;
                case 100:
                    countOfFruitPie++;
                    stackOfIngredients.pop();
                    break;
                default:
                    int ingredient = stackOfIngredients.pop() + 3;
                    stackOfIngredients.push(ingredient);
            }

        }
        if(isThereAnyFood(countOfBread, countOfCake, countOfPastry, countOfFruitPie)) {
            System.out.println("Wohoo! You succeeded in cooking all the food!");
        }else {
            System.out.println("Ugh, what a pity! You didn't have enough materials to cook everything.");
        }

        StringBuilder sb = new StringBuilder();
        if(queueOfLiquids.isEmpty()){
            System.out.println("Liquids left: none");
        }else {
            String restLiquids = null;
            while (!queueOfLiquids.isEmpty()) {
                String rest = queueOfLiquids.pop().toString();
                sb.append(String.format("%s, ", rest));
                restLiquids = sb.substring(0, sb.length() - 2);
            }
        }

        if(stackOfIngredients.isEmpty()){
            System.out.println("Ingredients left: none");
        }else {
            String restIngredients = null;
            while (!stackOfIngredients.isEmpty()) {
                String rest = stackOfIngredients.poll().toString();
                sb.append(String.format("%s, ",rest));
                restIngredients = sb.substring(0, sb.length() - 2);
            }
            System.out.print("Ingredients left: " + restIngredients);
            System.out.println();
        }

        System.out.println("Bread: " + countOfBread);
        System.out.println("Cake: " + countOfCake);
        System.out.println("Fruit Pie: " + countOfFruitPie );
        System.out.println("Pastry: " + countOfPastry);

    }


    private static boolean isThereAnyFood(int countOfBread, int countOfCake, int countOfPastry, int countOfFruitPie) {
        return countOfBread == 1 && countOfCake == 1 && countOfPastry ==1 && countOfFruitPie ==1;
    }
}
