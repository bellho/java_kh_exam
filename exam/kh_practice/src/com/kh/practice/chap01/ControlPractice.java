package com.kh.practice.chap01;

import java.util.Scanner;

public class ControlPractice {

	public void practice11() {

		Scanner sc = new Scanner(System.in);
		System.out.print("정수 입력 : ");
		int num = sc.nextInt();
		int count = num - 1; // 3
		int a = 1;

		for (int i = 0; i < num; i++) {
			for (int j = 0; j < count; j++) {
				System.out.print(" ");
			}
			count--;
			for (int j = 0; j < a; j++) { // 0 + x = 1, 1 + x = 3
				System.out.print("*");
			}
			a += 2;

			System.out.println();
		}

	}

}
