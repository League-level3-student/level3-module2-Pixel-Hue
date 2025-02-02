package _01_Sorting_Algorithms;

public class BubbleSorter extends Sorter{
    public BubbleSorter() {
        type = "Bubble";
    }

    /* 
     * Use the bubble sorting algorithm to sort the array.
     * You can use display.updateDisplay() to show the current
     * progress on the graph.
     */
    @Override
    void sort(int[] array, SortingVisualizer display) {
      boolean swapped;
        
    	  
        for (int i = 0; i < array.length - 1; i++) {
            swapped = false;
            for (int j = 0; j < array.length - 1; j++) {
                if (array[j] > array[j+1]) {
                	int temp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = temp;
                    swapped = true;
                }
            }
            display.updateDisplay();
            if (swapped = false) {
            	break;
            }
            
    }
        
    } 
}

