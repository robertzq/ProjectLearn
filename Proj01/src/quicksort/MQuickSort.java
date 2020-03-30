package quicksort;

import java.util.Arrays;

/**
 * Quick sort
 * 
 * @author Robert Zhao
 *
 */
public class MQuickSort {

	public void toSort(int[] needToSort, int start, int end) {
		printArray(needToSort);
		System.out.println("-------------sort start---------------");
		// 1. choose middle index as a basic point number

		int pointerr = partitionIndex(needToSort, start, end);
		if (pointerr - 1 > start) {
			// sort left child part
			toSort(needToSort, start, pointerr - 1);
		}
		if (end > pointerr + 1) {
			// sort right child part
			toSort(needToSort, pointerr + 1, end);
		}

	}

	private int partitionIndex(int[] needToSort, int start, int end) {
		int baseIndex = start;
		int pviot = needToSort[baseIndex];
		int pointerl = start;
		int pointerr = end;
		if (start >= end) {
			System.out.println("-------------sort end---------------");
			System.out.println("result: ");
			// printArray(needToSort);
			return pointerr;
		}
		// System.out.println("left: "+pointerl+" right:"+pointerr);
		while (pointerl < pointerr) {
			// System.out.println("left: "+needToSort[pointerl]+"
			// right:"+needToSort[pointerr]+" base:"+pviot);
			// System.out.println("right block: right: "+needToSort[pointerr]+" <
			// base:"+pviot+"?");
			while (needToSort[pointerr] >= pviot && pointerr > start) {

				pointerr--;
			}
			// System.out.println("left: "+needToSort[pointerl]+"
			// right:"+needToSort[pointerr]+" base:"+pviot);
			// System.out.println("right block: left: "+needToSort[pointerr]+" >
			// base:"+pviot+"?");
			while (needToSort[pointerl] <= pviot && pointerl < end) {
				pointerl++;
			}
			if (pointerl <= pointerr) {
				swapnum(needToSort, pointerl, pointerr);
			}

			// System.out.println("left: "+needToSort[pointerl]+"
			// right:"+needToSort[pointerr]+" base:"+pviot);
			// System.out.println("left block: left: "+needToSort[pointerl]+" >
			// base:"+pviot+"?");

		}
		swapnum(needToSort, pointerr, baseIndex);
		return pointerr;
	}

	private void swapnum(int[] needToSort, int i, int baseIndex) {
		int tmp = needToSort[i];
		needToSort[i] = needToSort[baseIndex];
		needToSort[baseIndex] = tmp;

	}

	private void printArray(int[] array) {
		Arrays.stream(array).forEach(e -> System.out.print(e + ","));
		System.out.println();
	}

}
