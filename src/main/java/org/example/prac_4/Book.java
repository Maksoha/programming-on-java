package org.example.prac_4;

class Book {
    private String author;
    private String title;
    private int year;

    public Book(String author, String title, int year) {
        this.author = author;
        this.title = title;
        this.year = year;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }
}

class BookTest {
    public static void main(String[] args) {
        Book book = new Book("Толстой", "Война и мир", 1852);
        System.out.println("Автор: " + book.getAuthor());
        System.out.println("Название: " + book.getTitle());
        System.out.println("Год: " + book.getYear());

        book.setTitle("Мир и война");
        System.out.println("Название: " + book.getTitle());
    }
}
