
public class Starter {
	public static void main(String[] args) {
		final int SIZE = 10;
		int[] array = new int[SIZE];

		Sort s = new Sort();

		s.initializeArray(array, SIZE);
		System.out.print("Initially, the array is:");
		s.displayArray(array, SIZE);

		System.out.println();
		System.out.print("After randomization, the array becomes:");
		s.randomizeArray(array, SIZE);
		s.displayArray(array, SIZE);
		
		System.out.println("\nInsertion SORT...\n");
		s.insertionSort(array, SIZE);

		System.out.print("The array is now sorted:");
		s.displayArray(array, SIZE);

	}
}