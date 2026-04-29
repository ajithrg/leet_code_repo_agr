package practice;

import java.util.*;

record Employee(int id, String name, String dept, double salary) {

}

public class GeneralPractice {
    public static void main(String[] args) {

        List<Employee> l = Arrays.asList(
                new Employee(10, "Sukesh", "IT", 28247.00),
                new Employee(207, "Rohit", "HR", 38267.00),
                new Employee(24, "Vijay", "SALES", 45345.00),
                new Employee(34, "Naresh", "IT", 12000.00),
                new Employee(56, "Suresh", "HR", 102356.00),
                new Employee(51, "Ajith", "SALES", 43450.00)

        );

        // Method 1: Get the highest salary value
        double highestSalary = l.stream()
                .mapToDouble(Employee::salary)
                .max()
                .orElse(0.0);
        System.out.println("Highest Salary: " + highestSalary);

        // Method 2: Get the employee with highest salary
        Employee employeeWithHighestSalary = l.stream()
                .max(Comparator.comparingDouble(Employee::salary))
                .orElse(null);
        System.out.println("Employee with Highest Salary: " + employeeWithHighestSalary);

    }

}
