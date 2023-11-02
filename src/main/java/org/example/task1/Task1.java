package org.example.task1;

import java.util.Scanner;

public class Task1 {

    public static void main(String[] args) {

        System.out.print("Enter x: ");
        Scanner scanner = new Scanner(System.in);
        float x = scanner.nextFloat();

        System.out.print("Enter y: ");
        float y = scanner.nextFloat();

        double result = ExpressionCalculator.calculateExpression(x, y);

        System.out.print("Result: ");
        System.out.println(result);

    }
}