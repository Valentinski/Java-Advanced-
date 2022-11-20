package DefiningClassesLab;

public class Demo {
    public static void main(String[] args) {

        DemoStudent demoStudent = new DemoStudent();

        demoStudent.studentId = 13;
        demoStudent.name = "Pesho";
        demoStudent.grade = 6.00;

        String str = "Hello";
        str = "Hello, Pesho";

        System.out.println(demoStudent);


    }
}
