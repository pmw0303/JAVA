package Day03;

public class Day04_4 {

	public static void main(String[] args) {

		// 제어문
		// 1. if문 2. switch문
		// if : 논리검사( true , false )
		// >= <= > < == !=
		// switch : 데이터 검사
		// 형태
		// switch( 검사대상 ){
//			case '값' : 실행문;
//			case '값' : 실행문;
//			case '값' : 실행문;
//			default : 실행문;
		// }
		// break; 가장 가까운 switch 혹은 반복문 탈출[ 나가기 ]

		// 점수 90점 이상 A, 80점 이상 B, 70점 이상 C, 그 외 탈락
//		int score = 80;
//		if (score == 90)
//			System.out.println("A");
//		else if (score == 80)
//			System.out.println("B");
//		else if (score == 70)
//			System.out.println("C");
//		else
//			System.out.println("탈락");

//		switch (score) {
//		case 90:
//			System.out.println("A"); break;
//		case 80:
//			System.out.println("B"); break;
//		case 70:
//			System.out.println("C"); break;
//		default:
//			System.out.println("탈락"); break;

//		int bt = 3;
//		switch (bt) {
//
//		case 1:
//			System.out.println("1층 이동");
//			break;
//		case 2:
//			System.out.println("2층 이동");
//			break;
//		case 3:
//			System.out.println("3층 이동");
//			break;
//		case 4:
//			System.out.println("4층 이동");
//			break;
//		default:
//			System.out.println("정지");
//		}

		char cs = 'A';
		switch (cs) {
		case 'A':
		case 'B':
			System.out.println("우수 회원");
			break;
		case 'C':
		case 'D':
			System.out.println("일반 회원");
			break;
		default:
			System.out.println("손님");
		}

	}
}
