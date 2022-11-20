package GenericsLab;

import java.util.ArrayDeque;
// we create generics like JarOfT"<T>"
public class Jar<T> {

    private ArrayDeque<T> stack;

    public Jar() {
        this.stack = new ArrayDeque<>();
    }

    public void add (T element){
        stack.push(element);
    }

    public T remove () {
        return stack.pop();
    }

}
