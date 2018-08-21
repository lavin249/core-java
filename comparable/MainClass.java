package comparable;

import java.util.Arrays;
import java.util.Collections;
import java.util.Date;

/**
 * @author Lavin 
 * Example Showing Custom Comparable .
 */
public class MainClass {

	public static void main(String[] args) {


		/**
		 * Get Student Details
		 */
		Student[] students = populateStudentData();

		displayStudentData(students);

		Arrays.sort(students);

		displayStudentData(students);
	}

	/**
	 * @return Array of Student Object
	 */
	public static Student[] populateStudentData() {
		return new Student[] { 
				new Student("Lavin", 23, 6.00, 93, 'A'), 
				new Student("Alex", 24, 5.11, 58, 'A'),
				new Student("Peter", 28, 5.00, 80, 'A'), 
				new Student("Kevin", 36, 5.50, 100, 'B'),
				new Student("Simon", 18, 4.50, 76, 'A'), 
				new Student("Martin", 23, 5.3, 87, 'B'),
				new Student("George", 25, 6.2, 45, 'A'), 
				new Student("Jasmine", 29, 5.90, 93, 'A'),
				new Student("Ariel", 32, 5.80, 33, 'B'), 
				new Student("Kate", 21, 5.23, 20, 'A'),
				new Student("John", 22, 5.83, 67, 'B'), 
				new Student("Erica", 23, 6.50, 88, 'A'),
				new Student("Mellisa", 27, 5.35, 75, 'A') };
	}

	/**
	 * @param students
	 *            Displays all Student Records
	 */
	public static void displayStudentData(Student[] students) {
		System.out.println("\nStudent Details:");
		for (int i = 0; i < students.length; i++)
			System.out.println(students[i].toString());
	}
}
