package model;

//DBのphotoテーブルのデータを持つ
//テーブルとモデルは必ずしも1対1になるわけではない

public class Photo {
	private int	id;
	private String	title;
	private String	author;
	private int	date;
	private String	file;
	//参照を持つ。NULLで初期化することでどのアドレスも指していない状態にしている
//	バイト配列は、メモリ上に効率的に格納することができる
	private byte[]	image = null; 

	public Photo() {

	}
	public Photo(int i, String t, String a, int d, String f) {
		setId(i);
		setTitle(t);
		setAuthor(a);
		setDate(d);
		setFile(f);
	}
	public int getId() {
		return id;
	}
	public String getTitle() {
		return title;
	}
	public String getAuthor() {
		return author;
	}
	public int getDate() {
		return date;
	}
	public String getFile() {
		return file;
	}
	public byte[] getImage() {
		return image;
	}
	public void setId(int n) {
		id = n;
	}
	public void setTitle(String s) {
		title = s;
	}
	public void setAuthor(String s) {
		author = s;
	}
	public void setDate(int n) {
		date = n;
	}
	public void setFile(String s) {
		file = s;
	}
	public void setImage(byte[] b) {
		image = b;
	}
}

