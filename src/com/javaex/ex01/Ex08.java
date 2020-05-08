package com.javaex.ex01;

import java.util.Scanner;

public class Ex08 {

	public static void main(String[] args) {

		int code;	
		Scanner sc = new Scanner(System.in);
			
		System.out.println("과목을 선택하세요.");
		System.out.println("(1.자바  2.C  3.C++  4.파이썬)");
		System.out.print("과목:");
		code = sc.nextInt();
		
		if(code==1) {
			System.out.println("R101호");
		}else if(code==2) {
			System.out.println("R202호");
		}else if(code==3) {
			System.out.println("R303호");
		}else if(code==4) {
			System.out.println("R404호");
		}else {
			System.out.println("상담원");
		}
		
		sc.close();
			
	}

}
