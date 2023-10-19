package 第1章.clone;


public class Exam implements Cloneable {
	private String name;

	public Exam clone() {
//		⑪Examクラスのインスタンス(result)を生成
		Exam result = new Exam();
//		⑫インスタンスresultのnameフィールドに、このインスタンスのnameフィールドを代入
		result.name = this.name;
//		⑬resultを戻り値として返す
		return result;
	}

	public Exam() {
	}

	public Exam(String name) {
		this.name = name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

}
