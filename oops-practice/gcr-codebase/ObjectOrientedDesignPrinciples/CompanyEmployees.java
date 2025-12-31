import java.util.*;

class Employee {
    private String name;
    private String role;

    public Employee(String name, String role) {
        this.name = name;
        this.role = role;
    }
}

class Department {
    private String departmentName;
    private ArrayList<Employee> employees;

    public Department(String departmentName) {
        this.departmentName = departmentName;
        this.employees = new ArrayList<>();
    }

    public void addEmployee(String name, String role) {
        employees.add(new Employee(name, role));
    }
}

class Company {
    private String companyName;
    private ArrayList<Department> departments;

    public Company(String companyName) {
        this.companyName = companyName;
        this.departments = new ArrayList<>();
    }

    public void addDepartment(Department department) {
        departments.add(department);
    }
}

public class CompanyEmployees {
    public static void main(String[] args) {
        Company Zero = new Company("Zero");
        Department dev = new Department("Development");
        dev.addEmployee("Rohit", "Developer");
        dev.addEmployee("Anya", "Tester");
        Department hr = new Department("HR");
        hr.addEmployee("Mira", "HR Manager");
        Zero.addDepartment(dev);
        Zero.addDepartment(hr);
    }
}
