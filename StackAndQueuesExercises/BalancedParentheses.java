package StackAndQueuesExercises;

import java.util.ArrayDeque;
import java.util.Scanner;

public class BalancedParentheses {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String brackets = scanner.nextLine();
        boolean isBalanced = true;

        ArrayDeque <Character> openingBrackets = new ArrayDeque<>();

        for (int i = 0; i < brackets.length(); i++) {
            char currentBracket = brackets.charAt(i);

            // opening brackets
            if(currentBracket == '(' || currentBracket == '[' || currentBracket == '{' ){
                openingBrackets.push(currentBracket);
            }else { // closing brackets
                if(openingBrackets.isEmpty()){
                    isBalanced = false;
                    break;
                }
                char lastOpeningBracket = openingBrackets.pop();
                if(currentBracket == '}' && lastOpeningBracket != '{'){
                    isBalanced = false;
                }else if(currentBracket == ')' && lastOpeningBracket != '('){
                    isBalanced = false;
                }else if(currentBracket == ']' && lastOpeningBracket != '['){
                    isBalanced = false;
                }
            }
        }
        if(isBalanced){
            System.out.println("YES");
        }else {
            System.out.println("NO");
        }
    }
}
