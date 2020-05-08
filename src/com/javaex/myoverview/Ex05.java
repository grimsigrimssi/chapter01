package com.javaex.myoverview;

import java.util.Scanner;

public class Ex05 {

	public static void main(String[] args) {

		int point;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("점수를 입력하세요");
		System.out.print("점수:");
		
		point = sc.nextInt();
		
		
		if(point%3==0) {
			System.out.println(point + "은(는) 3의 배수입니다.");
		}else {
			System.out.println(point + "은(는) 3의 배수가 아닙니다.");
		}
		
		sc.close();
		
	}

}
