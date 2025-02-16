package _02_Intro_To_Searching_Algorithms;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class _03_SearchTest {

    /*
     *  A minimum of 3 tests are required for each method
     */
	 String[] stringArr = {"Joe", "Job", "Bill", "John"};
	 int[] intArr = {1, 3, 6, 10, 13};
    @Test
    public void testLinearSearch() {
        // 1. Use the assertEquals() method to test your linear search method
        assertEquals(_01_LinearSearch.linearSearch(stringArr, "John"), 3);
        assertEquals(_01_LinearSearch.linearSearch(stringArr, "Bill"), 2);
        assertEquals(_01_LinearSearch.linearSearch(stringArr, "Ron"), -1);
    }

    @Test
    public void testBinarySearch() {
        // 2. Use the assertEquals() method to test your binary search method
        //    remember that the array must be sorted
        assertEquals(_02_BinarySearch.binarySearch(intArr, 0, intArr.length - 1, 3), 1);
        assertEquals(_02_BinarySearch.binarySearch(intArr, 0, intArr.length - 1, 10), 3);
        assertEquals(_02_BinarySearch.binarySearch(intArr, 0, intArr.length - 1, 6), 2);
    }
}
