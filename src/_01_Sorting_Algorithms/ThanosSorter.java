package _01_Sorting_Algorithms;

import java.util.concurrent.TimeUnit;

public class ThanosSorter extends Sorter {
	public ThanosSorter() {
		type = "Thanos";
	}

	/*
	 * Thanos Sort is the sorting algorithm used by mighty titan Thanos. When Thanos
	 * observes that the array is unsorted, he simply snaps his fingers and removes
	 * half of the array items to bring balance to the array. Thanos will keep
	 * snapping his fingers until the remaining elements are completely sorted. For
	 * example: int[] arr = {12, 100, 200, 201, 97, 33, 100, 687};
	 * 
	 * Thanos looks at this array from left to right and sees the the first element
	 * that isn't greater than the previous one is 97 (12, 100, 200, 201 are all in
	 * order). In quiet rage, Thanos randomly picks half of the elements in the
	 * array and removes them. In this case he removes the second half, so the array
	 * now looks like: {12, 100, 200, 201, 0, 0, 0, 0} // second half removed
	 * 
	 * The remaining non-0 values are now in order and balance is restored to the
	 * array. If Thanos removed the first half, the array would be: {0, 0, 0, 0, 97,
	 * 33, 100, 687}
	 * 
	 * The first unordered number is 33, so Thanos snaps his fingers and removes
	 * half again: {0, 0, 0, 0, 0, 0, 100, 687} // first half or {0, 0, 0, 0, 97,
	 * 33, 0, 0} // second half
	 * 
	 * If the first half is removed the result is sorted. If the second half is
	 * removed 33 isn't sorted so Thanos snaps his fingers again! The result is
	 * either: {0, 0, 0, 0, 0, 33, 0, 0} // first half or {0, 0, 0, 0, 97, 0, 0, 0}
	 * // second half
	 * 
	 * NOTE: The algorithm doesn't necessarily have to take away half from the front
	 * or back of the array. You can implement an algorithm that takes elements away
	 * randomly until half (in this case (n-1)/2) remain. The algorithm is up to
	 * you!
	 */
	@Override
	void sort(int[] arr, SortingVisualizer display) {
		boolean isSorted = false;
		int count;
		int snapCheck;
		int thanosLength = arr.length;
		int numsLeft = 0;
		while (!isSorted) {

			numsLeft = 0;
			for (int i = 0; i < arr.length; i++) {
				if (arr[i] != 0) {
					numsLeft++;
				}

			}

			// check if sorted
			count = 0;
			for (int i = 0; i < arr.length - 1; i++) {
				if (arr[i] != 0) {
					for (int j = i + 1; j < arr.length; j++) {
						if (arr[j] != 0) {
							if (arr[i] < arr[j]) {
								count++;
								
							}
							i = j-1;
							break;
						}

					}
				}
			}
System.out.println(count);
System.out.println(numsLeft);
			if (count == numsLeft -1 || numsLeft == 1) {
				isSorted = true;
				break;
			}

			// thanos snap
			snapCheck = 0;
			while (snapCheck < numsLeft / 2 ) {
				int random = (int) (Math.random() * arr.length);

				if (arr[random] != 0) {
					arr[random] = 0;
					snapCheck++;
					display.updateDisplay();
				
				}
			}
			try {
				TimeUnit.SECONDS.sleep(1);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		display.updateDisplay();
	}
}
