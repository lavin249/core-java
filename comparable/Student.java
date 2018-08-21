package comparable;

/**
 * @author Lavin
 *
 */
public class Student implements Comparable<Student> {

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

	/**
	 * (non-Javadoc)
	 * @see java.lang.Comparable#compareTo(java.lang.Object)
	 */
	@Override
	public int compareTo(Student s) {
		
		/*
		 * If comparing two strings. Directly use 
		 * 	@return name.compareTo(s.name);
		 */
		int result;
		
		if (age > s.age)
			result = 1;
		else if (age == s.age)
			result = 0;
		else
			result = -1;
		return result;
	}

}
