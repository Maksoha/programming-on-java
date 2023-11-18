package org.example.prac_19;

public class GenericArray<T> {
    private T[] array;

    public GenericArray(T[] array) {
        this.array = array;
    }

    public T getElement(int index) {
        if (index >= 0 && index < array.length) {
            return array[index];
        } else {
            throw new IndexOutOfBoundsException("Index is out of bounds");
        }
    }

    public static void main(String[] args) {
        Integer[] intArray = {1, 2, 3, 4, 5};
        GenericArray<Integer> genericIntArray = new GenericArray<>(intArray);

        String[] stringArray = {"apple", "banana", "cherry"};
        GenericArray<String> genericStringArray = new GenericArray<>(stringArray);

        System.out.println("Element at index 2 in integer array: " + genericIntArray.getElement(2));
        System.out.println("Element at index 1 in string array: " + genericStringArray.getElement(1));
    }
}

