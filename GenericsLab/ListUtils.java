package GenericsLab;

import java.util.Collections;
import java.util.List;

public class ListUtils {

    public static <T extends Comparable<T>> T getMax(List<T> list){
        ensureNotEmty(list);

        return Collections.max(list);
    }

    public static <T extends Comparable <T>> T getMin(List<T> list){
        ensureNotEmty(list);

        return Collections.min(list);
    }
    private static <T> void ensureNotEmty(List<T> list) {
        if(list.isEmpty()){
            throw new IllegalArgumentException("List is emty");
        }
    }

}
