package Day05;

import java.util.Scanner;

public class Day05_3 {

	public static void main(String[] args) {

		// p.181
		// 1.
		// 2.
		// 3. 2 : 객체 비교시 equals 메소드 사용
		// 4. 2 : 길이가 없을경우 값 대입 불가
		// 5. 3 : boolean 초기값은 false
		// 6. 3 , 5
		// { 1행 } , { 2행 } , { 3행 } => 3
		// { 78 83 93 87 88 } => 5
		// 7.

//		int max = 0; // 최댓값 저장하는 변수
//		int[] array = { 1, 5, 3, 8, 2 }; // 선언+초기값 선언
//
//		for (int i = 0; i < array.length; i++) {
//			// *i는 0 부터 배열의길이 까지 1씩증가 실행 반복처리
//			if (max < array[i])
//				max = array[i];
//			// * 만약에 max보다 i번째 인덱스의 값이 더 크면 max에 i번째 값 대입
//		}
//		System.out.println(" max : " + max);

		// 8.
//		int[][] array2 = { { 95, 86 }, { 83, 92, 96 }, { 78, 83, 93, 87, 88 } };
//
//		int sum = 0; // 합계
//		double avg = 0.0; // 평균
//
//		// 풀이
//		int count = 0; // 점수의 개수 [ 칸 개수 ]
//		// 2차원 배열내 모든 데이터 호출
//		for (int 행 = 0; 행 < array2.length; 행++) { // * 행은 0부터 배열의 행길이[3]미만까지 1씩증가
//			for (int 열 = 0; 열 < array2[행].length; 열++) { // *열은 0부터 배열의 열길이[ 2 , 3 , 5 ] 미만까지 1씩증가
//				sum += array2[행][열]; // 누적합계
//			}
//			count += array2[행].length; // 열길이의 누적합계
//		}
//
//		avg = (double) sum / count;
//
//		System.out.println(" sum : " + sum);
//		System.out.println(" avg : " + avg);

		// 9.
		boolean run = true;
		int studentNum = 0;
		int[] scores = null;
		Scanner scanner = new Scanner(System.in);

		while (run) {

			System.out.println("-------------------------------------------------");
			System.out.println("1. 학생수|2. 점수입력|3. 점수리스트|4. 분석|5. 종료");
			System.out.println("-------------------------------------------------");
			System.out.println("선택> ");

			int selectNo = scanner.nextInt();

			if (selectNo == 1) {

				System.out.println("학생수> ");
				studentNum = scanner.nextInt();
				scores = new int[studentNum];

			} else if (selectNo == 2) {
				for (int i = 0; i < scores.length; i++) {
					System.out.printf("scores[%d} : \n", i);
					scores[i] = scanner.nextInt();

				}

			} else if (selectNo == 3) {
				for (int i = 0; i < scores.length; i++) {
					System.out.printf("score[%d] : %d \n", i, scores[i]);

				}

			} else if (selectNo == 4) {
				
				int max = 0;
				int all =0;
				double avg = 0;
				
				for(int i=0 ; i<scores.length ; i++ ) {
					
					if(max < scores[i]) max =scores[i];
					
					all += scores[i];
				}
				
				avg = (double)all/scores.length;
				
				System.out.println("최고 점수 : " + max);
				System.out.println("평균 점수 : " + avg);

			} else if (selectNo == 5) {
				run = false; // or break;
			}
		}

		System.out.println("프로그램 종료");
	}

}
