package org.example.task2;

import java.util.Scanner;

public class Task2 {

    public static void main(String[] args) {

        System.out.print("Enter x: ");
        Scanner scanner = new Scanner(System.in);
        float x = scanner.nextFloat();

        System.out.print("Enter y: ");
        float y = scanner.nextFloat();

        if (PointAffiliation.checkFigure(x, y)) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }
    }
}

