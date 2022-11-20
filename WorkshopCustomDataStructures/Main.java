package WorkshopCustomDataStructures;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        SmartArray smartArray = new SmartArray();

        for (int i = 0; i < 4; i++) {
            smartArray.add(i + 1);
        }

        smartArray.add(0, 13);

        smartArray.forEach(System.out::println);
    }
}
