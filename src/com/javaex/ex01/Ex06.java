package com.javaex.ex01;

import java.util.Scanner;

public class Ex06 {

	public static void main(String[] args) {

		
		Scanner sc = new Scanner(System.in);
		
		
		System.out.print("점수를 입력하세요:");
		int point = sc.nextInt();
		
		if(point >= 90) { //90이상일때
			System.out.println("A");
		}else if(point >= 80) { //80이상일때
			System.out.println("B");	
		}else if(point >= 70) { //70이상일때
			System.out.println("C");
		}else if(point >= 60) { //60이상일때
			System.out.println("D");
		}else {
			System.out.println("F");
		}
		
		sc.close();
		
	}
}