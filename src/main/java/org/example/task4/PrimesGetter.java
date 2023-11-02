package org.example.task4;

import java.util.ArrayList;

public class PrimesGetter {

    public static ArrayList<Integer> getPrimeNumbersPositions(int[] arr)
    {
        ArrayList<Integer> result = new ArrayList<Integer>();
        for (int i = 0; i < arr.length; i++) {
            if (isPrime(arr[i])) result.add(i);
        }
        return result;
    }

    static  boolean isPrime(int a)
    {
        if (a <= 1)
        {
            return false;
        }
        for (int i = 2; i <= a / 2; i++)
        {
            if ( (a % i) == 0 ) return  false;
        }
        return true;
    }
}
