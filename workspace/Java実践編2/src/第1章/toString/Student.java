package 第1章.toString;

public class Student {
	private String name;		//氏名
	private String address;		//住所
	private int year;			//生年月日　年
	private int month;			//生年月日　月
	private int day;			//生年月日　日

	public String toString() {
		return "名前:"+this.name+",住所:"+this.address+",生年月日:"+this.year+"/"+this.month+"/"+this.day+"/";
	}

	public Student(String name, String address, int year, int month, int day) {
		this.name = name;
		this.address = address;
		this.year = year;
		this.month = month;
		this.day = day;
	}
}
