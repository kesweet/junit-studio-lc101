package main;

public class BonusBinarySearch {

    /**
     * A binary search implementation for integer arrays.
     *
     * Info about binary search: https://www.geeksforgeeks.org/binary-search/
     *
     * @param sortedNumbers - must be sorted from least to greatest
     * @param n - number to search for
     * @return index of search item if it's found, -1 if not found
     */
    public static int binarySearch(int[] sortedNumbers, int n) {
        int right = sortedNumbers.length - 1;
        int left = 0;
        do {
            if (sortedNumbers[right] == n) {
                return right;
            } else if (sortedNumbers[left] == n) {
                return left;
            }
            int mid = left + ((right - left) / 2);
            if (sortedNumbers[mid] > n) {
                right = mid;
            }
            if (sortedNumbers[mid] < n) {
                left = mid;
            }
            if (sortedNumbers[mid] == n) {
                return mid;
            }
        } while (right > left + 1);
        return -1;
    }

}
