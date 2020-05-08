package com.javaex.ex04;

import java.util.Scanner;

public class Ex03 {

	public static void main(String[] args) {

		int dan;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("단을 입력하세요");
		System.out.println("단: ");
		dan = sc.nextInt();
		
		for(int i = 1 ; i<10 ; i++) {
			System.out.println(dan + "*" + i + "=" + dan*i);
		}
		
		sc.close();
		
	}

}
