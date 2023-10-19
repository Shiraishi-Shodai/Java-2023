package 第1章.章末問題;

import java.util.Date;
import java.util.Objects;

public class Book implements Comparable<Book>,Cloneable{
	private String title;
	private Date publishDate;
	private String comment;
	
	public Book(String title,java.util.Date d,String comment) {
		this.title = title;
		this.publishDate = d;
		this.comment = comment;
	}
	public Book() {
		
	}
	public boolean equals(Object o) {
		if(this == o) {
			return true;
		}
		if(o == null) {
			return false;
		}
		if(!(o instanceof Book)) {
			return false;
		}
		Book b = (Book)o;
		if(!this.title.equals(b.title) || !this.publishDate.equals(b.publishDate)) {
			return false;
		}
			return true;
	}
	
	public int compareTo(Book b) {
		return this.publishDate.compareTo(b.publishDate);
	}
	
	public int hashCode() {
		return Objects.hash(this.title,this.publishDate,this.comment);
	}
	public Book clone() {
		Book result = new Book();
		result.title = this.title;
		result.publishDate = (Date)this.publishDate.clone();
		result.comment = this.comment;
		return result;
	}
	
	public String getTitle() {
		return this.title;
	}
}
