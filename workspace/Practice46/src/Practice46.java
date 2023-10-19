
public class Practice46 {
	public static void main(String []args) {
		
		Student s = new Student();

		s.setStudent("河原太郎",90,80,70);

		System.out.println(s.getName() + "さんのテストの合計は" + s.getTotal() + "点です");
	}
}
