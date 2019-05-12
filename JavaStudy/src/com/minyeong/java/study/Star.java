package com.minyeong.java.study;

import java.util.Scanner;

public class Star {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 줄 수 입력받을 변수 선언
		// 줄 수 입력
		// 입력받은  수 만큼 별 출력(for 또는 while 이용)
		
		Scanner scan = new Scanner(System.in);
		
		int line = scan.nextInt();
		
		for(int i=0;i<line;i++)
		{
			for(int j = 0; j <line ; j++)
				System.out.print("*");
			System.out.println();
		}
		
		

	}

}
