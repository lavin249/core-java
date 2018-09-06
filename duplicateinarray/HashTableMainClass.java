package duplicateinarray;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;

/**
 * @author Lavin
 */
public class HashTableMainClass {
	public static void main(String[] args) {
		
		/**
		 *   Display Frequency of all the elements in Array. OR Find duplicates
		 *   Elements in Array
		 */
		int inputArray[];
		Map<Integer, Integer> hashedInput = new HashMap<Integer, Integer>();
		Scanner sc = new Scanner(System.in);
		
		System.out.print("\nEnter the size of array: ");
		int size = sc.nextInt();
		inputArray = new int[size];
		
		for (int i = 0; i < size; i++) {
			System.out.print("\nEnter Element: ");
			inputArray[i] = sc.nextInt();
		}
		sc.close();

		/**
		 * Display Array Elements
		 **/
		System.out.println("\nDisplaying Array");
		for (Integer i : inputArray) {
			System.out.print(i + " ");
		}

		/**
		 * Put <Element,Frequency> in HashMap
		 */
		System.out.println();
		for (Integer i : inputArray) {
			hashedInput.put(i, hashedInput.containsKey(i) ? hashedInput.get(i) + 1 : 1);
		}

		for (Entry<Integer, Integer> entry : hashedInput.entrySet()) {
			System.out.println("\nElement " + entry.getKey() + ". Frequency " + entry.getValue());
		}

		// throw new RuntimeException("No Repeating Element");

	}
}

/**
 * OUTPUT #1
 * 
 * Enter the size of array: 5
 * 
 * Enter Element: 1
 * 
 * Enter Element: 2
 * 
 * Enter Element: 1
 * 
 * Enter Element: 2
 * 
 * Enter Element: 3
 * 
 * Displaying Array 1 2 1 2 3
 * 
 * Element 1. Frequency 2
 * 
 * Element 2. Frequency 2
 * 
 * Element 3. Frequency 1
 * 
 * 
 * OUTPUT #2
 * 
 * 
 * Enter the size of array: 5
 * 
 * Enter Element: 1
 * 
 * Enter Element: 1
 * 
 * Enter Element: 1
 * 
 * Enter Element: 1
 * 
 * Enter Element: 1
 * 
 * Displaying Array 1 1 1 1 1
 * 
 * Element 1. Frequency 5
 */