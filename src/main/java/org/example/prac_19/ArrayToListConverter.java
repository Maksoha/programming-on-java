package org.example.prac_19;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArrayToListConverter {
    public static <T> List<T> convertArrayToList(T[] array) {
        List<T> list = new ArrayList<>();
        Collections.addAll(list, array);
        return list;
    }

    public static void main(String[] args) {
        String[] stringArray = {"apple", "banana", "cherry"};
        List<String> stringList = convertArrayToList(stringArray);
        System.out.println("String List: " + stringList);

        Integer[] intArray = {1, 2, 3, 4, 5};
        List<Integer> intList = convertArrayToList(intArray);
        System.out.println("Integer List: " + intList);
    }
}

