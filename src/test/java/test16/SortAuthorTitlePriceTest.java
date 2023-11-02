package test16;

import org.example.task12and14and15.Book;
import org.example.task16.SortAuthorTitlePrice;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

class SortAuthorTitlePriceTest {

    @Test
    void compare() {

        SortAuthorTitlePrice comparator = new SortAuthorTitlePrice();
        Book book1 = createTestBook("a","a",1), book2 = createTestBook("b","b",2);
        ArrayList<Book> mainSortedList = new ArrayList<>(), compSortedList = new ArrayList<>();

        Assertions.assertTrue(comparator.compare(book1, book2) < 0);

        mainSortedList.add(book1);
        mainSortedList.add(book2);

        compSortedList.add(book2);
        compSortedList.add(book1);

        compSortedList.sort(comparator);

        Assertions.assertEquals(mainSortedList, compSortedList);
    }

    private Book createTestBook(String author, String title, int price) {
        return new Book(title, author, price, "5554674656");
    }

}