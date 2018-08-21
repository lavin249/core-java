package comparator;

/**
 * @author Lavin
 *
 */
public class Student {

	String name;
	int age;
	double height;
	int score;
	char grade;

	/**
	 * Parameterised Contructor
	 * @param name
	 * @param age
	 * @param height
	 * @param score
	 * @param grade
	 */
	public Student(String name, int age, double height, int score, char grade) {
		super();
		this.name = name;
		this.age = age;
		this.height = height;
		this.score = score;
		this.grade = grade;
	}

	/**
	 * (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Student [name=" + name + ", age=" + age + ", height=" + height + ", score=" + score + ", grade=" + grade
				+ "]";
	}
}
