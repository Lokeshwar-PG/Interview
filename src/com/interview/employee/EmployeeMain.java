package com.interview.employee;

public class EmployeeMain {
    public static void main(String[] args) {
        Employee e = new Employee("Lokesh",12,31000);
        e.displayEmployeeDetails();
        e.yearlySalary();
    }
}
