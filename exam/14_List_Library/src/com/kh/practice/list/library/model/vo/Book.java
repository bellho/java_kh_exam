package com.kh.practice.list.library.model.vo;

public class Book implements Comparable<Book> {
	
	//Field
	private String title;
	private String author;
	private String category;
	private int price;
	
	//Constructor
	public Book() {}
	public Book(String title, String author, String category, int price) {
		this.title = title;
		this.author = author;
		this.category = category;
		this.price = price;
	}
	
	//Method
	public int hashCode(Book bk) {
		int result = bk.hashCode();
		return result;
	}
	
	public boolean equals(Book bk) {
		Book book = new Book();
		boolean result = true;
		if(book != bk) {
			result = false;
		}
		return result;
	}
	@Override
	public int compareTo(Book o){
		if(this.title.compareTo(((Book)o).title) > 0) {
			return 1;
		} else if(this.title.compareTo(((Book)o).title) < 0) {
			return -1;
		}
		return 0;
	}
	
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getAurhor() {
		return author;
	}
	public void setAurhor(String author) {
		this.author = author;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "(" + title + "/" + author + "/" + category + "/" + price + ")";
	}
	
	
	
	
}
