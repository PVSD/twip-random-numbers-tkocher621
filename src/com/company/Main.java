package com.company;
import java.util.*;

public class Main {

    private static int RandomNumber(int min, int max)
    {
        return (int)(Math.random() * ((max - min) + 1) + min);
    }

    private static int NumOfIterations()
    {
        List<Integer> numList = new ArrayList<>();
        int count = 0;
        while (numList.size() < 100) {

            int num = RandomNumber(1, 100);

            if (!numList.contains(num))
                numList.add(num);
            count++;
        }
        return count;
    }

    private static int GetAverageLoopRunNum(int iterations)
    {
        int av = 0;
        for (int i = 0; i < iterations; i++)
            av += NumOfIterations();
        return av/iterations;
    }

    public static void main(String[] args) {

        System.out.println("Average iterations:");
        System.out.println("100 loops: " + GetAverageLoopRunNum(100));
        System.out.println("1,000 loops: " + GetAverageLoopRunNum(1000));
        System.out.println("10,000 loops: " + GetAverageLoopRunNum(10000));
        System.out.println("The variation between the answers become smaller as the amount of loops get higher\n" +
                "because there is more data to work with, making a more accurate estimate.");

    }
}
