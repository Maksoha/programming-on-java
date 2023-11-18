package org.example.prac_21.task_2;

public abstract class AbstractQueue<T> implements Queue<T> {
    protected int size;

    public AbstractQueue() {
        size = 0;
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    @Override
    public int size() {
        return size;
    }
}
