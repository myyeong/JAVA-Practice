package com.minyeong.java.study;

import java.util.Scanner;

public class Star {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// �� �� �Է¹��� ���� ����
		// �� �� �Է�
		// �Է¹���  �� ��ŭ �� ���(for �Ǵ� while �̿�)
		
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
