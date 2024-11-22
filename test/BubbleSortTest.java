import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class BubbleSortTest {

    @Test
    public void testBubbleSortAscending() {
        Integer[] input = {4, 2, 7, 1, 9};
        Integer[] expected = {1, 2, 4, 7, 9};

        Integer[] result = BubbleSort.sort(input);

        assertArrayEquals(expected, result);
    }

    @Test
    public void testAlreadySorted() {
        Integer[] input = {1, 2, 3, 4, 5};
        Integer[] expected = {1, 2, 3, 4, 5};

        Integer[] result = BubbleSort.sort(input);

        assertArrayEquals(expected, result);
    }

    @Test
    public void testReverseSorted() {
        Integer[] input = {9, 7, 5, 3, 1};
        Integer[] expected = {1, 3, 5, 7, 9};

        Integer[] result = BubbleSort.sort(input);

        assertArrayEquals(expected, result);
    }

    @Test
    public void testEmptyArray() {
        Integer[] input = {};
        Integer[] expected = {};

        Integer[] result = BubbleSort.sort(input);

        assertArrayEquals(expected, result);
    }

    @Test
    public void testSingleElement() {
        Integer[] input = {42};
        Integer[] expected = {42};

        Integer[] result = BubbleSort.sort(input);

        assertArrayEquals(expected, result);
    }

}