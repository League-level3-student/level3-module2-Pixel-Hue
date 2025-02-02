package _01_Sorting_Algorithms;

import java.util.Random;

public class BogoSorter extends Sorter {
    public BogoSorter() {
        type = "Bogo";
    }

    /*
     * Bogo sort is a joke sorting algorithm. It is considered the most
     * inefficient sorting algorithm while still maintaining the possibility
     * of eventually sorting data.
     * 
     * It works by following these steps:
     * STEP 1. Is the array in order?
     * if yes, finished; if no, go to step 2.
     * STEP 2. Take two random elements in the array and swap them.
     * STEP 3. Go back to step 1.
     */
    @Override
    void sort(int[] array, SortingVisualizer display) {
    	boolean isSorted = false;
    	int count;
    	while (!isSorted) {
    		count = 0;
    		//is sorted?
    		 for (int i = 0; i < array.length-1; i++) {
    	        	if (array[i] < array[i+1]) {
    	        			count++;
    	        	}
    	        }
    		 if (count == array.length - 1) {
    			 isSorted = true;
    		 }
    		 
    		 //swap 2 random
    	int element1 = (int) (Math.random() * array.length);
    	int element2 = (int) (Math.random() * array.length);
       int temp = array[element1];
       array[element1] = array[element2];
       array[element2] = temp;
       display.updateDisplay();
    	}
    }
}
