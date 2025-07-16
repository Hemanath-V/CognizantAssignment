package org.example.repository;



import java.util.List;
import java.util.Arrays;

public class BookRepository {

    public List<String> getAllBooks() {
        return Arrays.asList("Java Basics", "Spring Framework", "Hibernate in Action");
    }
}

