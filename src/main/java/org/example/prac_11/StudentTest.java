package org.example.prac_11;

public class StudentTest {

    public static void main(String[] Student) {
        Student[] students = new Student[]{
                new Student("Иван", 101),
                new Student("Ваня", 103),
                new Student("Петр", 102),
                new Student("Алексей", 100)
        };

        insertionSort(students);

        for (Student student : students) {
            System.out.println(student);
        }
    }

    public static void insertionSort(Student[] arr) {
        int n = arr.length;
        for (int i = 1; i < n; i++) {
            Student key = arr[i];
            int j = i - 1;
            while (j >= 0 && arr[j].getiDNumber() > key.getiDNumber()) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = key;
        }
    }
}

class Student {
    private String name;
    private int iDNumber;

    public Student(String name, int iDNumber) {
        this.name = name;
        this.iDNumber = iDNumber;
    }

    public int getiDNumber() {
        return iDNumber;
    }

    @Override
    public String toString() {
        return "StudentGPA" + " name=" + name +  ", iDNumber=" + iDNumber;
    }
}
