package org.example.task8;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class IndexesCalculator {

    public static List<Integer> getIndeList(List<Integer> to, List<Integer> from) {

        List<Integer> result = new ArrayList<>();
        for (int i = 0; i < from.size(); i++) {

            int dest = Collections.binarySearch(to, from.get(i));
            if (dest < 0) result.add(-(dest + 1) + i);
            else result.add(dest + i);
        }
        return result;
    }
}

