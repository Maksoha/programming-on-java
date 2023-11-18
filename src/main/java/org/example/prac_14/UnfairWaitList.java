package org.example.prac_14;

public class UnfairWaitList<E> extends WaitList<E> {
    public UnfairWaitList() {
        super();
    }

    public void remove(E element) {
        if (content.peek() != null && !content.peek().equals(element)) {
            moveToBack(element);
        }
        content.remove(element);
    }

    private void moveToBack(E element) {
        content.remove(element);
        content.add(element);
    }
}

