package ExamPreparation14Oct22.vetClinic;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Clinic {

    private int capacity;

    //•	Field data – List that holds added pets
    private List<Pet> data;

    //•	capacity: int
    public Clinic(int capacity){
        this.capacity = capacity;
        this.data = new ArrayList<>();
    }

    //•	Method add(Pet pet) – adds an entity to the data if there is an empty cell for the pet.
    public void add(Pet pet){
        if(data.size() < capacity){
            data.add(pet);
        }
    }

    //•	Method remove(String name) – removes the pet by given name, if such exists, and returns boolean.
    public boolean remove(String name){
        return data.removeIf(p-> p.getName().equals((name)));
    }

    //•	Method getPet(String name, String owner) – returns the pet with the given name and owner or null if no such pet exists.
    public Pet getPet(String name, String owner){
        return data.stream()
                .filter(p-> p.getName().equals(name) && p.getOwner().equals(owner))
                .findAny()
                .orElse(null);
    }

    //•	Method getOldestPet() – returns the oldest Pet.
    public Pet getOldestPet(){
        return Collections.max(data, Comparator.comparingInt(Pet::getAge));
    }

    //•	Getter getCount – returns the number of pets.
    public int getCount(){
        return data.size();
    }

    //•	getStatistics() – returns a String in the following format:
    public String getStatistics() {
       StringBuilder out = new StringBuilder("The clinic has the following patients:");
        for (Pet p : data) {
            out.append(System.lineSeparator())
                    .append(p.getName())
                    .append(" ")
                    .append(p.getOwner());
        }
        return out.toString();
    }

}
