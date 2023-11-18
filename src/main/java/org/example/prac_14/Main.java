package org.example.prac_14;

public class Main {
    public static void main(String[] args) {
        BoundedWaitList<Integer> boundedWaitList = new BoundedWaitList<>(5);
        boundedWaitList.add(1);
        boundedWaitList.add(2);
        boundedWaitList.add(3);
        boundedWaitList.add(4);
        boundedWaitList.add(5);

        // Попытка добавить элемент, превышающий ограниченную емкость
         boundedWaitList.add(6); // Это не добавит

        // Вывод
        System.out.println("BoundedWaitList содержит: " + boundedWaitList);

        UnfairWaitList<Integer> unfairWaitList = new UnfairWaitList<>();
        unfairWaitList.add(1);
        unfairWaitList.add(2);
        unfairWaitList.add(3);
        unfairWaitList.add(4);

        unfairWaitList.remove(1);

        System.out.println("UnfairWaitList содержит: " + unfairWaitList);
    }
}

