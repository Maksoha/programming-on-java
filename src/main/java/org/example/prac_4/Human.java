package org.example.prac_4;

class Head {
    private String eyeColor;

    public Head(String eyeColor) {
        this.eyeColor = eyeColor;
    }

    public String getEyeColor() {
        return eyeColor;
    }

    public void setEyeColor(String eyeColor) {
        this.eyeColor = eyeColor;
    }
}

class Leg {
    private int length;

    public Leg(int length) {
        this.length = length;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }
}

class Hand {
    private int fingers;

    public Hand(int fingers) {
        this.fingers = fingers;
    }

    public void setFingers(int fingers) {
        this.fingers = fingers;
    }

    public int getFingers() {
        return fingers;
    }
}

class Human {
    private Head head;
    private Leg leftLeg;
    private Leg rightLeg;
    private Hand leftHand;
    private Hand rightHand;

    public Human(Head head, Leg leftLeg, Leg rightLeg, Hand leftHand, Hand rightHand) {
        this.head = head;
        this.leftLeg = leftLeg;
        this.rightLeg = rightLeg;
        this.leftHand = leftHand;
        this.rightHand = rightHand;
    }

    public Head getHead() {
        return head;
    }

    public Leg getLeftLeg() {
        return leftLeg;
    }

    public Leg getRightLeg() {
        return rightLeg;
    }

    public Hand getLeftHand() {
        return leftHand;
    }

    public Hand getRightHand() {
        return rightHand;
    }
}

class HumanTest {
    public static void main(String[] args) {
        Head head = new Head("Brown");
        Leg leftLeg = new Leg(80);
        Leg rightLeg = new Leg(80);
        Hand leftHand = new Hand(5);
        Hand rightHand = new Hand(4);

        Human person = new Human(head, leftLeg, rightLeg, leftHand, rightHand);

        System.out.println("Цвет глаз: " + person.getHead().getEyeColor());
        System.out.println("Длина левой ноги: " + person.getLeftLeg().getLength() + " см");
        System.out.println("Длина правой ноги: " + person.getRightLeg().getLength() + " см");
        System.out.println("Количество пальцев на левой руке: " + person.getLeftHand().getFingers());
        System.out.println("Количество пальцев на правой руке: " + person.getRightHand().getFingers());
    }
}

