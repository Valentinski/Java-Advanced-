package SetsAndMapsAdvacedLab;

import java.util.*;

public class demo {
    public static void main(String[] args) {

        Set<Integer> numbers = new HashSet<>();
        numbers.add(13);
        numbers.add(40);
        numbers.add(20);

        for (int number: numbers) {
            System.out.println(number);
        }
        System.out.println("END");
        System.out.println();


        String name1 = "AaAa";
        String name2 = "BBBB";
        System.out.println(name1.hashCode());
        System.out.println(name2.hashCode());
        System.out.println("END");
        System.out.println();


        TreeSet<Integer> treeSet = new TreeSet<>();
        treeSet.add(21);
        treeSet.add(49);
        treeSet.add(100);

        for (int number: treeSet) {
            System.out.println(number);
        }
    }
}
