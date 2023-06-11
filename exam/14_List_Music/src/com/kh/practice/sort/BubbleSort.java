package com.kh.practice.sort;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class BubbleSort {
	public static void main(String[] args) {
		int a = 10;
		int b = 10;
		// SWAP
		// a 방에 b 값으로 바꾸고, b 방에 a값으로 바꾸기
		int temp = a;
		a = b;
		b = temp;

		System.out.println(a); // 20
		System.out.println(b); // 10

		// 버블정렬
		int[] arr = new int[] { 3, 2, 5, 1, 6, 8 };
		//System.out.println(Arrays.toString(arr));
		// 배열 ==> List
		System.out.println(Arrays.toString(arr));
		System.out.print("[");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(i);
			for(int j = 0; j < arr.length - 1; j++) {
				System.out.print(",");
			}
		}
//		System.out.println("]");
//		for (int i = 0; i < arr.length - 1; i++) {
//			for (int j = 0; j < arr.length - (i + 1); j++) {
//				if (arr[j] < arr[j + 1]) { // 오름차순
//					// if(arr[j] > arr[j + 1]){ 내림차순
//					// SWAP
//					int tmp = arr[j];
//					arr[j] = arr[j + 1];
//					arr[j + 1] = tmp;
//				}
//			}
//		}
//		for (int i : arr) {
//			System.out.print(i);
//		}
//		//String 타입으로 버블정렬
//		String [] nameArr = new String[] {"손범규","천영준","유청하","김민성"};
//		
//		for(int i = 0; i < nameArr.length - 1; i++) {
//			for(int j = 0; j < nameArr.length - (i + 1); j++) {
//				if(nameArr[j].compareTo(nameArr[j + 1]) > 0) {
//					String tmp = nameArr[j];
//					nameArr[j] = nameArr[j + 1];
//					nameArr[j + 1] = tmp;
//				}
//			}
//		}
//		System.out.print("[");
//		for (String starr : nameArr) {
//			System.out.print(starr);
//			System.out.print(",");
//		}
//		System.out.print("]");
//	}
	
	}
}