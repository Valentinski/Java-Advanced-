package GenericsExercises;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CustomList<T extends Comparable<T>>  {
    private List<T> values;

    // we have to initialisation our constructor
    public CustomList(){
        values = new ArrayList<>();
    }

//•	void add(T element)
    public void add (T element){
        values.add(element);
    }

//•	T remove(int index)
    public T remove(int index){
        return values.remove(index);

    }

//•	boolean contains(T element)
    public boolean contains (T element){
        return values.contains(element);
    }

//•	void swap(int index, int index)
    public void swap (int firstIndex, int secondIndex){
        Collections.swap(values, firstIndex, secondIndex);
    }

//•	int countGreaterThan(T element)
    public int countGreaterThan (T element){
        return (int) values.stream()
                .filter(existingElement -> existingElement.compareTo(element) > 0)
                .count();
    }

//•	T getMax()
    public T getMax(){
       return values.stream().max(Comparable::compareTo).get();
    }

//•	T getMin()
    public T getMIn(){
        return values.stream().min(Comparable::compareTo).get();
    }

    public int size(){
        return values.size();
    }

    public T get(int index){
        return values.get(index);
    }

 //• Print - Prints all elements in the list, each on a separate line.
    @Override
    public String toString() {
       StringBuilder sb = new StringBuilder();

        for (T value : values) {
            sb.append(value.toString()).append(System.lineSeparator());
        }

        return sb.toString().trim();
    }



}
