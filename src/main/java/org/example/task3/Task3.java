package org.example.task3;

import java.util.Scanner;

public class Task3 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Use commas instead of dots to separate decimal part");

        System.out.print("Enter a: ");
        float a = scanner.nextFloat();

        System.out.print("Enter b: ");
        float b = scanner.nextFloat();

        System.out.print("Enter h: ");
        float h = scanner.nextFloat();

        float x = a;
        while (x < b) {
            System.out.printf("%10f", x);
            System.out.printf("%15f\n", Math.tan(x));
            x += h;
        }
    }
}
