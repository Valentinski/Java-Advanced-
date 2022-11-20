package DefiningClassesExercisses;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class CompanyRosterMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int countOfEmployee = Integer.parseInt(scanner.nextLine());
        List<CRDepartment> departments = new ArrayList<>();

        for (int i = 0; i < countOfEmployee; i++) {
            String [] employeeData = scanner.nextLine().split(" ");
            String name = employeeData[0];
            double salary  =Double.parseDouble(employeeData[1]);
            String position = employeeData[2];
            String employeeDepartment = employeeData[3];

            // we create one person
            CREmployee employee = null;
            switch (employeeData.length){
                case 4:
                    //no email, no age
                    employee = new CREmployee(name, salary, position, employeeDepartment);
                    break;
                case 5:
                    if(employeeData[4].contains("@")){
                        String employeeEmail = employeeData[4];
                        employee = new CREmployee(name, salary,position, employeeDepartment, employeeEmail);
                    }else {
                        // no email, but with age
                        int age = Integer.parseInt(employeeData[4]);
                        employee = new CREmployee(name, salary, position, employeeDepartment, age);
                    }
                    break;
                case 6:
                    String email = employeeData[4];
                    int age = Integer.parseInt(employeeData[5]);
                    employee = new CREmployee(name,salary,position,employeeDepartment,email,age);
                    break;
            }

            // do I have this department
            boolean departmentsExist = departments
                    .stream()
                    .anyMatch(department -> department.getName().equals(employeeDepartment));

            if(!departmentsExist){
                CRDepartment department = new CRDepartment(employeeDepartment);
                departments.add(department);
            }

            CRDepartment currentDepartment = departments
                    .stream()
                    .filter(dep -> dep.getName().equals(employeeDepartment))
                    .findFirst()
                    .get();

            currentDepartment.getEmployees().add(employee);
        }

        CRDepartment highestPaidDepartment = departments
                .stream()
                .max(Comparator.comparingDouble(CRDepartment::calculateAverageSalary))
                .get();

        System.out.printf("Highest Average Salary: %s%n", highestPaidDepartment.getName());

        highestPaidDepartment.getEmployees()
                .stream()
                .sorted((first, second) -> Double.compare(second.getSalary(), first.getSalary()))
                .forEach(System.out::println);


    }
}
