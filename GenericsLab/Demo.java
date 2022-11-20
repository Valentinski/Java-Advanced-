package GenericsLab;

import java.util.ArrayList;
import java.util.List;

public class Demo {
    public static void main(String[] args) {


        List numbers = new ArrayList();

        numbers.add(13);
        numbers.add("Pesho");


        System.out.println(numbers.get(0));
        System.out.println(numbers.get(1));


    }
}
