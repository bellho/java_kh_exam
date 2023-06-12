package com.kh.practice.file.view;

import java.util.Scanner;

import com.kh.practice.file.controller.FileController;

public class FileMenu {
	private Scanner sc = new Scanner(System.in);
	private FileController fc = new FileController();

	public void mainMenu() {
		System.out.println("***** My Note *****");
		System.out.println("1. 노트 새로 만들기");
		System.out.println("2. 노트 열기");
		System.out.println("3. 노트 열어서 수정하기");
		System.out.println("9. 끝내기");
		int num = 0;
		while (true) {
			System.out.print("메뉴 번호 : ");
			num = sc.nextInt();
			sc.nextLine();

			switch (num) {
			case 1:
				fileSave();
				break;
			case 2:
				fileOpen();
				break;
			case 3:
				fileEdit();
				break;
			case 9:
				System.out.println("프로그램을 종료합니다.");
				break;
			default:
				System.out.println("잘못 입력하셨습니다. 다시 입력해주세요.");
				continue;
			}
			break;
		}

	}

	public void fileSave() {
		StringBuilder sb = new StringBuilder();
		String filePath = null;
		while (true) {
			System.out.println("파일에 저장할 내용을 입력하세요.");
			System.out.println("ex끝it 이라고 입력하면 종료됩니다.");
			String str = sc.nextLine();
			if (!str.equals("ex끝it")) {
				sb.append(str);
			} else {
				break;
			}
		}
		while (true) {
			System.out.println("저장할 파일 명을 입력해주세요");
			filePath = sc.nextLine();
			if (fc.checkName(filePath)/* true */) {
				System.out.println("이미 존재하는 파일입니다. 덮어쓰시겠습니까?(y/n)");
				char chavalue = sc.nextLine().charAt(0);
				if (chavalue == 'y') {
					fc.fileSave(filePath, sb);
					break;
				} else {
					continue;
				}
			} else {
				fc.fileSave(filePath, sb);
				break;
			}
		}
		mainMenu();
	}

	public void fileOpen() {
		System.out.print("열 파일 명 : ");
		String str = sc.nextLine();
		if (fc.checkName(str)/* true */) {
			System.out.println(fc.fileOpen(str));
		} else {
			System.out.println("없는 파일입니다.");
		}
		mainMenu();
	}

	public void fileEdit() {
		StringBuilder sb = new StringBuilder();
		System.out.print("수정할 파일 명 : ");
		String str = sc.nextLine();
		if (fc.checkName(str)/* true */) {
			while (true) {
				System.out.println("파일에 저장할 내용을 입력하세요.");
				System.out.println("ex끝it 이라고 입력하면 종료됩니다.");
				String str1 = sc.nextLine();
				if (!str.equals("ex끝it")) {
					sb.append(str1);
					
				} else {
					break;
				}
			}
			fc.fileEdit(str,sb);
		} else {
			System.out.println("없는 파일입니다.");
		}
		mainMenu();
	}
}
