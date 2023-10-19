package 演習問題;

public class Product {
	int no;
	String name;
	int price;
	
	public Product(int v_no,String v_name,int v_price) {
		this.no = v_no;
		this.name = v_name;
		this.price = v_price;
	}
	
	public void setValue(int p_no,String p_name,int p_price) {
		this.no = p_no;
		this.name = p_name;
		this.price = p_price;
	}
	
	public int getNo() {
		return this.no;
	}
	public String getName() {
		return this.name;
	}
	public int getPrice() {
		return this.price;
	}
}
