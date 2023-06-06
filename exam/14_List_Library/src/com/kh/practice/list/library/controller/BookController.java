package com.kh.practice.list.library.controller;

import java.util.*;

import com.kh.practice.list.library.model.vo.Book;

public class BookController {
	//Field
	private List<Book> list = new ArrayList<Book>();
	
	//Constructor
	public BookController() {
		list.add(new Book("자바의 정석", "남궁 성", "기타", 20000));
		list.add(new Book("쉽게 배우는 알고리즘", "문병로", "기타", 15000));
		list.add(new Book("대화의 기술", "강보람", "인문", 17500));
		list.add(new Book("암 정복기", "박신우", "의료", 21000));
	}
	
	//Method
	public void inserBook(Book bk) {
		list.add(bk);
	}
	public ArrayList<Book> selectList() {
		ArrayList<Book> result = new ArrayList<Book>();
		list.addAll(result);
		
		return result;
	}
	public ArrayList<Book> searchBook(String keyword) {
		ArrayList<Book> searchList = new ArrayList<Book>();
		for(int i = 0; i < list.size(); i++) {
			if(list.get(i).toString().indexOf(keyword) > 0) {
				searchList.add(list.get(i));
			}
		}
		return searchList;
	}
	public Book deleteBook(String title, String author) {
		Book removeBook = null;
		for(int i = 0; i < list.size(); i++) {
			if(list.get(i).getTitle().equals(title) && list.get(i).getAurhor().equals(author)) {
			 	removeBook = list.get(i);
			 	list.remove(i);
			}
		}
		return removeBook;
	}
	public int ascBook() {
		Collections.sort(list);
		return 1;
	}
}
