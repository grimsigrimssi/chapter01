package com.javaex.ex01;

import java.util.Scanner;

public class Ex05 {

	public static void main(String[] args) {
		
		int point;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("점수를 입력하세요.");
		point =sc.nextInt();
		
		//3의 배수냐?
		if(point%3==0) { //3의 배수면
			System.out.println("3의 배수입니다.");
		}else { //3의 배수가 아니면
			System.out.println("3의 배수가 아닙니다.");
		}
		
		
		sc.close();
	}

}
