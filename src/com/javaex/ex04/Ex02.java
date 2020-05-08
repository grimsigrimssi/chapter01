package com.javaex.ex04;

import java.util.Scanner;

public class Ex02 {
	
	public static void main(String[] args) {
	
		int dan;
		int i = 1;
		
		Scanner sc = new Scanner(System.in); 
		System.out.println("단을 입력하세요");
		System.out.print("단: ");
		dan = sc.nextInt();
		
		
		while(i<10) {
			
			System.out.println(dan + "*" + i + "=" + dan*i);
			
			i++;
		}
		
		sc.close();
	}
}
