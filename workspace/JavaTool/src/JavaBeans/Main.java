package JavaBeans;

public class Main {
	public static void main(String[] args) {
		
		HumanBean h = new HumanBean();
		h.setAge(19);
		h.setName("白石翔大");
		System.out.printf("名前%s年齢(%d)歳",h.getName(),h.getAge());
	}
}
