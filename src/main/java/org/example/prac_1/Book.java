package org.example.prac_1;

public class Book {
    private String name;
    private int numberOfPage;

    public Book(int numberOfPage) {
        this.numberOfPage = numberOfPage;
        this.name = "Война и мир";
    }

    public Book() {
        this.name = "Война и мир";
        this.numberOfPage = 100;
    }

    public Book(String name) {
        this.name = name;
        this.numberOfPage = 100;
    }

    public Book(String name, int numberOfPage) {
        this.name = name;
        this.numberOfPage = numberOfPage;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setNumberOfPage(int numberOfPage) {
        this.numberOfPage = numberOfPage;
    }

    public String getName() {
        return name;
    }

    public int getNumberOfPage() {
        return numberOfPage;
    }

    @Override
    public String toString() {
        return "Book name is " + this.name + ", number of page is " + this.numberOfPage;
    }
}
