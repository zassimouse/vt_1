package org.example.task5;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CalcLIS {

    public static int getNumToDeleteForLIS(int[] arr) {

        // Calculate the length of the longest increasing subsequence (LIS) of the array.
        List<Integer> ans = new ArrayList<>();
        ans.add(arr[0]);
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > ans.get(ans.size() - 1)) {
                ans.add(arr[i]);
            } else {
                int low = Collections.binarySearch(ans, arr[i]);
                if (low < 0) {
                    low = -(low + 1);
                }
                ans.set(low, arr[i]);
            }
        }

        // Subtract the length of the LIS from the length of the array.
        return arr.length - ans.size();
    }
}
