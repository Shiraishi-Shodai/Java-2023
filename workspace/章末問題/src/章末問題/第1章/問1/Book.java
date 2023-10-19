package 章末問題.第1章.問1;

import java.sql.Date;
import java.util.Objects;

public class Book implements Comparable<Book>,Cloneable{
	private String title;
	private Date publishDate;
	private String comment;

	public Book(String title,Date publicDate,String comment) {
		this.title = title;
		this.publishDate = publicDate;
		this.comment = comment;
	}
	
	public Book(){	
		
	}
	public boolean equals(Object o) {
		if(o==this) {
			return true;
		}
		if(o==null) {
			return false;
		}
		if(!(o instanceof Book)) {
			return false;
		}
		Book b = (Book)o;
		if(!(b.title.equals(this.title)&&b.publishDate==this.publishDate)) {
			return false;
		}
		return true;
	}
	
	public int hashCode() {
		//基本的にはすべてのフィールドをハッシュ化する
		return Objects.hash(this.title,this.publishDate,this.comment);
	}
	
	public int compareTo(Book obj) {
		return this.publishDate.compareTo(obj.publishDate);
	}
	
	public Book clone() {
		Book b = new Book();
		b.title = this.title;
		//深いコピーではそのインスタンスが参照しているインスタンスも含めて複製する
		b.publishDate = (Date)this.publishDate.clone();
		b.comment = this.comment;
		return b;
	}
}
