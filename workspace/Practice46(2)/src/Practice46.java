
public class Practice46 {
	public static void main (String []args) {
		Student s = new Student();
		s.setScore(90,80,70);
		s.setName("河原太郎");
		System.out.println(s.getName()+"さんのテストの合計は"+s.getScore()+"点です");
	}

}
