package duplicateinarray;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

/**
 * @author Lavin
 */
public class SetMainClass {
	public static void main(String[] args) {

		/**
		 * Check if the number is repeated or not
		 */
		Set<Integer> s = new HashSet<Integer>();
		Scanner sc = new Scanner(System.in);
		System.out.print("\nEnter the size of array: ");
		int size = sc.nextInt();
		for (int i = 0; i < size; i++) {
			System.out.print("\nEnter Element: ");
			Integer element = sc.nextInt();
			boolean isAdded = s.add(element);
			if (!isAdded) {
				System.out.println("\nNumber is Repeated: " + element);
			}
		}
		sc.close();
	}
}

/**
 * OUTPUT #1
 * 
 * Enter the size of array: 5
 * 
 * Enter Element: 1
 * 
 * Enter Element: 1
 * 
 * Number is Repeated: 1
 * 
 * Enter Element: 2
 * 
 * Enter Element: 2
 * 
 * Number is Repeated: 2
 * 
 * Enter Element: 3
 */