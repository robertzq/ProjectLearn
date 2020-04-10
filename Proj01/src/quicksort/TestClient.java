package quicksort;

import java.util.Arrays;
import java.util.Random;

import bubbleSort.MBubbleSort;
import linkedlist.MLinkedList;
import linkedlist.MNode;

public class TestClient {
	public static void main(String[] args) throws CloneNotSupportedException {
//		int[] array = generateRandomArray(5);
//		printArray(array);
//		//	quick sort
//		new MQuickSort().toSort(array,0,array.length-1);
//		printArray(array);
////
////		array = generateRandomArray(5);
////		printArray(array);
////		// bubble sort
////		int[] array1 = new MBubbleSort().toSort(array);
////		printArray(array1);
//
//		MLinkedList mLinkedList=new MLinkedList();
//		mLinkedList.createLinkedList(5,2,3,4,8,6);
//		for(int i=0;i<mLinkedList.length();i++){
//			System.out.println(mLinkedList.getNodeAtIndex(i));
//		}
		Name name1=  new Name(1);
		Name name2=  new Name(2);
		System.out.println(name1);
		System.out.println(name2);
		if(name2.compareTo(name1)>0){
			System.out.println("name2 > name 1");
		}
		Name[] result = swapObj(name1, name2);
		System.out.println(result[0]);
		System.out.println(result[1]);

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

	private static  Name[] swapObj(Name a,Name b)  {
		Name c = null;
		c=(Name) a.clone();
		a=null;
		a=(Name) b.clone();
		b=null;
		b=c;
		c=null;
		return new Name[]{a,b};
	}


}

class Name implements  Cloneable ,Comparable{
	int num=0;
	public Name(int num){
		this.num= num;
	}

	public String toString(){
		return "["+this.num+"]";
	}

	@Override
	public Object clone() {
		Name a = null;
		try {
			a = (Name) super.clone();
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
		return a;
	}

	@Override
	public int compareTo(Object o) {

		return this.num > ((Name)o).num?1:(this.num==((Name)o).num?0:-1);
	}
}