package DefiningClassesExercisses;

public class CatDemo {
    private String name ;
    String lastName;
    private int age ;
    private String EGN ;

    public String getEGN(){
        return EGN;
    }

    public CatDemo (String name, int age){
        setAge(age);
        this.name = name;
        this.age = age;
    }


    public void setAge (int newAge){
        if(newAge < 0){
            throw new IllegalArgumentException("Age must be positive number ");
        }
        age = newAge;
    }

    public int getAge (){
        return age;
    }

    public void setName (String newName){
        name = newName;
    }
}
