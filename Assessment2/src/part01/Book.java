package part01;

public class Book {
	private int id;				
	private String isbn;		
	private String title;		
	private String author;		
	private boolean available;	
	
	public Book(int id, String isbn, String title, String author) {
		this.id = id;
		this.isbn = isbn;
		this.title = title;
		this.author = author;
		this.available = true;
	}
	
	public int getId() {
		return id;
	}
	
	public String getIsbn() {
		return isbn;
	}
	
	public String getTitle() {
		return title;
	}
	
	public String getAuthor() {
		return author;
	}
	
	public String toString() {
		String res = "";
		res += "ID:"+id+" ISBN:"+isbn+" Title:"+title+" Author:"+author;
		return res;
	}
	
	public boolean isAvailable() {
		return available;
	}
	
	public void setAvailable(boolean status) {
		available = status;
	}
}
