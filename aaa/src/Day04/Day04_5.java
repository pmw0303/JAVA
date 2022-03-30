package Day04;

import java.util.Random;
import java.util.Scanner;

public class Day04_5 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		Random random = new Random();
		boolean pass = true;
		int[] unum = new int[6];
		int[] lotton = new int[6];

		// 1. 사용자에게 입력받기
		for (int i = 0; i < 6; i++) {
			System.out.print("1 ~ 45 사이 입력 : ");
			int num = scanner.nextInt();

			

			if (num < 1 || num > 45) { // 유효성 검사
				System.out.println("알림>> 잘못된 번호 입니다. 다시 입력해 주세요. ");
				i--;
				pass = false;
			}
			// 중복체크
			for (int j = 0; j < 6; j++) {
				if (num == unum[j]) {

					System.out.println("알림>> 다시 입력해 주세요. ");
					i--;
					pass = false;
				}
			}
			if (pass == true)
				unum[i] = num;

		}
		// 사용자 배열내 모든 인덱스 출력
		for (int temp : unum) {

			System.out.print(temp + "\t");
		}
		System.out.println();

		// 2. 컴퍼터가 난수생성

		for (int k = 0; k < 6; k++) {

			int lotto = random.nextInt(45) + 1;
			for (int temp : lotton) {
				if (lotto == temp) {
					k--;
					pass = false;
				}
			}
			if(pass) lotton[k] = lotto;
		}System.out.print("\n");
		for(int temp : lotton) {
			System.out.print(temp+ "\t");
		}
		
		
//		// 3. 두 배열간의 동일한 수 찾기
//		// 하나 설정해서 다 비교
//		
		int same = 0;
//		for(int i=0; i <unum.length ; i++) {
//			for(int j=0; j<lotton.length ; j++) {
//				
//				if(unum[i] == lotton[j]) {
////					사용자 배열 내 i번째 인덱스와
////					컴퓨터 배역 내 j번째 인덱스 동일하면
//					same++;
//					
//				}
//			}
//			
//		}
		
		// 3-2
			
		for(int 비교기준 : unum) { //사용자번호 배역 내 하나씩 비교기준 대입
			for(int 비교대상 : lotton) { //추첨번호 배열 내 하나씩 비교대상 대입
				if(비교기준 == 비교대상)
					same++;
			}
		}
		
		
		System.out.println("\n동일한 수 : " + same);

	}
}
