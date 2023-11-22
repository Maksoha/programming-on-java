package org.example.prac_1;

public class BallTest {
    public static void main(String[] args) {
        Ball b1 = new Ball();
        System.out.println(b1);
        b1 = new Ball("Black", 1);
        System.out.println(b1);
        System.out.println("Радиус мяча = " + b1.getRadius());
    }
}
