package quicksort;

/**
 * Quick sort
 * 
 * @author Robert Zhao
 *
 */
public class MQuickSort {

	public void toSort(int[] needToSort, int start, int end) {

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
		
			return pointerr;
		}

		while (pointerl < pointerr) {

			while (needToSort[pointerr] >= pviot && pointerr > start) {

				pointerr--;
			}

			while (needToSort[pointerl] <= pviot && pointerl < end) {
				pointerl++;
			}
			if (pointerl <= pointerr) {
				swapnum(needToSort, pointerl, pointerr);
			}

		}
		swapnum(needToSort, pointerr, baseIndex);
		return pointerr;
	}

	private void swapnum(int[] needToSort, int i, int baseIndex) {
		int tmp = needToSort[i];
		needToSort[i] = needToSort[baseIndex];
		needToSort[baseIndex] = tmp;

	}

	

}

