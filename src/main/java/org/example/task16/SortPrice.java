package org.example.task16;

import org.example.task12and14and15.Book;

import java.util.Comparator;

public class SortPrice implements Comparator<Book> {


    @Override
    public int compare(Book book1, Book book2) {
        if ((book1 == null) || (book2 == null)) {
            throw new IllegalArgumentException("None of books should be NULL");
        }

        return Integer.compare(book1.getPrice(), book2.getPrice());
    }

}