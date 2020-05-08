package com.javaex.ex01;

import java.util.Scanner;

public class Ex07 {

	public static void main(String[] args) {
		
		int num;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("숫자를 입려하세요");
		System.out.print("숫자:");
		num = sc.nextInt();
		
		if(num>0) {
			if(num%2==0) {
				System.out.println("짝수");
			}else {
				System.out.println("홀수");
			}	
		}else if(num<0) {
			System.out.println("음수");
		}else {
			System.out.println("0");
		}
		
		sc.close();
	}

}
