package com.kh.practice.score.view;

import java.io.DataInputStream;
import java.io.EOFException;
import java.io.IOException;
import java.util.Scanner;

import com.kh.practice.score.controller.ScoreController;

public class ScoreMenu {
	private Scanner sc = new Scanner(System.in);
	private ScoreController scr = new ScoreController();

	public void mainMenu() {
		System.out.print("1. 성적 저장");
		System.out.print("2. 성적 출력");
		System.out.print("9. 끝내기");
		while (true) {
			int num = sc.nextInt();
			sc.nextLine();
			switch (num) {
			case 1:
				saveScore();
				break;
			case 2:
				readScore();
				break;
			case 9:
				System.out.println("프로그램을 종료합니다.");
				break;
			default:
				System.out.println("잘못 입력하셨습니다. 다시 입력해주세요.");
				continue;
			}
		}
	}

	public void saveScore() {
		int num = 0;
		while (true) {
			System.out.println((num + 1) + "번 째의 학생 정보");
			System.out.print("이름 : ");
			String name = sc.nextLine();
			System.out.print("국어 점수 : ");
			int ks = sc.nextInt();
			sc.nextLine();
			System.out.print("영어 점수 : ");
			int es = sc.nextInt();
			sc.nextLine();
			System.out.print("수학 점수 : ");
			int ms = sc.nextInt();
			sc.nextLine();
			int avg = (ks + es + ms) / 3;
			scr.saveScore(name, ks, es, ms, avg);
			num++;
			System.out.println("그만 입력하시려면 N 또는 n 입력, 계속 하시려면 아무 키나 입력하세요 : ");
			char value = sc.nextLine().toUpperCase().charAt(0);
			if (!(value == 'N')) {
				continue;
			} else {
				break;
			}
		}
		mainMenu();
	}

	public void readScore() {
		int count = 0;
		int sumAll = 0;
		double avgAll = 0.0;
		
		try {
			DataInputStream dis = new DataInputStream(scr.readScore());
			System.out.println("이름\t국어\t영어\t수학\t총점\t평균");
			count = 0;
			while(true) {
					try {
						String str = dis.readUTF();
						System.out.print(str);
						System.out.println("\t");
						int[] score = new int[4];
						for(int i = 0; i < 4; i++) {
							score[i] = dis.readInt();
							System.out.print(score[i]);
							System.out.println("\t");
							if(i == 3) {
								sumAll += score[i];
								}
							}
							double avg = dis.readDouble();
							System.out.print(avg);
							System.out.println();
							avgAll += avg;
							count++;
						} catch (EOFException e) {
							break;
						}
					}
					if(dis != null) dis.close();
					avgAll /= count;
					System.out.println("=================");
					System.out.println("읽은 횟수\t전체 합계\t전체 평균");
				}catch(IOException e ) {
					e.printStackTrace();
				}
		
			}
	}
