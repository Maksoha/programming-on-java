package org.example.prac_15.task1;

public class MVCPatternDemo {
    public static void main(String[] args) {
        Student model = retriveStudentFromDatabase();
        StudentView view = new StudentView();
        StudentController controller = new StudentController(model, view);

        controller.setStudentName("Oleg");
        controller.setStudentRollNo("12345");
        controller.updateView();
    }

    public static Student retriveStudentFromDatabase() {
        Student student = new Student();
        student.setName("DefaultName");
        student.setRollNo("DefaultRollNo");
        return student;
    }
}
