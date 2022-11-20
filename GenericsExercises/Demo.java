package GenericsExercises;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Demo {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>();

        names.add("Pesho");
        names.add("Ivan");


        for (Object name : names ) {
            System.out.println(name );
        }

        List<Integer> grades = new ArrayList<>();
        grades.add(3);
        grades.add(4);

        System.out.println(getMin(names));
        System.out.println(getMin(grades));

        // changing the position of two elements

        int a = 5;
        int b = 10;
        int temp = a;
        a = b;
        b = temp;

        System.out.println(a);
        System.out.println(b);
    }

    public static  <T extends Comparable<T>> T getMin (List<T> list) {
        T min = list.get(0);
        for (T element : list) {
            if (min.compareTo(element) < 0) {
                min = element;
            }
        }
        return min;
    }

    // changing the position of two elements

}
