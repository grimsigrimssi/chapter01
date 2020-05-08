package com.javaex.myoverview;

import java.util.Scanner;

public class Ex04_2 {

	public static void main(String[] args) {

		int time;
		float pay;
		Scanner sc = new Scanner(System.in);
		
		System.out.print("근무시간:");
		time = sc.nextInt();
		
		if(time>8) {
			pay = 8*10000 + (time-8)*10000*1.5F;
		}else {
			pay = time*10000;
		}
		
		System.out.println("임금은 " + (int)pay + " 입니다.");
		
		sc.close();
	}

}
