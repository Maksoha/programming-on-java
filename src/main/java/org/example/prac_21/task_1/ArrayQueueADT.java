package org.example.prac_21.task_1;

public class ArrayQueueADT {
    private Object[] elements = new Object[10];
    private int size = 0;
    private int front = 0;

    // Добавить элемент в очередь
    public static void enqueue(ArrayQueueADT queue, Object element) {
        ensureCapacity(queue);
        int position = (queue.front + queue.size) % queue.elements.length;
        queue.elements[position] = element;
        queue.size++;
    }

    // Получить первый элемент в очереди
    public static Object element(ArrayQueueADT queue) {
        if (isEmpty(queue)) {
            throw new IllegalStateException("Queue is empty");
        }
        return queue.elements[queue.front];
    }

    // Удалить и вернуть первый элемент в очереди
    public static Object dequeue(ArrayQueueADT queue) {
        if (isEmpty(queue)) {
            throw new IllegalStateException("Queue is empty");
        }
        Object removedElement = queue.elements[queue.front];
        queue.elements[queue.front] = null;
        queue.front = (queue.front + 1) % queue.elements.length;
        queue.size--;
        return removedElement;
    }

    // Получить текущий размер очереди
    public static int size(ArrayQueueADT queue) {
        return queue.size;
    }

    // Проверить, является ли очередь пустой
    public static boolean isEmpty(ArrayQueueADT queue) {
        return queue.size == 0;
    }

    // Удалить все элементы из очереди
    public static void clear(ArrayQueueADT queue) {
        queue.elements = new Object[10];
        queue.size = 0;
        queue.front = 0;
    }

    // Обеспечить достаточную емкость массива
    private static void ensureCapacity(ArrayQueueADT queue) {
        if (queue.size == queue.elements.length) {
            Object[] newElements = new Object[2 * queue.elements.length];
            System.arraycopy(queue.elements, queue.front, newElements, 0, queue.elements.length - queue.front);
            System.arraycopy(queue.elements, 0, newElements, queue.elements.length - queue.front, queue.front);
            queue.elements = newElements;
            queue.front = 0;
        }
    }
}

