package quicksort;

import java.util.Arrays;
import java.util.Random;

import bubbleSort.MBubbleSort;
import linkedlist.MLinkedList;
import linkedlist.MNode;

public class TestClient {
	public static void main(String[] args) {
		int[] array = generateRandomArray(5);
		printArray(array);
		//	quick sort
		new MQuickSort().toSort(array,0,array.length-1);
		printArray(array);
//
//		array = generateRandomArray(5);
//		printArray(array);
//		// bubble sort
//		int[] array1 = new MBubbleSort().toSort(array);
//		printArray(array1);

		MLinkedList mLinkedList=new MLinkedList();
		mLinkedList.createLinkedList(5,2,3,4,8,6);
		for(int i=0;i<mLinkedList.length();i++){
			System.out.println(mLinkedList.getNodeAtIndex(i));
		}


	}

	private static void printArray(int[] array) {
	
		Arrays.stream(array).forEach(e -> System.out.print(e + ","));
		System.out.println();
		System.out.println("-----------------------");
	}

	private static int[] generateRandomArray(int countOfNumber) {
		int[] array = new int[countOfNumber];
		Random random =new Random();
		for(int i=0;i<array.length;i++) {
			array[i]=random.nextInt(50)+1;
		}
		return array;
	}
	
}

