package com.minyeong.java.study;

import java.util.Scanner;

public class Test1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String name;
		int kor,eng,mat,sum;
		double avg;
		
		Scanner scan = new Scanner(System.in);
		System.out.print("Input name : ");
		
		name = scan.next();
		System.out.print("kor : ");
		kor = scan.nextInt();
		
		System.out.print("eng : ");
		eng = scan.nextInt();
		System.out.print("mat : ");
		mat = scan.nextInt();
		
		sum = kor+eng+mat;
		avg=sum/3;
		
		System.out.println("name : "+name);
		System.out.println("sum : "+sum);
		System.out.println("avg : "+avg);
		
	}

}
