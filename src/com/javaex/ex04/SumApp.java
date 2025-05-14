package com.javaex.ex04;

import java.util.Scanner;

public class SumApp {

	public static void main(String[] args) {
		
		int sum = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("숫자를 공백으로 구분해서 입력하세요");
		String numLine = sc.nextLine();
		
	
			
		//코드를 작성하세요
		
		System.out.println(numLine);
		
		while(true) {
			int num = Integer.parseInt(num);
			num = sc.nextInt(); //숫자입력받음
			sum = sum + num; //누적
			
			
			if(num==0) {//0이면 끝
				break; //반복문 끝
			}
			
		}System.out.println("합: "+ sum);	
		
		sc.close();
	}

}
