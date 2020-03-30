package quicksort;

import java.util.Arrays;

public class TestClient {
	public static void main(String[] args) {
		
		int[] array = new int[] {88,26,34,112,324,3,11};
		Arrays.stream(array).forEach(e -> System.out.print(e + ","));
		System.out.println();
		System.out.println("-----------------------");
		new MQuickSort().toSort(array,0,array.length-1);
		Arrays.stream(array).forEach(e -> System.out.print(e + ","));
		System.out.println();
		
	}
	
}
