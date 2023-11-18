package org.example.prac_11;

import java.util.Arrays;

class StudentGPA implements Comparable<StudentGPA> {
    private String name;
    private double gpa;

    public StudentGPA(String name, double gpa) {
        this.name = name;
        this.gpa = gpa;
    }

    public String getName() {
        return name;
    }

    public double getGPA() {
        return gpa;
    }

    @Override
    public int compareTo(StudentGPA student) {
        return Double.compare(student.getGPA(), this.getGPA());
    }


    public static void main(String[] args) {
        StudentGPA[] students = new StudentGPA[3];
        students[0] = new StudentGPA("Иван", 3.9);
        students[1] = new StudentGPA("Алексей", 3.7);
        students[2] = new StudentGPA("Олег", 4.0);

        Arrays.sort(students);

        for (StudentGPA student : students) {
            System.out.println(student.getName() + ": " + student.getGPA());
        }
    }
}



