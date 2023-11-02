package org.example.task6;

public class GetMatrix {

    public static int[][] getMatrix(int n) {

        int[][] arr = new int[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = (i + j) % n + 1;
            }
        }

        return arr;
    }
}
