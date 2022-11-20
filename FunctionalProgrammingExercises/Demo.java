package FunctionalProgrammingExercises;

import java.util.Iterator;
import java.util.Optional;
import java.util.function.*;

public class Demo {
    public static void main(String[] args) {
        Function<String, Integer> parseString = Integer::parseInt;
        Function<String, String> function = s-> "Hello" + s;
        UnaryOperator<String> unaryOperator = s-> "Hello" + s;
        Predicate<String> predicate = s-> s.length() > 5;
        Consumer<String> consumer = System.out::println;
        Supplier<String> supplier = ()  -> "Pesho";

        BiFunction<String, Integer, Integer>    biFunction = (text, number) -> text.length() + number;
        BiPredicate<String, String> biPredicate = (text1, text2) -> text1.length() > text2.length();
        BiConsumer<String, String> biConsumer = (text1, text2) -> System.out.println(text1 + text2);
        BinaryOperator<Integer> binaryOperator = (number1, number2) -> number1+ number2;

        // we created an interface
        Converter converter = text -> text + "bye";

        Optional<String> variable = Optional.of(null);
        System.out.println(variable.orElse("Nothing is there"));
    }
}
