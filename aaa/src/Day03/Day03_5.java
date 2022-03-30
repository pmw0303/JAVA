package Day03;

import java.util.Scanner;

public class Day03_5 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		// 반복문 : 1. for 2. while 3. do~while (x)
//		for :
//			어디서부터 어디까지 몇 개씩 증가/감소 하면서 반복처리
//			ex) 1부터 10까지 1씩 증가하면서 반복처리 -> 10번 실행
//			1. 초기값 2. 조건식 3. 증감식
//			for( 초기값 ; 조건식 ; 증감식 ) {
//				반복 실행문;
//			}

//		for (int i = 1; i <= 10; i++) {
////			int i = 1 : 초기값 선언 [i는 반복변수]
////			i <= 10 : 조건식 [ i가 10이하면 실행 아니면 실행불가]
////			i++ : 증감식 [ 실행문 실행 후 증가 혹은 감소 단위]
//			System.out.println(i + " ");
//			i = 1 일 때 i<=10 [true] 실행문  -> 증감식 i = 2
//			i = 2 일 때 i<=10 [true] 실행문  -> 증감식 i = 3
//			...
//			i = 10 일 때 i<=10 [true] 실행문 -> 즘감식 i = 10
//			i = 11 일 때 i<=11 [false] 반복문 종료

		// 1~100 누적 합
//		int sum = 0;
//		for (int i = 1; i <= 100; i++) {
//			sum += i;
//
//		}
//		System.out.println("결과 : " + sum);

		// 1부터 100까지 7배수의 합
//		int sum = 0;
//		for(int i = 0; i<=100; i+=7) {
//			sum += i;
//			
//		}
//		System.out.println("결과 : " + sum);
//		
//		
//		int sum = 0;
//		for(int i = 0; i<=100; i++) {
//			if(i%7 == 0) sum += i;
//			
//		}
//		System.out.println("결과 : " + sum);

		// 2단 구구단 만들기

		for (int i = 0; i <= 9; i++) {

			System.out.printf("2 * %d = %d\n", i, 2 * i);
		}

		
		// 2단~9단 구구단 만들기
//		단 : 2부터 9까지 1씩증가
//		곱 : 1부터 9까지 1씩 증가
//		단 : 1번 실행 될 때 마다 곱 9번 실행
		
		
		for(int i=2; i<=9; i++) {
			System.out.printf("%d단-------\n",i);
			for(int j=1; j<=9; j++)
			{
				System.out.printf("%d * %d = %d\n",i,j,i*j);
			}
		}
		
		
		
		
		
		
		
	}

}
