package comparator;

import java.util.Comparator;

public class HeightSort implements Comparator<Student> {

	@Override
	public int compare(Student s1, Student s2) {
		if(s1.height > s2.height)
			return 1;
		if(s1.height < s2.height)
			return -1;
		return 0; 
	}
}