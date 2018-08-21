package missingnumber;

import java.util.*;

/**
 * @author Lavin
 *
 */
class Main {
	public static void main(String[] args) {

		/**
		 * How do you find the missing number in a given integer array of 1 to
		 * n?
		 */
		int size = getArraySize();

		/**
		 * array size will decrease by 1
		 */
		int actualSum = getArraySum(size - 1);

		System.out.println("\nMissing Number is " + (expectedSum(size) - actualSum));
	}

	/**
	 * @param n
	 * @return sum Calculate Sum using Arithmatic Progression Principle
	 */
	private static int expectedSum(int n) {
		return n * (n + 1) / 2;
	}

	/**
	 * @param size
	 * @return int Get Array from user Add all elements
	 */
	private static int getArraySum(int size) {

		int actualSum = 0;

		Scanner sc = new Scanner(System.in);

		int[] input = new int[size];

		for (int i = 0; i < size; i++) {
			System.out.print("\nEnter Data: ");
			input[i] = sc.nextInt();
			actualSum = actualSum + input[i];
		}
		sc.close();
		return actualSum;
	}

	private static int getArraySize() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the last element: ");
		return sc.nextInt();
	}
}
/**
 * Enter the last element: 5
 * 
 * Enter Data: 1
 * 
 * Enter Data: 2
 * 
 * Enter Data: 4
 * 
 * Enter Data: 5
 * 
 * Missing Number is 3
 */