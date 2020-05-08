package com.javaex.ex01;

import java.util.Scanner;

public class Ex09 {

	public static void main(String[] args) {

		int code;	
		Scanner sc = new Scanner(System.in);
		
		System.out.println("과목을 선택하세요");
		System.out.println("(1.자바  2.C  3.C++  4.파이썬)");
		System.out.print("과목:");
		code = sc.nextInt();
			
		switch(code) {
		
			case 1: 
				System.out.println("R101호");
				break; 
				
			case 2:
				System.out.println("R202호");
				break;
			
			case 3:
				System.out.println("R303호");
				break;
			
			case 4: 
				System.out.println("R404호");
				break;
			
			default:
				System.out.println("상담원");
				break;
			
		}
			
		sc.close();
	}

}
