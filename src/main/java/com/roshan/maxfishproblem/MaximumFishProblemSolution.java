package com.roshan.maxfishproblem;

public class MaximumFishProblemSolution {
    private static int maximumFishSum;

    // returns the maximum no of fish by calling processElement
    public static int getMaximumFishSum(int[][] arr) {
        maximumFishSum = 0;
        for (int i = 0; i < arr.length; i++) {
            if (i != 0) {
                processElement(arr, i - 1, 1, arr[i][0]);
            }
            if (i != arr.length - 1) {
                processElement(arr, i + 1, 1, arr[i][0]);
            }
        }
        return maximumFishSum;
    }

    // calculates the sum of all possible paths by using recursion
    private static void processElement(int[][] arr, int i, int j, int currentRunningFishSum) {
        if (j <= arr[i].length - 1) {
            currentRunningFishSum += arr[i][j];
            if (maximumFishSum < currentRunningFishSum) {
                maximumFishSum = currentRunningFishSum;
            }

            if (i != 0) {
                processElement(arr, i - 1, j + 1, currentRunningFishSum);
            }
            processElement(arr, i, j + 1, currentRunningFishSum);
            if (i != arr.length - 1) {
                processElement(arr, i + 1, j + 1, currentRunningFishSum);
            }
        }
    }
}
