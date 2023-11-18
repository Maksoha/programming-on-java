package org.example.prac_15.task2;

public class MVCPatternDemo {
    public static void main(String[] args) {
        Employee employee = new Employee("Ivan", 20.0, 40);
        EmployeeView view = new EmployeeView();
        EmployeeController controller = new EmployeeController(employee, view);

        controller.setEmployeeName("Oleg");
        controller.setHourlyRate(25.0);
        controller.setHoursWorked(50);
        controller.updateView();
    }
}
