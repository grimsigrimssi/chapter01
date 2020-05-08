package com.javaex.myoverview;

import java.util.Scanner;

public class Ex04 {

	public static void main(String[] args) {

		int time;
		int pay;
		Scanner sc = new Scanner(System.in);
		System.out.print("근무시간:");
		
		time = sc.nextInt();
		
		
		if(time > 8) {
			pay = 8*10000 + (time-8)*12000;	
		}
		else {
			pay = time*10000;			
		}
		
		System.out.println("임금은 " + pay + " 입니다.");
		
		sc.close();
		
	}

}
