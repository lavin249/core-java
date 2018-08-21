package maxminarray;

import java.util.*;

/**
 * @author Lavin
 *
 */
class Main {
	public static void main(String[] args) {

		/**
		 * How do you find the largest and smallest number in an unsorted
		 * integer array without sorting it.
		 **/

		int n, i, max = Integer.MIN_VALUE, min = Integer.MAX_VALUE;

		Scanner sc = new Scanner(System.in);

		System.out.print("Enter the numbers of elements: ");
		n = sc.nextInt();

		int input[] = new int[n];

		for (i = 0; i < n; i++) {
			System.out.print("\nEnter Data: ");
			input[i] = sc.nextInt();
			if (input[i] > max)
				max = input[i];
			if (input[i] < min)
				min = input[i];
		}
		sc.close();
		System.out.print("\nMax: " + max + ". Min: " + min);
	}
}

/**
 * 
 * Output
 * 
 * Enter the numbers of elements: 5
 * 
 * Enter Data: 10
 * 
 * Enter Data: 12
 * 
 * Enter Data: 15
 * 
 * Enter Data: 20
 * 
 * Enter Data: -5
 * 
 * Max: 20. Min: -5
 * 
 */
