package com.roshan.maxfishproblem;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

public class MaximumFishProblemSolutionTest {

    static Stream<Arguments> getInputData() {
        int[][] arr1 = {{1, 3, 3}, {2, 1, 4}, {0, 6, 4}};
        int[][] arr2 = {{1, 3, 1, 5}, {2, 2, 4, 1}, {5, 0, 2, 3}, {0, 6, 1, 2}};
        int[][] arr3 = {{10, 33, 13, 15}, {22, 21, 04, 1}, {5, 0, 2, 3}, {0, 6, 14, 2}};
        int[][] arr4 = {{1, 3, 1, 5}, {2, 2, 4, 1}, {5, 0, 2, 3}, {0, 6, 1, 2}};
        int[][] arr5 = {{10, 0, 0, 0}, {2, 1, 3, 4}, {0, 0, 0, 0}, {0, 0, 0, 0}, {0, 0, 0, 0}, {5, 6, 7, 8}};
        int[][] arr6 = {{36, 5, 46, 29, 13, 57, 24, 95}, {82, 45, 14, 67, 34, 64, 43, 50}, {87, 8, 76, 78, 88, 84, 3, 51}, {54, 99, 32, 60, 76, 68, 39, 12},
                {26, 86, 94, 39, 95, 70, 34, 78}};

        return Stream.of(
                Arguments.arguments(arr1, 12),
                Arguments.arguments(arr2, 16),
                Arguments.arguments(arr3, 83),
                Arguments.arguments(arr4, 16),
                Arguments.arguments(arr5, 21),
                Arguments.arguments(arr6, 650));
    }


    @ParameterizedTest
    @MethodSource("getInputData")
    void maximumFishProblemSolutionTest(int[][] arr, int expectMaximumFishSum) {

        try {
            int maximumFishSumReturnedFromAlgorithm = MaximumFishProblemSolution.getMaximumFishSum(arr);
            Assertions.assertEquals(expectMaximumFishSum, maximumFishSumReturnedFromAlgorithm);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
