
import java.util.*;
import java.util.stream.*;

class Employee {
    private String dept;
    private double salary;

    Employee(String dept, double salary) {
        this.dept = dept;
        this.salary = salary;
    }

    public String getDepartment() { return dept; }
    public double getSalary() { return salary; }
}

public class EmployeeSalaryCategorization {
    public static void main(String[] args) {
        List<Employee> employees = List.of(
            new Employee("IT", 60000),
            new Employee("HR", 40000),
            new Employee("IT", 80000)
        );

        Map<String, Double> avgSalaryByDept =
            employees.stream()
            .collect(Collectors.groupingBy(
                Employee::getDepartment,
                Collectors.averagingDouble(Employee::getSalary)
            ));

        System.out.println(avgSalaryByDept);
    }
}
