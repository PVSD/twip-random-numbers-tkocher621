package com.company;
import java.util.*;

public class Main {

    private static int RandomNumber(int min, int max)
    {
        return (int)(Math.random() * ((max - min) + 1) + min);
    }

    private static int NumOfIterations(int iter)
    {
        List<Integer> numList = new ArrayList<>();
        int count = 0;
        while (numList.size() < iter) {

            int num = RandomNumber(1, 100);

            if (!numList.contains(num))
                numList.add(num);
            count++;
        }
        System.out.println(count);
        return count;
    }

    private static int GetAverageLoopRunNum(int iterations)
    {
        int av = 0;
        for (int i = 1; i <= iterations; i++)
            av += NumOfIterations(iterations);
        return av/iterations;
    }

    public static void main(String[] args) {

        System.out.println("Average iterations:");
        System.out.println("100 loops: " + GetAverageLoopRunNum(100));
        System.out.println("1,000 loops: " + GetAverageLoopRunNum(1000));
        System.out.println("10,000 loops: " + GetAverageLoopRunNum(10000));

    }
}
