package org.example.prac_21.task_1;

public class Main {
    public static void main(String[] args) {
        ArrayQueueModule.enqueue("1");
        ArrayQueueModule.enqueue("2");
        ArrayQueueModule.enqueue("3");

        System.out.println("Element at the front: " + ArrayQueueModule.element()); // Output: Element at the front: 1

        while (!ArrayQueueModule.isEmpty()) {
            System.out.println("Dequeued: " + ArrayQueueModule.dequeue());
        }


        ArrayQueueADT queue1 = new ArrayQueueADT();

        ArrayQueueADT.enqueue(queue1, "A");
        ArrayQueueADT.enqueue(queue1, "B");
        ArrayQueueADT.enqueue(queue1, "C");

        System.out.println("Element at the front: " + ArrayQueueADT.element(queue1)); // Output: Element at the front: A

        while (!ArrayQueueADT.isEmpty(queue1)) {
            System.out.println("Dequeued: " + ArrayQueueADT.dequeue(queue1));
        }

        ArrayQueue<String> queue2 = new ArrayQueue<>();

        queue2.enqueue("X");
        queue2.enqueue("Y");
        queue2.enqueue("Z");

        System.out.println("Element at the front: " + queue2.element()); // Output: Element at the front: X

        while (!queue2.isEmpty()) {
            System.out.println("Dequeued: " + queue2.dequeue());
        }
    }
}
