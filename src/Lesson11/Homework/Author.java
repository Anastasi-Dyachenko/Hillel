package Lesson11.Homework;

import java.util.List;

public class Author {
    public String surname;
    public String name;
    public List<String> books;

    public Author(String surname, String name, List<String>books) {
        this.name=name;
        this.surname = surname;
        this.books = books;
    }
}
