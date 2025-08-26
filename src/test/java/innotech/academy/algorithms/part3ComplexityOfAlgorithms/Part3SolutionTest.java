package innotech.academy.algorithms.part3ComplexityOfAlgorithms;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

class Part3SolutionTest {
    private final Part3Solution part3Solution = new Part3Solution();

    @Test
    void testSingleElement() {
        int[] arr = {42};
        Pair result = part3Solution.findMinMax(arr);

        assertEquals(42, result.min());
        assertEquals(42, result.max());
        assertEquals(0, result.comparisons());
    }

    @Test
    void testTwoElementsSorted() {
        int[] arr = {1, 5};
        Pair result = part3Solution.findMinMax(arr);

        assertEquals(1, result.min());
        assertEquals(5, result.max());
        assertEquals(1, result.comparisons());
    }

    @Test
    void testTwoElementsReversed() {
        int[] arr = {10, 3};
        Pair result = part3Solution.findMinMax(arr);

        assertEquals(3, result.min());
        assertEquals(10, result.max());
        assertEquals(1, result.comparisons());
    }

    @Test
    void testThreeElements() {
        int[] arr = {3, 1, 4};
        Pair result = part3Solution.findMinMax(arr);

        assertEquals(1, result.min());
        assertEquals(4, result.max());

        int maxAllowed = 3 * (arr.length / 2);
        assertTrue(result.comparisons() <= maxAllowed);
    }

    @Test
    void testFourElements() {
        int[] arr = {7, 2, 9, 1};
        Pair result = part3Solution.findMinMax(arr);

        assertEquals(1, result.min());
        assertEquals(9, result.max());

        int maxAllowed = 3 * (arr.length / 2);
        assertTrue(result.comparisons() <= maxAllowed);
    }

    @Test
    void testFiveElements() {
        int[] arr = {5, 1, 8, 3, 9};
        Pair result = part3Solution.findMinMax(arr);

        assertEquals(1, result.min());
        assertEquals(9, result.max());


        int maxAllowed = 3 * (arr.length / 2);
        assertTrue(result.comparisons() <= maxAllowed);
    }

    @Test
    void testLargeSortedArray() {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8};
        Pair result = part3Solution.findMinMax(arr);

        assertEquals(1, result.min());
        assertEquals(8, result.max());

        int maxAllowed = 3 * (arr.length / 2);
        assertTrue(result.comparisons() <= maxAllowed);
    }

    @Test
    void testAllSameValues() {
        int[] arr = {5, 5, 5, 5};
        Pair result = part3Solution.findMinMax(arr);

        assertEquals(5, result.min());
        assertEquals(5, result.max());

        int maxAllowed = 3 * (arr.length / 2);
        assertTrue(result.comparisons() <= maxAllowed);
    }

    @Test
    void testDescendingOrder() {
        int[] arr = {10, 8, 6, 4, 2};
        Pair result = part3Solution.findMinMax(arr);

        assertEquals(2, result.min());
        assertEquals(10, result.max());
        assertEquals(6, result.comparisons());
    }

    @Test
    void testEdgeCaseTwoElements() {
        int[] arr = {-1, -5};
        Pair result = part3Solution.findMinMax(arr);

        assertEquals(-5, result.min());
        assertEquals(-1, result.max());
        assertEquals(1, result.comparisons());
    }

    @Test
    void testNegativeValues() {
        int[] arr = {-10, 5, -3, 8};
        Pair result = part3Solution.findMinMax(arr);

        assertEquals(-10, result.min());
        assertEquals(8, result.max());

        int maxAllowed = 3 * (arr.length / 2);
        assertTrue(result.comparisons() <= maxAllowed);
    }
}