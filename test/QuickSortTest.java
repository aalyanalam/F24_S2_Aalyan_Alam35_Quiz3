import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
class QuickSortTest {

    @Test
    public void testQuickSortFirstPivot() {
        // Test with FIRST pivot
        QuickSort.type = QuickSort.PIVOT_TYPE.FIRST;
        Integer[] input = {5, 2, 9, 1, 5, 6};
        Integer[] expected = {1, 2, 5, 5, 6, 9};

        Integer[] result = QuickSort.sort(QuickSort.PIVOT_TYPE.FIRST, input);

        assertArrayEquals(expected, result);
    }

    @Test
    public void testQuickSortMiddlePivot() {
        // Test with MIDDLE pivot
        QuickSort.type = QuickSort.PIVOT_TYPE.MIDDLE;
        Integer[] input = {3, 7, 8, 5, 2, 1, 9, 5, 4};
        Integer[] expected = {1, 2, 3, 4, 5, 5, 7, 8, 9};

        Integer[] result = QuickSort.sort(QuickSort.PIVOT_TYPE.MIDDLE, input);

        assertArrayEquals(expected, result);
    }

    @Test
    public void testQuickSortRandomPivot() {
        // Test with RANDOM pivot
        QuickSort.type = QuickSort.PIVOT_TYPE.RANDOM;
        Integer[] input = {10, -1, 2, 5, 0, 6, 4, -5};
        Integer[] expected = {-5, -1, 0, 2, 4, 5, 6, 10};

        Integer[] result = QuickSort.sort(QuickSort.PIVOT_TYPE.RANDOM, input);

        assertArrayEquals(expected, result);
    }

    @Test
    public void testAlreadySortedArray() {
        // Test an already sorted array
        QuickSort.type = QuickSort.PIVOT_TYPE.MIDDLE;
        Integer[] input = {1, 2, 3, 4, 5};
        Integer[] expected = {1, 2, 3, 4, 5};

        Integer[] result = QuickSort.sort(QuickSort.PIVOT_TYPE.MIDDLE, input);

        assertArrayEquals(expected, result);
    }

    @Test
    public void testReverseSortedArray() {
        // Test a reverse sorted array
        QuickSort.type = QuickSort.PIVOT_TYPE.FIRST;
        Integer[] input = {5, 4, 3, 2, 1};
        Integer[] expected = {1, 2, 3, 4, 5};

        Integer[] result = QuickSort.sort(QuickSort.PIVOT_TYPE.FIRST, input);

        assertArrayEquals(expected, result);
    }

    @Test
    public void testSingleElementArray() {
        // Test an array with a single element
        QuickSort.type = QuickSort.PIVOT_TYPE.RANDOM;
        Integer[] input = {42};
        Integer[] expected = {42};

        Integer[] result = QuickSort.sort(QuickSort.PIVOT_TYPE.RANDOM, input);

        assertArrayEquals(expected, result);
    }

    @Test
    public void testEmptyArray() {
        // Test an empty array
        QuickSort.type = QuickSort.PIVOT_TYPE.RANDOM;
        Integer[] input = {};
        Integer[] expected = {};

        Integer[] result = QuickSort.sort(QuickSort.PIVOT_TYPE.RANDOM, input);

        assertArrayEquals(expected, result);
    }

    @Test
    public void testArrayWithDuplicates() {
        // Test an array with duplicate values
        QuickSort.type = QuickSort.PIVOT_TYPE.FIRST;
        Integer[] input = {4, 5, 6, 4, 3, 4};
        Integer[] expected = {3, 4, 4, 4, 5, 6};

        Integer[] result = QuickSort.sort(QuickSort.PIVOT_TYPE.FIRST, input);

        assertArrayEquals(expected, result);
    }

}