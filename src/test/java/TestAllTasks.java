import org.example.task1.ExpressionCalculator;
import org.example.task12and14and15.Book;
import org.example.task2.PointAffiliation;
import org.example.task4.PrimesGetter;
import org.example.task5.CalcLIS;
import org.example.task6.GetMatrix;
import org.example.task7.ArraySort;
import org.example.task8.IndexesCalculator;
import org.example.task9.Ball;
import org.example.task9.Basket;
import org.example.task9.Color;
import org.junit.jupiter.api.Assertions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestAllTasks {

    @org.junit.jupiter.api.Test
    public void testTask1() {

        assertEquals(ExpressionCalculator.calculateExpression(1, 2), 1.3922749448749296);
        assertEquals(ExpressionCalculator.calculateExpression(0, 200), 0.8813240846606339);
        assertEquals(ExpressionCalculator.calculateExpression(100, 100), 100.01728086474395);
    }

    @org.junit.jupiter.api.Test
    public void testTask2() {

        assertEquals(PointAffiliation.checkFigure(-1, 2), true);
        assertEquals(PointAffiliation.checkFigure(100, 150), false);
        assertEquals(PointAffiliation.checkFigure(0, 0), true);
    }

    @org.junit.jupiter.api.Test
    public void testTask4() {

        assertEquals(PrimesGetter.getPrimeNumbersPositions(
                new int[]{68, 89, 345, 99, 903, 324, 87, 79, 23, 90}),
                new ArrayList<Integer>(Arrays.asList(1, 7, 8))
        );

        assertEquals(PrimesGetter.getPrimeNumbersPositions(
                new int[]{0, 920, 1432, 550, 1331, 1140, 727, 472, 174, 384,
                        24, 88, 247, 1178, 385, 737, 53, 477, -436, 1152}
                ),
                new ArrayList<Integer>(Arrays.asList(6, 16))
        );

        assertEquals(PrimesGetter.getPrimeNumbersPositions(
                new int[]{69, 53, 72, 18, 11, 79, 60, 1, 4, 54, 39, 5, 83, 89, 34}),
                new ArrayList<Integer>(Arrays.asList(1, 4, 5, 11, 12, 13))
        );

    }

    @org.junit.jupiter.api.Test
    public void testTask5() {

        assertEquals(CalcLIS.getNumToDeleteForLIS(new int[]{68, 89, 345, 99, 903, 324, 87, 79, 23, 90}), 6);

    }

    @org.junit.jupiter.api.Test
    public void testTask6() {

        assertArrayEquals(
                GetMatrix.getMatrix(2),
                new int[][]{
                        {1, 2},
                        {2, 1}
                }
        );

        assertArrayEquals(
                GetMatrix.getMatrix(4),
                new int[][]{
                        {1, 2, 3, 4},
                        {2, 3, 4, 1},
                        {3, 4, 1, 2},
                        {4, 1, 2, 3},
                }
        );

        assertArrayEquals(
                GetMatrix.getMatrix(7),
                new int[][]{
                        {1, 2, 3, 4, 5, 6, 7},
                        {2, 3, 4, 5, 6, 7, 1},
                        {3, 4, 5, 6, 7, 1, 2},
                        {4, 5, 6, 7, 1, 2, 3},
                        {5, 6, 7, 1, 2, 3, 4},
                        {6, 7, 1, 2, 3, 4, 5},
                        {7, 1, 2, 3, 4, 5, 6}
                }
        );
    }

    @org.junit.jupiter.api.Test
    public void testTask7() {

        assertArrayEquals(ArraySort.sortArray(new int[]{68, 89, 345, 99, 903, 324, 87, 79, 23, 90}), new int[]{23, 68, 79, 87, 89, 90, 99, 324, 345, 903});

        assertArrayEquals(ArraySort.sortArray(new int[]{663, 944, 348, 255, 374, 906, 635, 17, 14, 279, 370, 379, 220, 847, 275}), new int[]{14, 17, 220, 255, 275, 279, 348, 370, 374, 379, 635, 663, 847, 906, 944});

        assertArrayEquals(ArraySort.sortArray(new int[]{124, 97, 13, 20, 88, 50, 127, 45, -17, -24, 133, -10, 20, 42, 178}), new int[]{-24, -17, -10, 13, 20, 20, 42, 45, 50, 88, 97, 124, 127, 133, 178});

    }

    @org.junit.jupiter.api.Test
    public void testTask8() {

        List<Integer> seq1 = new ArrayList<Integer>(Arrays.asList(-10, 1, 1, 612, 79));
        List<Integer> seq2 = new ArrayList<Integer>(Arrays.asList(-7, 3, 4, 7, 120));
        List<Integer> res = new ArrayList<Integer>(Arrays.asList(1, 4, 5, 6, 7));
        Assertions.assertIterableEquals(IndexesCalculator.getIndeList(seq1, seq2), res);

        seq1 = Arrays.asList(182, -88, 149, -79, 71, -38, 137, -43, -3, 45);
        seq2 = Arrays.asList(61, -66, 16, 26, 120, 82, 88, 197, 169, -7);
        res = Arrays.asList(2, 3, 4, 5, 14, 15, 16, 17, 18, 11);
        Assertions.assertIterableEquals(IndexesCalculator.getIndeList(seq1, seq2), res);

        seq1 = Arrays.asList(686, -367, 681, -250, 243, 905, -131, -270, 787, 33);
        seq2 = Arrays.asList(-75, 858, 48, 568, -313, 791, 254, 809, 337, 813);
        res = Arrays.asList(2, 11, 4, 11, 6, 15, 14, 17, 16, 19);
        Assertions.assertIterableEquals(IndexesCalculator.getIndeList(seq1, seq2), res);


    }



    @org.junit.jupiter.api.Test
    public void testTask9() {

        Basket basket = new Basket();

        basket.add(new Ball(34, Color.GREEN));
        basket.add(new Ball(87, Color.BLUE));
        basket.add(new Ball(65, Color.BLUE));
        basket.add(new Ball(1, Color.RED));

        assertEquals(basket.getBasketWeight(), 187);
        assertEquals(basket.countBlueBalls(), 2);

    }

    @org.junit.jupiter.api.Test
    public void testTask14() {

        Book b1 = new Book("The Bell Jar", "Sylvia Plath", 12, "978-0061148514");
        Book b2 = b1;
        assertEquals(b1, b2);
    }

    @org.junit.jupiter.api.Test
    public void testTask15() {

        Book b1 = new Book("The Bell Jar", "Sylvia Plath", 12, "0061148512");
        Book b2 = new Book("The Bell Jar", "Crossing the Water", 8, "0060907894");
        assertEquals(b1.compareTo(b2), 1);
        assertEquals(b2.compareTo(b1), -1);

        Book b3 = new Book("The Bell Jar", "Sylvia Plath", 3, "0061148512");
        assertEquals(b1.compareTo(b3), 0);
    }


}
