package ex;

import java.io.Serializable;

public class SiteEV implements Serializable{
	
	private int good = 0;
	private int bad = 0;
	
	public SiteEV() {
		
	}
	
	public void setGood(int good) {
		this.good = good;
	}
	
	public int getGood() {
		return this.good;
	}
	
	public void setBad(int bad) {
		this.bad = bad;
	}
	
	public int getBad() {
		return this.bad;
	}
}
