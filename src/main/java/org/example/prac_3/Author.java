package org.example.prac_3;

public class Author {
    private String name;
    private String email;
    private char gender;

    public void setEmail(String email) {
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public char getGender() {
        return gender;
    }

    public Author(String name, String email, char gender) {
        this.name = name;
        this.email = email;
        this.gender = gender;
    }

    @Override
    public String toString() {
        return "Author name is " + name + ", email is " + email + ", gender is " + gender;
    }
}
