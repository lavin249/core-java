package comparator;

import java.util.Comparator;

public class GradeSort  implements Comparator<Student>{

	@Override
	public int compare(Student s1, Student s2) {
		if(s1.grade > s2.grade)
			return 1;
		if(s1.grade < s2.grade)
			return -1;
		return 0;
	}

}
