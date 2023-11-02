package org.example.task12and14and15;

import java.util.Objects;

public class Book implements Comparable<Book> {
        private String title;
        private String author;
        private int price;
        private static int edition;
        private String isbn;

        public int getPrice() {
            return price;
        }

        public String getTitle() {
            return title;
        }

        public String getAuthor() {
            return author;
        }

    public Book(String title, String author, int price, String isbn) {
        this.title = title;
        this.author = author;
        this.price = price;
        this.isbn = isbn;
    }

    String getIsbn() { return isbn; }

    @Override
    public boolean equals(Object o) {

        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Book book = (Book) o;
        return price == book.price && Objects.equals(title, book.title) && Objects.equals(author, book.author);
    }

    @Override
    public int hashCode() {

        int hash = 7;
        hash = 31 * hash + (title == null ? 0 : title.hashCode());
        hash = 31 * hash + (author == null ? 0 : author.hashCode());
        return hash;
    }

    @Override
    public String toString() {

        return "Book{title='" + title + '\'' + ", author='" + author + '\'' + ", price=" + price + '}';
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {

        return new Book(this.title, this.author, this.price, this.isbn);
    }

    @Override
    public int compareTo(Book b) {

        return isbn.compareTo(b.getIsbn());
    }



}
