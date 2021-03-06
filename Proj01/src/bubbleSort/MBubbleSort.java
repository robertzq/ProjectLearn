package bubbleSort;

public class MBubbleSort {

    public int[] toSort(int[] needToSort) {

        for (int i = 0; i < needToSort.length - 1; i++) {
            for (int j = 0; j < needToSort.length - 1 - i; j++) {
                if (needToSort[j] > needToSort[j + 1]) {
                    swapNum(needToSort, j, j + 1);
                }
            }
        }

        return needToSort;
    }

    private void swapNum(int[] needToSort, int i, int baseIndex) {
        int tmp = needToSort[i];
        needToSort[i] = needToSort[baseIndex];
        needToSort[baseIndex] = tmp;
    }
}

