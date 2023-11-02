package org.example.task13;

import org.example.task12and14and15.Book;

public class ProgrammerBook extends Book {
    private String language;
    private int level;

    public ProgrammerBook(String title, String author, int price, String isbn, String language, int level) {

        super(title, author, price, isbn);
        this.language = language;
        this.level = level;
    }

    @Override
    public String toString(){
        String tmp = super.toString();
        String substring = tmp.substring(0, tmp.length() - 1);
        return substring + ", language='" + language + '\'' + ", level=" + level + '}';
    }

    @Override
    public int hashCode(){

        return 31 * super.hashCode() + language.hashCode();
    }

    @Override
    public boolean equals(Object o){
        ProgrammerBook pBook = (ProgrammerBook)o;
        return super.equals(pBook) && (pBook.level == level);
    }
}
