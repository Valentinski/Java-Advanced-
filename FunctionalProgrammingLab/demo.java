package FunctionalProgrammingLab;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

public class demo {
    public static void main(String[] args) {

        Function<Integer, Integer> square = x -> x * x;

        System.out.println(square.apply(3));
    }
}
