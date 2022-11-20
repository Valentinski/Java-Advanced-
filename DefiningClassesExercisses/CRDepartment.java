package DefiningClassesExercisses;

import java.util.ArrayList;
import java.util.List;

public class CRDepartment {
    private String name;
    private List<CREmployee> employees;

    public CRDepartment (String name){
        this.name = name;
        employees = new ArrayList<>();
    }

    public double calculateAverageSalary(){
        return this.employees.stream().mapToDouble(CREmployee::getSalary).average().orElse(0);
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<CREmployee> getEmployees() {
        return employees;
    }

    public void setEmployees(List<CREmployee> employees) {
        this.employees = employees;
    }
}
