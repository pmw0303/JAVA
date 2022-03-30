package Day03;

import java.util.Scanner;

public class Day03_3 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		// 점수를 입력받아 점수가 90점 이상이면 합격 아니면 불합격 출력
//		System.out.println("점수 입력 : ");
//		int score = scanner.nextInt();
//
//		if (score > 90) {
//			System.out.println("합격");
//		}else {
//			System.out.println("불합격");
//		}

		// 문제7
		// 점수를 입력받아 점수가 90점 이상이면 A등급
		// 점수가 80점 이상이면 B등급
		// 점수가 70점 이상이면 C등급
		// 그외 재시험

//		System.out.println("점수 입력 : ");
//		int score = scanner.nextInt();
//		
//		if(score >= 90) {
//			System.out.println("A등급");
//		}else if(score>=80) {
//			System.out.println("B등급");
//		}else if(score >=70) {
//			System.out.println("C등급");
//		}else 
//			System.out.println("재시험");
//		

		// 문제8 로그인페이지
		// [ 입력 ] : 아이디와 비밀번호를 입력받기
		// [ 조건 ] : 회원아이디가 admin 이고
		// 비밀번호가 1234 일 경우에는
		// 로그인 성공 아니면 로그인 실패 출력

//		System.out.print("아이디 입력 : ");
//		String id = scanner.next();
//		System.out.print("비밀번호 입력 : ");
//		int pw = scanner.nextInt();

		// 자료형 사용하는 변수는 연산자 사용 가능
		// 클래스 사용하는 객체는 연산자 사용 불가 -> 메소드 equals 사용

//		Boolean login = false;
//		if (id.equals("admin")) {
//			// id가 admin
//
//			if (pw==1234) {
//				// pw가 1234
//
//				System.out.println("로그인 성공");
//				login = true;
//			} else {
//				System.out.println("비밀번호가 틀렸습니다. ");
//			}
//		} else {
//			System.out.println("아이디가 틀렸습니다. ");
//		}
//		if (login == false)
//			System.out.println("로그인 실패");

		// 문제9
		// [ 입력 ] : 국어, 영어, 수학 입력받기
		// [ 조건 ] : 평균이 90점 이상이면서
		// 국어점수 100점이면 '국어우수' 출력
		// 영어점수 100점이면 '영어우수' 출력
		// 수학점수 100점이면 '수학우수' 출력

		System.out.println("국어점수 입력 : ");
		int score1 = scanner.nextInt();
		System.out.println("영어점수 입력 : ");
		int score2 = scanner.nextInt();
		System.out.println("수학점수 입력 : ");
		int score3 = scanner.nextInt();

		int avg = (score1 + score2 + score3) / 3;

		if (avg >= 90 && avg <= 100) {
			if(score1 == 100) {
				System.out.println("국어우수");
			}if(score2 == 100) {
				System.out.println("영어우수");
			}if(score3 == 100) {
				System.out.println("수학우수");
			}
					
		}else if(avg >=80 && avg < 90 ) {
			if(score1 >= 90) {
				System.out.println("국어장려");
			}if(score2 >= 90) {
				System.out.println("영어장려");
			}if(score3 >= 90) {
				System.out.println("수학장려");
			}
		}else System.out.println("재시험");

	}
}
