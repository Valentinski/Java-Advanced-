package SetAndMapsAdvancedExercises;

import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Scanner;

public class demo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Map
        //HashMap -> work fast but does not safe the placed!
        // LinkedHashMap -> work fast and keep a row
        // TreeMap
        HashMap<String, Integer> map = new HashMap<>();
        map.put("Pesho", 4);
        map.put("Toshko", 5);
        map.put("Ivan", 5);
        map.put("Asen", 3);


        map.entrySet(). stream().sorted(
                (left, right) -> {
                    return right.getValue().compareTo(left.getValue());
                }
        ).forEach(e-> System.out.println(e.getKey() + " " + e.getValue()));


        map.entrySet().stream().sorted(
                (left, right) -> {
                    int result = left.getValue() - right.getValue();
                    if (result == 0){
                        result = left.getKey().compareTo(right.getKey());
                    }
                    return  result;
                }
        ).forEach(e-> System.out.println(e.getKey() + " " + e.getValue()));

    }
}
