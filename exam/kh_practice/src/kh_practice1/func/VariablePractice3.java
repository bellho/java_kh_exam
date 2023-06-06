package kh_practice1.func;

import java.util.Scanner;

public class VariablePractice3 {
	public void method1() {
		Scanner sc = new Scanner(System.in);
		System.out.print("가로 : ");
		double value1 = sc.nextDouble();
		System.out.print("세로 : ");
		double value2 = sc.nextDouble();
		
		System.out.println("면적 : " + value1 * value2);
		System.out.println("둘레 : " + ((value1 + value2) * 2));
	}
	
}
