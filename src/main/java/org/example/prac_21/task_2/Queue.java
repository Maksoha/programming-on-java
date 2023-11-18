package org.example.prac_21.task_2;

public interface Queue<E> {
    // Добавить элемент в очередь.
    void enqueue(E element);

    // Извлечь и удалить элемент из начала очереди.
    E dequeue();

    // Получить, но не удалять, элемент из начала очереди.
    E peek();

    // Проверить, пуста ли очередь.
    boolean isEmpty();

    // Получить текущий размер очереди.
    int size();

    // Очистить очередь (удалить все элементы).
    void clear();
}

