package org.example.prac_21.task_1;

public class ArrayQueue<T> {
    private Object[] elements = new Object[10];
    private int size = 0;
    private int front = 0;

    // Добавить элемент в очередь
    public void enqueue(T element) {
        ensureCapacity();
        int position = (front + size) % elements.length;
        elements[position] = element;
        size++;
    }

    // Получить первый элемент в очереди
    public T element() {
        if (isEmpty()) {
            throw new IllegalStateException("Queue is empty");
        }
        return (T) elements[front];
    }

    // Удалить и вернуть первый элемент в очереди
    public T dequeue() {
        if (isEmpty()) {
            throw new IllegalStateException("Queue is empty");
        }
        T removedElement = (T) elements[front];
        elements[front] = null;
        front = (front + 1) % elements.length;
        size--;
        return removedElement;
    }

    // Получить текущий размер очереди
    public int size() {
        return size;
    }

    // Проверить, является ли очередь пустой
    public boolean isEmpty() {
        return size == 0;
    }

    // Удалить все элементы из очереди
    public void clear() {
        elements = new Object[10];
        size = 0;
        front = 0;
    }

    // Обеспечить достаточную емкость массива
    private void ensureCapacity() {
        if (size == elements.length) {
            Object[] newElements = new Object[2 * elements.length];
            System.arraycopy(elements, front, newElements, 0, elements.length - front);
            System.arraycopy(elements, 0, newElements, elements.length - front, front);
            elements = newElements;
            front = 0;
        }
    }
}

