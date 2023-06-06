package com.kh.practice.list.library.view;

import java.util.ArrayList;
import java.util.Scanner;

import com.kh.practice.list.library.controller.BookController;
import com.kh.practice.list.library.model.vo.Book;

public class BookMenu {
	private Scanner sc = new Scanner(System.in);
	private BookController bc = new BookController();

	public void mainMenu() {
		System.out.println("== Welcome KH Library ==");
		while (true) {
			System.out.print(
					"******* 메인 메뉴 *******\n1. 새 도서 추가/n2. 도서 전체 조회\n3. 도서 검색 조회\n4. 도서 삭제\n5. 도서 명 오름차순 정렬\n9. 종료\n메뉴 번호 선택 :");
			int num = sc.nextInt();
			sc.nextLine();
			switch (num) {
			case 1:
				insertBook();
				break;
			case 2:
				selectList();
				break;
			case 3:
				searchBook();
				break;
			case 4:
				deleteBook();
				break;
			case 5:
				ascBook();
				break;
			case 9:
				System.out.println("프로그램을 종료합니다.");
				break;
			default:
				System.out.println("잘못 입력하였습니다. 다시 입력해주세요");
				continue;
			}
			break;

		}

	}

	public void insertBook() {
		System.out.println("===== 새 도서 추가 =====\n책 정보를 입력해주세요.\n도서 명 : ");
		String title = sc.nextLine();
		System.out.print("저자 명 : ");
		String author = sc.nextLine();
		System.out.print("장르(1. 인문 / 2. 과학 / 3. 외국어 / 4. 기타) : ");
		int category = sc.nextInt();
		String category1 = null;
		switch (category) {
		case 1:
			category1 = "인문";
		case 2:
			category1 = "과학";
		case 3:
			category1 = "외국어";
		default:
			category1 = "기타";
		}
		System.out.println("가격 : ");
		int price = sc.nextInt();
		bc.inserBook(new Book(title, author, category1, price));
	}

	public void selectList() {
		ArrayList<Book> bookList = bc.selectList();
		if (bookList == null) {
			System.out.println("존재하는 도서가 없습니다.");
		} else {
			for (Book book : bookList) {
				System.out.println(book);
			}
		}
	}

	public void searchBook() {
		System.out.println("검색할 도서명 : ");
		String keyword = sc.nextLine();
		ArrayList<Book> bookList = bc.searchBook(keyword);
		if (bookList == null) {
			System.out.println("검색 결과가 없습니다.");
		} else {
			System.out.println("검색 결과");
			for (Book searchBook : bookList) {
				System.out.println(searchBook);
			}
		}
	}

	public void deleteBook() {
		System.out.println("삭제할 도서명 : ");
		String title = sc.nextLine();
		System.out.println("삭제할 저자명 : ");
		String author = sc.nextLine();
		Book remove = bc.deleteBook(title, author);
		if(remove == null) {
			System.out.println("삭제할 도서를 찾지 못했습니다.");
		} else {
			System.err.println("성공적으로 삭제되었습니다.");
		}
		
	}

	public void ascBook() {
		bc.ascBook();
	}
}
