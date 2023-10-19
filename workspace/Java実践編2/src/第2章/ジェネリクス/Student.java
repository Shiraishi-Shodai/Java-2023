package 第2章.ジェネリクス;

public class Student {
	private int no;
	private String name;
	private String address;
	private int year;
	private int month;
	private int day;

	public Student clone() {
		Student result = new Student();
		result.no = this.no;
		result.name = this.name;
		result.address = this.address;
		result.year = this.year;
		result.month = this.month;
		result.day = this.day;
		return result;
	}

	public Student() {

	}

	public String toString() {
		return "学生情報　出席番号：" + this.no + ", 氏名：" + this.name + ", 住所：" + this.address + ", 生年月日：" + this.year + "/"
				+ this.month + "/" + this.day;
	}

	public Student(int no, String name, String address, int year, int month, int day) {
		this.no = no;
		this.name = name;
		this.address = address;
		this.year = year;
		this.month = month;
		this.day = day;
	}

	public boolean equals(Object o) {
		if (o == this)
			return true;
		if (o == null)
			return false;
		if (!(o instanceof Student))
			return false;
		Student r = (Student) o;
		if (this.no != r.no || !this.name.equals(r.name) || !this.address.equals(r.address) || this.year != r.year
				|| this.month != r.month || this.day != r.day) {
			return false;
		}
		return true;
	}

	public int getYear() {
		return year;
	}

	public int getMonth() {
		return month;
	}

	public int getDay() {
		return day;
	}

}