package Day03;

import java.util.Scanner;

public class Day03_6 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		// ����1. �Է¹��� �� ��ŭ * ���
//		System.out.println("�� ���� : ");
//		int s1 = sc.nextInt();
//		for(int i=1; i<=s1; i++) {
//			// *i�� 1���� �Է¹��� �� ���� i�� 1�� ����
//			System.out.println("*");
//		}

		// ����2. �Է¹��� �� ��ŭ * ���[ �� 5�� ���� �ٹٲ� ó�� ]
		System.out.print("�� �� : ");
		int s1 = sc.nextInt();

//		for(int i=1; i<=s1; i++){
//			System.out.print("*");
//			//5�� ���� �ٹٲ� -> 5������� -> ��� ã��
//			if(i%5 == 0) 
//				System.out.println();
//		}

		// ���� 3
//
//		for (int i = 1; i <= s1; i++) {
//			System.out.println();
//			for (int j = 1; j <= i; j++) {
//				System.out.print("*");
//			}
//
//		}

		// ���� 4

//		for (int i = 1; i <= s1; i++) {
//			System.out.println();
//			for(int j = s1; j>=i; j--) {
//				System.out.print("*");
//			}
//		}

//		for (int i = 1; i <= s1; i++) {
//		System.out.println();
//		for (int j = 1; j <= s1-i+1; j++) {
//			System.out.print("*");
//		}
//
//	}
//		

//		// ���� 5
//		for (int i = 1; i <= s1; i++) {
//		
//			for (int j = 1; j <= s1-i; j++) {
//				System.out.print(" ");
//				}
//			for (int k = 1; k <= i; k++) {
//				System.out.print("*");
//			}
//			System.out.println();
//		}
//		

		// ���� 6

//		for (int i = 1; i <= s1; i++) {
//			
//				for (int j = 1; j < i; j++) {
//					System.out.print(" ");
//					}
//				for (int k = 1; k <= s1-i+1; k++) {
//					System.out.print("*");
//				}
//				System.out.println();
//			}
//		

		// ���� 7

//		for(int i=1; i<=s1; i++) {
//			
//			for(int j=1; j<=s1-i; j++) {
//				System.out.print(" ");
//			}
//			for(int k=1; k<=i*2-1; k++) {
//				System.out.print("*");
//			}
//			System.out.println();
//		}

		// ���� 8

//		for (int i = 1; i <= s1; i++) {
//
//			for (int j = 1; j <= s1 - i; j++) {
//				System.out.print(" ");
//			}
//			for (int k = 1; k <= i * 2 - 1; k++) {
//				System.out.print(i);
//			}
//			System.out.println();
//		}

		// ���� 7

		for(int i=1; i<=s1; i++) {
			
			for(int j=1; j<=s1-1; j++) {
				System.out.print(" ");
			}
			for(int k=1; k<=i*2-1; k++) {
				System.out.print("*");
			}
			System.out.println();
		}

		
		
		
	}

}