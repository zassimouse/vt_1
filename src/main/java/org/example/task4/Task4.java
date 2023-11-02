package org.example.task4;

public class Task4 {

    public static void main(String[] args) {

        int[] arr = {68, 89, 345, 99, 903, 324, 87, 79, 23, 90};

        PrimesGetter.getPrimeNumbersPositions(arr).forEach((Integer value) -> System.out.print(value + " "));
    }
}
