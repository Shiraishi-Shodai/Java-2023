package Beans;

public class Products {
	
	private String name;
	private int price;
	private int volume;
	private int totalPrace;
	
	
	public Products(String name,int price) {
		this.name = name;
		this.price = price;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public int getVolume() {
		return volume;
	}
	public void setVolume(int volume) {
		this.volume = volume;
	}
	public int getTotalPrace() {
		return totalPrace;
	}
	public void setTotalPrace(int totalPrace) {
		this.totalPrace = totalPrace;
	}
	
	
}
