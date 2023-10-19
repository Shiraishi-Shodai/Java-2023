package Practice46;

public class Practice46 { public static void main(String[] args) {
	String s = "河原太郎";
	Student st = new Student();
	st.setterName(s);
	st.setterTotal(90, 30, 50);
	System.out.println(st.getterName() + "さんのテストの合計は" + st.getterTotal() + "点です"); } } 
