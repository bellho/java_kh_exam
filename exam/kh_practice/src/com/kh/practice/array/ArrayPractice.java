package com.kh.practice.array;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ArrayPractice {
	public void practice1() {
		int[] arr = new int[10];
		for (int i = 0; i < 10; i++) {
			arr[i] = i + 1;
			System.out.println(arr[i]);
		}

	}

	public void practice2() {
		int[] arr = new int[10];
		for (int i = 0; i < 10; i++) {
			arr[i] = 10 - i;
			System.out.println(arr[i]);
		}
	}

	public void practice3() {
		Scanner sc = new Scanner(System.in);
		int Num = sc.nextInt();
		sc.nextLine();
		int[] arr = new int[Num];

		for (int i = 0; i < Num; i++) {
			arr[i] = i + 1;
			System.out.print(arr[i] + " ");
		}
	}

	public void practice4() {
		String[] str = new String[] { "사과", "귤", "포도", "복숭아", "참외" };

		System.out.println(str[1]);
	}

	public void practice5() {
		Scanner sc = new Scanner(System.in);
		System.out.print("문자열 : ");
		String str1 = sc.nextLine();
		System.out.print("문자 : ");
		String str2 = sc.nextLine();
		char cha = str2.charAt(0);
		int count = 0;

		System.out.print(str1 + "에 " + str2 + "가 존재하는 위치(인덱스) :");

		for (int i = 0; i < str1.length(); i++) {
			if (str1.charAt(i) == cha) {
				count++;
				System.out.print(" " + i);
			}
		}
		System.out.println();
		System.out.print(str2 + " 개수 : " + count);
	}

	public void practice6() {
		Scanner sc = new Scanner(System.in);
		String[] week = new String[] { "월", "화", "수", "목", "금", "토", "일" };
		System.out.print("0 ~ 6 사이 숫자 입력 : ");
		int num = sc.nextInt();
		if (num > -1 && num < 7) {
			System.out.println(week[num]);
		} else {
			System.out.println("잘못 입력하셨습니다.");
		}

	}

	public void practice7() {
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 : ");
		int num = sc.nextInt();
		sc.nextLine();
		int[] arr = new int[num];
		int sum = 0;

		for (int i = 0; i < arr.length; i++) {
			System.out.print("배열 " + i + "번쩨 인덱스에 넣을 값 : ");
			int num1 = sc.nextInt();
			arr[i] = num1;
		}
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.print("\n총 합 : ");
		for (int i : arr) {
			sum += i;
		}
		System.out.println(sum);
	}

	public void practice8() {
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 : ");
		int num = sc.nextInt();
		if (!(num > 2 && num % 2 == 1)) {
			System.out.println("다시 입력하세요.");
			System.out.print("정수 : ");

		}
	}

	public void practice16() {
		Scanner sc = new Scanner(System.in);
		ArrayList<String> list = new ArrayList();
		int count = 1;
		char agrry = 'n';

		while (true) {
			System.out.print("배열의 크기를 입력하세요 : ");
			int num = sc.nextInt();
			sc.nextLine();
			for (int i = 0; i < num; i++) {
				System.out.print(count + "번째 문자열 : ");
				String str = sc.nextLine();
				list.add(str);
				count++;
			}
			System.out.print("더 값을 입력하시겠습니까?(Y/N) : ");
			String str = sc.nextLine();
			if (agrry == str.charAt(0)) {
				System.out.println(list);
				break;
			}
		}
	}
}
