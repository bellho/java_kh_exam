package com.kh.hw.shape.view;

import java.util.Scanner;

import com.kh.hw.shape.controller.SquareController;
import com.kh.hw.shape.controller.TriangleController;

public class ShapeMenu {

	// Field
	private Scanner sc = new Scanner(System.in);
	private SquareController scr = new SquareController();
	private TriangleController tc = new TriangleController();

	private static String Line = "=====";
	private static String title = "도형 프로그램";
	private static String triang = "삼각형";
	private static String square = "사각형";
	private static String endTitel = "프로그램 종료";
	private static String shutDownInfo = "프로그램을 종료합니다.";
	private static String menuNum = "메뉴 번호 : ";
	private static String error = "잘못된 번호입니다. 다시 입력하세요.";
	private static String area = "면적";
	private static String perimeter = "둘레";
	private static String color = "색칠";
	private static String info = "정보";
	private static String toMain = "메인으로";
	private static String height = "높이";
	private static String width = "너비";

	// Constructor

	// Method

	// 삼각형과 사각형을 선택
	// 하게 하는 메소드

	// 멤버 변수
	// public void inputMenu() {
	// ===== 도형 프로그램 =====
	// 3. 삼각형 ==> triangleMenu()
	// 4. 사각형 ==> squareMenu()
	// 9. 프로그램 종료 => “프로그램 종료” 출력 후 프로그램 종료
	// 메뉴 번호 :
	// 잘못 입력했을 시 “잘못된 번호입니다. 다시 입력해주세요.” 출력 후 반복
	public void imputMenu() {

		System.out.print(Line + " " + title + " " + Line + "\n3. " + triang + "\n4. " + square + "\n9. " + endTitel
				+ "\n" + menuNum); // 메뉴 창
		while (true) {
			String sNum = sc.nextLine();
			int iNum = Integer.parseInt(sNum);

			switch (iNum) {
				case 3:
					triangleMenu();
					break;
				case 4:
					squareMenu();
					break;
				case 9:
					System.out.println(shutDownInfo);
					break;
				default:
					System.out.println(error);
					continue;
			}
			break;
		}
	}
	
	// ===== 삼각형 =====
	// 1. 삼각형 면적 ==> inputSize()
	// 2. 삼각형 색칠 ==> inputSize()
	// 3. 삼각형 정보 ==> printInformation()
	// 9. 메인으로 ==> “메인으로 돌아갑니다.” 출력 후 inputMenu()로
	// 메뉴 번호 :
	// 잘못 입력했을 시 “잘못된 번호입니다. 다시 입력해주세요.” 출력 후 반복
	public void triangleMenu() {
		System.out.print(Line + " " + triang + " " + Line + "\n1. " + triang + " " + area + "\n2. " + triang + " " + color + "\n3. " + triang + " "
				+ info + "\n9. " + toMain + "\n" + menuNum);
		while (true) {
			String sNum = sc.nextLine();
			int iNum = Integer.parseInt(sNum);

			switch (iNum) {
				case 1:
					inputSize(3,1);
					break;
				case 2:
					inputSize(3,2);
					break;
				case 3:
					printlnformation(3);
					System.out.print(Line + " " + triang + " " + Line + "\n1. " + triang + " " + area + "\n2. " + triang + " " + color + "\n3. " + triang + " "
							+ info + "\n9. " + toMain + "\n" + menuNum);
					continue;
				case 9:
					System.out.println("메인으로 돌아갑니다.");
					imputMenu();
					break;
				default:
					System.out.println(error);
					continue;
			}
			break;
		}
	}
	
	// ===== 사각형 =====
	// 1. 사각형 둘레 ==> inputSize()
	// 2. 사각형 면적 ==> inputSize()
	// 3. 사각형 색칠 ==> inputSize()
	// 4. 사각형 정보 ==> printInformation()
	// 9. 메인으로 ==> “메인으로 돌아갑니다.” 출력 후 inputMenu()로
	// 메뉴 번호 :
	// 잘못 입력했을 시 “잘못된 번호입니다. 다시 입력해주세요.” 출력 후 반복
	public void squareMenu() {
		System.out.print(Line + " " + square + " " + Line + "\n1. " + square + " " + perimeter + "\n2. " + square + " "
				+ area + "\n3. " + square + " "+ color + "\n4. " + square + " " + info + "\n9. " + toMain + "\n" + menuNum);
		while (true) {
			String sNum = sc.nextLine();
			int iNum = Integer.parseInt(sNum);

			switch (iNum) {
				case 1:
					inputSize(4,1);
					break;
				case 2:
					inputSize(4,2);
					break;
				case 3:
					inputSize(4,3);
					break;
				case 4:
					printlnformation(4);
					System.out.print(Line + " " + square + " " + Line + "\n1. " + square + " " + perimeter + "\n2. " + square + " "
							+ area + "\n3. " + square + " "+ color + "\n4. " + square + " " + info + "\n9. " + toMain + "\n" + menuNum);
					continue;
				case 9:
					System.out.println("메인으로 돌아갑니다.");
					imputMenu();
					break;
				default:
					System.out.println(error);
					continue;
			}
			break;
		}
	}

	public void inputSize(int type, int menuNum) {
		if(type == 3) {
			if(menuNum == 1) {
				// 높이 :
				// 너비 :
				// 삼각형 면적 : ==> tc(TriangleController)의 calcArea() 출력
				System.out.print(height + " : ");
				String sHeight = sc.nextLine();
				int iHeight = Integer.parseInt(sHeight);
				
				System.out.print(width + " : ");
				String sWidth = sc.nextLine();
				int iWidth = Integer.parseInt(sWidth);
				System.out.println("삼각형 면적 : " + tc.calcArea(iHeight, iWidth));
			} else {
				// 색깔을 입력하세요 :
				// tc의 paintColor() 호출 후 “색이 수정되었습니다” 출력
				System.out.print("색깔을 입력하세요 : ");
				String sColor = sc.nextLine();
				tc.paintColor(sColor);
				System.out.println("색이 수정되었습니다");
			}
			triangleMenu();
		} else {
			if((menuNum == 1) || (menuNum == 2)) {
				// 높이 :
				// 너비 :
				System.out.print(height + " : ");
				String sHeight = sc.nextLine();
				int iHeight = Integer.parseInt(sHeight);
				System.out.print(width + " : ");
				String sWidth = sc.nextLine();
				int iWidth = Integer.parseInt(sWidth);
				if(menuNum == 1) {
					// menuNum이 1번일 경우
					// 사각형 둘레 : ==> scr(SquareController)의 calcPerimeter() 출력
					System.out.println("사각형 둘레 : " + scr.calcPerimeter(iHeight, iWidth));
				} else {
					// menuNum이 2번일 경우
					// 사각형 면적 : ==> scr의 calcArea() 출력
					System.out.println("사각형 면적 : " + scr.calcArae(iHeight, iWidth));
				}
			} else {
				// int type이 ‘사각형’이면서 menuNum이 3번일 경우
				// 색깔을 입력하세요 :
				// scr의 paintColor() 호출 후 “색이 수정되었습니다” 출력
				System.out.print("색깔을 입력하세요 : ");
				String sColor = sc.nextLine();
				scr.paintColor(sColor);
				System.out.println("색이 수정되었습니다");
			}
			squareMenu();
		}
	}

	public void printlnformation(int type) {
		if(type == 3) {
			// int type이 ‘삼각형’일 경우 tc.print() 출력
			System.out.println(tc.print());
		} else {
			// int type이 ‘사각형’일 경우 scr.print() 출력
			System.out.println(scr.print());
		}
	}

}
