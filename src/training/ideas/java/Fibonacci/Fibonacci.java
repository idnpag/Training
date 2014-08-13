package training.ideas.java.Fibonacci;

import com.sun.deploy.util.ArrayUtil;

import java.util.ArrayList;

/**
 * fibo by recursion
 *
 */
public class Fibonacci {

    private static int getFibonacciNumber(int N) {

        if (N == 0) return 0;
        else if (N == 1) return 1;
        else
            return getFibonacciNumber(N - 1) + getFibonacciNumber(N - 2);
    }

    public static int[] getSeriesForAGivenNByRecursion(int N) {
        int[] declareArray = new int[N];
        for (int i = 0; i < N; i++) {
            declareArray[i] = getFibonacciNumber(i);
        }
        return declareArray;
    }




}
