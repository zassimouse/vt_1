package test16;

import org.example.task12and14and15.Book;
import org.example.task16.SortTitle;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

public class SortTitleTest {

    @Test
    void compare() {
        SortTitle comparator = new SortTitle();
        Book book1 = createTestBook("a"), book2 = createTestBook("b");
        ArrayList<Book> mainSortedList = new ArrayList<>(), compSortedList = new ArrayList<>();

        Assertions.assertEquals(0, comparator.compare(book1, book1));
        Assertions.assertTrue(comparator.compare(book1, book2) < 0);

        mainSortedList.add(book1);
        mainSortedList.add(book2);

        compSortedList.add(book2);
        compSortedList.add(book1);
        compSortedList.sort(comparator);
        Assertions.assertEquals(mainSortedList, compSortedList);
    }

    private Book createTestBook(String title) {
        return new Book(title, "b", 0, "37894");
    }
}
