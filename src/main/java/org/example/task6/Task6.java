package org.example.task6;

import java.util.Scanner;

public class Task6 {

    public static void main(String[] args) {

        System.out.print("Enter n: ");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        int[][] arr = GetMatrix.getMatrix(n);;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.printf("%3d", arr[i][j]);
            }
            System.out.print("\n");
        }
        System.out.print("\n");

        for (int i = 0; i < n; i++) {
            System.out.print("{");
            for (int j = 0; j < n; j++) {
                System.out.printf("%d, ", arr[i][j]);
            }
            System.out.print("}, ");
        }

    }
}
