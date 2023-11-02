package org.example.task8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Task8 {


    public static void main(String[] args) {

        List<Integer> s1 = new ArrayList<Integer>(Arrays.asList(686, -367, 681, -250, 243, 905, -131, -270, 787, 33));
        List<Integer> s2 = new ArrayList<Integer>(Arrays.asList(-75, 858, 48, 568, -313, 791, 254, 809, 337, 813));

        List<Integer> indexes = IndexesCalculator.getIndeList(s1, s2);
        System.out.println("Places to paste in " + indexes);

        for (int i = 0; i < indexes.size(); i++)  s1.add(indexes.get(i), s2.get(i));
        System.out.println("Result of merging "+ s1);
    }



}