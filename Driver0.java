
public class Driver0 {

	public static void main(String[] args) {
		
		final int SIZE = 10;
		int[] a = new int[SIZE];
		Sort sort = new Sort();
		sort.initializeArray(a, a.length);
		sort.randomizeArray(a, a.length);
		
		a = new int[]{ 73, 6, 57, 88, 60, 42, 83, 72, 48, 85 };
		
		System.out.print("Initially, the array is:");
		sort.displayArray(a, a.length);

		sort.heapSort(a, a.length);

		System.out.print("\nThe array is now sorted:");
		sort.displayArray(a, a.length);
	}
}
