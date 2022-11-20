package StackAndQueuesLab;

import java.util.ArrayDeque;
import java.util.Scanner;

public class PrinterQueue {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayDeque <String> printQueue = new ArrayDeque<>();

        String input = scanner.nextLine();

        while (!input.equals("print")){

            if(input.equals("cancel")){
                String output = printQueue.isEmpty()
                        ? "Printer is on standby"
                        : "Canceled " + printQueue.poll();

                System.out.println(output);
            }else {
                printQueue.offer(input);
            }

            input = scanner.nextLine();


            }
        while (!printQueue.isEmpty()){
            System.out.println(printQueue.poll());
        }
    }
}
