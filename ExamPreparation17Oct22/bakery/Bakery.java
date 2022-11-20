package ExamPreparation17Oct22.bakery;

import java.util.*;

public class Bakery {
  private String name;
  private int capacity;
  private List<Employee> employees;

  public Bakery(String name, int capacity){
    this.name= name;
    this.capacity = capacity;
    employees = new ArrayList<>();
  }

  //•	Method add(Employee employee) – adds an entity to the data if there is room for him/her.
  public void add(Employee employee){
    if(employees.size() < capacity){
      employees.add(employee);
    }
  }

  //•	Method remove(String name) – removes an employee by given name, if such exists, and returns a bool.
  public boolean remove ( String name){
    Employee employeeToRemove = getEmployee(name);

    if(employeeToRemove != null){
      employees.remove(employeeToRemove);
      return true;
    }
    return false;
  }

  //•	Method getOldestEmployee() – returns the oldest employee.
  public Employee getOldestEmployee(){
    return employees.stream().max(Comparator.comparingInt(Employee::getAge)).orElse(null);
  }

  //•	Method getEmployee(string name) – returns the employee with the given name.
  public Employee getEmployee(String name){
    return employees
            .stream()
            .filter(e-> e.getName().equals(name))
            .findFirst()
            .orElse(null);
  }

  //•	Getter getCount() – returns the number of employees.
  public int getCount(){
    return employees.size();
  }

  //•	report() – returns a string in the following format:
  public String report(){
    StringBuilder sb = new StringBuilder();
    sb.append(String.format("Employees working at Bakery %s:%n", name));
    for (Employee employee : employees) {
      sb.append(employee).append(System.lineSeparator());
    }
    return  sb.toString();
  }
}
