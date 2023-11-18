package org.example.prac_3;

public class BallTest {
    public static void main(String[] args) {
        Ball b = new Ball();
        System.out.println(b);
        b.setXY(2.6, 4.9);
        System.out.println(b);
        b.move(12.0, -4.0);
        System.out.println(b);
    }
}
