package 第1章.Comparator;

import java.util.Comparator;

public class YmdComparator implements Comparator<Student> {
	public int compare(Student x, Student y) {
		if (x.getYear() != y.getYear()) {
			return (x.getYear() - y.getYear());
		}
		if (x.getMonth() != y.getMonth()) {
			return (x.getMonth() - y.getMonth());
		}
		return (x.getDay() - y.getDay());
	}
}
