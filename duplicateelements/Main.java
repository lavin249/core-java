package duplicateelements;

import java.util.*;

/**
 * @author Lavin
 *
 */
class Main {
	public static void main(String[] args) {

		/**
		 * How do you find the duplicate number in a given integer array?
		 */
		int input[];

		input = getArray();

		Arrays.sort(input);

		findDuplicate(input);
	}

	/**
	 * @param input
	 *            array find duplicate if any. otherwise print appropiate
	 *            message
	 */
	private static void findDuplicate(int[] input) {
		boolean duplicateFound = false;

		for (int i = 1; i < input.length; i++) {
			if (input[i - 1] == input[i]) {
				duplicateFound = true;
				System.out.print("\nRepeated Element is " + input[i - 1]);
			}
		}

		if (!duplicateFound) {
			System.out.print("\nNo Repeated Elements found");
		}

	}

	/**
	 * @return integer array Get Array from user.
	 */
	private static int[] getArray() {

		int size;

		Scanner sc = new Scanner(System.in);

		System.out.print("Enter the numbers of elements: ");
		size = sc.nextInt();
		int input[] = new int[size];

		for (int i = 0; i < size; i++) {
			System.out.print("\nEnter Data: ");
			input[i] = sc.nextInt();
		}
		sc.close();
		return input;
	}
}

/**
 * Enter the numbers of elements: 5
 * 
 * Enter Data: 1
 * 
 * Enter Data: 2
 * 
 * Enter Data: 1
 * 
 * Enter Data: 5
 * 
 * Enter Data: 2
 * 
 * Repeated Element is 1 Repeated Element is 2
 */