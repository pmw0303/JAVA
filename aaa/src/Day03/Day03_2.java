package Day03;

import java.util.Scanner;

public class Day03_2 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

//		System.out.println("정수 입력 : ");
//		int no1 = scanner.nextInt();
//		System.out.println("정수 입력 : ");
//		int no2 = scanner.nextInt();
//		
//
//		if (no1 > no2)
//			System.out.println("더 큰수 : " + no1);
//		else if (no1 > no2)
//			System.out.println("더 큰수 : " + no2);
//		else
//			System.out.println("같다");

//		System.out.println("정수 입력 : ");
//		int n1 = scanner.nextInt();
//		System.out.println("정수 입력 : ");
//		int n2 = scanner.nextInt();
//		System.out.println("정수 입력 : ");
//		int n3 = scanner.nextInt();
//
//		int max = n1;
//
//		if (max < n2) {
//			max = n2;
//		}
//		if (max < n3) {
//			max = n3;
//		}System.out.println("가장 큰 수 : " + max);

//		System.out.println("정수 입력 : ");
//		int n1 = scanner.nextInt();
//		System.out.println("정수 입력 : ");
//		int n2 = scanner.nextInt();
//		System.out.println("정수 입력 : ");
//		int n3 = scanner.nextInt();
//		System.out.println("정수 입력 : ");
//		int n4 = scanner.nextInt();
//		
//		int max = n1;
//		if(max < n2) {max = n2;}
//		if(max < n3) {max = n3;}
//		if(max < n4) {max = n4;}
//		System.out.println("가장 큰 수 : " + max);

		// 정수 3개 입력 받아 오름차순
//		System.out.println("정수 입력 :");
//		int n1 = scanner.nextInt();
//		System.out.println("정수 입력 :");
//		int n2 = scanner.nextInt();
//		System.out.println("정수 입력 :");
//		int n3 = scanner.nextInt();
//
//		if (n1 > n2) { // 교체 [ 스왑 = 두 변수에 데이터 교환 방법 ] 부등호 반대 -> 내림차순
//			int temp = n1;
//			n1 = n2;
//			n2 = temp;
//		}
//		if (n1 > n3) {
//			int temp = n1;
//			n1 = n3;
//			n2 = temp;
//		}
//		if (n2 > n3) {
//			int temp = n2;
//			n2 = n3;
//			n3 = temp;
//		}
//		System.out.printf(" 입력한 값 오름차순 : %d %d %d", n1,n2,n3);

		// 정수 4개 입력받아 오름차순 / 내림차순

		System.out.println("정수 입력 :");
		int n1 = scanner.nextInt();
		System.out.println("정수 입력 :");
		int n2 = scanner.nextInt();
		System.out.println("정수 입력 :");
		int n3 = scanner.nextInt();
		System.out.println("정수 입력 :");
		int n4 = scanner.nextInt();

		if (n1 > n2) { // 교체 [ 스왑 = 두 변수에 데이터 교환 방법 ] 부등호 반대 -> 내림차순
			int temp = n1;
			n1 = n2;
			n2 = temp;
		}
		if (n1 > n3) {
			int temp = n1;
			n1 = n3;
			n3 = temp;
		}
		if (n1 > n4) {
			int temp = n1;
			n1 = n4;
			n4 = temp;
		}
		if (n2 > n3) {
			int temp = n2;
			n2 = n3;
			n3 = temp;
		}
		if (n2 > n4) {
			int temp = n2;
			n2 = n4;
			n4 = temp;
		}
		if (n3 > n4) {
			int temp = n3;
			n3 = n4;
			n4 = temp;
		}

		System.out.printf(" 입력한 값 오름차순 : %d %d %d %d", n1, n2, n3, n4);

	}
}
