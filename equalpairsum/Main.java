package equalpairsum;

import java.util.*;

/**
 * @author Lavin
 *
 */
class Main {
	public static void main(String[] args) {

		/**
		 * Find all pairs of an integer array whose sum is equal to a given
		 * number
		 */

		List<Integer> inputList = getArray();

		Scanner sc = new Scanner(System.in);
		System.out.println("\n\nEnter Number: ");
		int sum = sc.nextInt();
		sc.close();

		displayDuplicatePairs(inputList, sum);
	}

	/**
	 * @param input
	 * @param sum
	 */
	private static void displayDuplicatePairs(List<Integer> input, int sum) {
		int compliment;
		boolean pairFound = false;
		Iterator<Integer> itr = input.iterator();
		while (itr.hasNext()) {
			Integer element = itr.next();
			compliment = sum - element;
			if (input.contains(compliment) && element != compliment) {
				pairFound = true;
				System.out.println("Pair Found: " + element + " & " + compliment);
				/**
				 * input.remove(compliment); Exception in thread "main"
				 * java.util.ConcurrentModificationException
				 */
				itr.remove();
			}
		}
		if (!pairFound) {
			System.out.println("\nNo Pair Found.");
		}
	}

	/**
	 * @return Integer array Get Array from user.
	 */
	private static List<Integer> getArray() {

		int size;

		Scanner sc = new Scanner(System.in);

		System.out.print("Enter the numbers of elements: ");
		size = sc.nextInt();
		List<Integer> inputList = new ArrayList<Integer>();

		for (int i = 0; i < size; i++) {
			System.out.print("\nEnter Data: ");
			inputList.add(sc.nextInt());
		}
		return inputList;
	}

}

/**
 * Enter the numbers of elements: 5
 * 
 * Enter Data: 1
 * 
 * Enter Data: 2
 * 
 * Enter Data: 3
 * 
 * Enter Data: 4
 * 
 * Enter Data: 5
 * 
 * Enter Number: 6 
 * 
 * Pair Found: 1 & 5 
 * Pair Found: 2 & 4
 */
