package com.javaex.myoverview;

import java.util.Scanner;

public class Ex01 {

	public static void main(String[] args) {
		
		int point;
		Scanner sc = new Scanner(System.in);
		System.out.print("점수:");
		point = sc.nextInt();
		
		if(point>=60) {
			System.out.println("합격입니다.");
		}
				
		sc.close();
	}

}
