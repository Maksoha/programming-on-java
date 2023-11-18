package org.example.prac_15.task2;

public class EmployeeView {
    public void printEmployeeDetails(String name, double hourlyRate, int hoursWorked, double salary) {
        System.out.println("Employee Details:");
        System.out.println("Name: " + name);
        System.out.println("Hourly Rate: $" + hourlyRate);
        System.out.println("Hours Worked: " + hoursWorked + " hours");
        System.out.println("Salary: $" + salary);
    }
}
