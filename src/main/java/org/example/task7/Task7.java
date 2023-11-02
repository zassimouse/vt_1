package org.example.task7;

public class Task7 {

    public static void main(String[] args) {

        int[] arr = {124, 97, 13, 20, 88, 50, 127, 45, -17, -24, 133, -10, 20, 42, 178};

        ArraySort.sortArray(arr);

        for (int x : arr) {
            System.out.printf("  %d", x);
        }
    }
}
