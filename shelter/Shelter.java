package shelter;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Shelter {
    private int capacity;

    private List<Animal> data ;

    public Shelter(int capacity){
        this.capacity = capacity;
        data = new ArrayList<>();
    }

    public void add (Animal animal){
        if(data.size() < capacity){
            data.add(animal);
        }
    }

    public boolean remove (String name){
        return data.removeIf(p -> p.getName().equals(name));
    }

    public Animal getAnimal (String name, String caretaker){
        return data.stream()
                .filter(p -> p.getName().equals(name) && p.getCaretaker().equals(caretaker))
                .findAny()
                .orElse(null);
    }


    public Animal getOldestAnimal(){
        return data.stream().max(Comparator.comparingInt(Animal::getAge)).orElse(null);
    }

    public int getCount(){

        return data.size();
    }

    public String getStatistics () {
        StringBuilder out = new StringBuilder("The shelter has the following animals:");

        for (Animal p :
                data) {
            out.append(System.lineSeparator())
                    .append(p.getName())
                    .append(" ")
                    .append(p.getCaretaker());
        }
        return out.toString();
    }
}
