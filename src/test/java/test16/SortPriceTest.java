package test16;

import org.example.task12and14and15.Book;
import org.example.task16.SortPrice;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

public class SortPriceTest {

    @Test
    void compare() {

        SortPrice comparator = new SortPrice();
        Book book1 = createTestBook(90), book2 = createTestBook(1000);
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



    private Book createTestBook(int price) {
        return new Book("a", "b", price, "37894");
    }
}
