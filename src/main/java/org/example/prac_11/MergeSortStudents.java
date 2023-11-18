package org.example.prac_11;

import java.util.ArrayList;
import java.util.List;

public class MergeSortStudents {
    public static void main(String[] args) {
        List<Student> students1 = new ArrayList<>();
        students1.add(new Student("Олег", 3));
        students1.add(new Student("Иван", 7));
        students1.add(new Student("Алексей", 4));

        List<Student> students2 = new ArrayList<>();
        students2.add(new Student("Анна", 5));
        students2.add(new Student("Вика", 4));
        students2.add(new Student("Антон", 8));

        List<Student> mergedStudents = mergeSort(students1, students2);

        System.out.println("Отсортированный список студентов:");
        for (Student student : mergedStudents) {
            System.out.println(student.getiDNumber() + ": " + student.getiDNumber());
        }
    }

    public static List<Student> mergeSort(List<Student> list1, List<Student> list2) {
        List<Student> mergedList = new ArrayList<>();
        int i = 0, j = 0;

        while (i < list1.size() && j < list2.size()) {
            if (list1.get(i).getiDNumber() >= list2.get(j).getiDNumber()) {
                mergedList.add(list1.get(i));
                i++;
            } else {
                mergedList.add(list2.get(j));
                j++;
            }
        }

        while (i < list1.size()) {
            mergedList.add(list1.get(i));
            i++;
        }

        while (j < list2.size()) {
            mergedList.add(list2.get(j));
            j++;
        }

        return mergedList;
    }
}


