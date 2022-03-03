package Day03;

import java.util.Scanner;

public class Day03_6 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		// 문제1. 입력받은 수 만큼 * 출력
//		System.out.println("별 개수 : ");
//		int s1 = sc.nextInt();
//		for(int i=1; i<=s1; i++) {
//			// *i는 1부터 입력받은 수 까지 i는 1씩 증가
//			System.out.println("*");
//		}

		// 문제2. 입력받은 수 만큼 * 출력[ 단 5개 마다 줄바꿈 처리 ]
		System.out.print("줄 수 : ");
		int s1 = sc.nextInt();

//		for(int i=1; i<=s1; i++){
//			System.out.print("*");
//			//5개 마다 줄바꿈 -> 5배수마다 -> 배수 찾기
//			if(i%5 == 0) 
//				System.out.println();
//		}

		// 문제 3
//
//		for (int i = 1; i <= s1; i++) {
//			System.out.println();
//			for (int j = 1; j <= i; j++) {
//				System.out.print("*");
//			}
//
//		}

		// 문제 4

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

//		// 문제 5
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

		// 문제 6

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

		// 문제 7

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

		// 문제 8

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

		// 문제 7

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