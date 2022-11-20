package GenericsLab;

import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        List<Integer> numbers = List.of(13,42,69,83);

        System.out.println(ListUtils.getMax(numbers));
        System.out.println(ListUtils.getMin(numbers));

    }
}
