package org.example.prac_21.task_1;

public class ArrayQueueModule {
    private static Object[] elements = new Object[10];
    private static int size = 0;
    private static int front = 0;

    // Добавить элемент в очередь
    public static void enqueue(Object element) {
        ensureCapacity();
        int position = (front + size) % elements.length;
        elements[position] = element;
        size++;
    }

    // Получить первый элемент в очереди
    public static Object element() {
        if (isEmpty()) {
            throw new IllegalStateException("Queue is empty");
        }
        return elements[front];
    }

    // Удалить и вернуть первый элемент в очереди
    public static Object dequeue() {
        if (isEmpty()) {
            throw new IllegalStateException("Queue is empty");
        }
        Object removedElement = elements[front];
        elements[front] = null; // Освободить память
        front = (front + 1) % elements.length;
        size--;
        return removedElement;
    }

    // Получить текущий размер очереди
    public static int size() {
        return size;
    }

    // Проверить, является ли очередь пустой
    public static boolean isEmpty() {
        return size == 0;
    }

    // Удалить все элементы из очереди
    public static void clear() {
        elements = new Object[10];
        size = 0;
        front = 0;
    }

    // Обеспечить достаточную емкость массива
    private static void ensureCapacity() {
        if (size == elements.length) {
            Object[] newElements = new Object[2 * elements.length];
            System.arraycopy(elements, front, newElements, 0, elements.length - front);
            System.arraycopy(elements, 0, newElements, elements.length - front, front);
            elements = newElements;
            front = 0;
        }
    }
}

