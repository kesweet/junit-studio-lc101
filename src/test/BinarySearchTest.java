package test;

import main.BonusBinarySearch;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BinarySearchTest {
    @Test
    public void negativeItemsFound() {
        assertEquals(2, BonusBinarySearch.binarySearch(new int[]{-10, -8, -5, 1, 3, 5, 7, 9}, -5));
    }

    @Test
    public void numFoundAtEndReturnsEndValue() {
        assertEquals(4, BonusBinarySearch.binarySearch(new int[]{1, 3, 5, 7, 9}, 9));
    }

    @Test
    public void numFoundAtBeginningReturns0() {
        assertEquals(0, BonusBinarySearch.binarySearch(new int[]{1, 3, 5, 7, 9}, 1));
    }

    @Test
    public void oneItemReturns0() {
        assertEquals(0, BonusBinarySearch.binarySearch(new int[]{9}, 9));
    }

    @Test
    public void numNotInListReturnsMinus1() {
        assertEquals(-1, BonusBinarySearch.binarySearch(new int[]{1, 3, 5, 7, 9}, 2));
    }

    @Test
    public void largerNumberNotFoundReturnsMinus1() {
        assertEquals(-1, BonusBinarySearch.binarySearch(new int[] {1, 2, 3, 4, 5}, 10));
    }

    @Test
    public void smallerNumberNotFoundReturnsMinus1() {
        assertEquals(-1, BonusBinarySearch.binarySearch(new int[] {1, 2, 3, 4, 5}, -2));
    }

}
