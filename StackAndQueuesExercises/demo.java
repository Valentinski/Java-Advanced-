package StackAndQueuesExercises;

public class demo {
    public static void main(String[] args) {
        a();
    }
    public static void a(){
        b();
        System.out.println("A");
    }
    public static void b(){
        c();
        System.out.println("B");
    }
    public static void c(){
        System.out.println("C");
    }
}
