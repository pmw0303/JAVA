package Day01;

public class Day01_2 { //cs

	/* 출력	1. print() 
	2. printf() 출력 꾸미기
	3. println() 
	System : 시스템 클래스 [입출력 관련 코드 제공]
	시스템클래스 내 out 이라는 출력 스트림을 통해 print 함수를 사용하여 console에 원하는 대로 출력	*/
	public static void main(String[] args) { 
		
		System.out.print('d');
		System.out.print("sdsd");
		System.out.print(33313);
		System.out.println("간다");
		System.out.println("쿠크르삥뽕");
		System.out.printf("%s", "우와");
		
		System.out.println("\n\t\t[[출석부]]");
		System.out.println("------------------------------------");
		System.out.println("이름\t1교시\t2교시\t3교시\t비고");
		System.out.println("강호동\t출석\t결석\t출석");
		System.out.println("유재석\t출석\t출석\t출석");
		System.out.println("------------------------------------");
		
		System.out.printf("\n\t\t[[%s]]\n", "출석부");
		System.out.printf("%s", "------------------------------------\n");
		System.out.printf("%s\t%s\t%s\t%s\t%s\t\n","이름","1교시","2교시","3교시","비고");
		System.out.printf("%s\t%s\t%s\t%s\t\n","강호동","출석","결석","출석");
		System.out.printf("%s\t%s\t%s\t%s\t\n","유재석","출석","출석","출석");
		System.out.printf("%s", "------------------------------------\n");
		
		System.out.println("\t\\    /\\");
		System.out.println("\t )  ( ')");
		System.out.println("\t(  /  )");
		System.out.println("\t \\(__)|");
		
		System.out.println("\n\n\t|\\_/|");
		System.out.println("\t|q p|   /}");
		System.out.println("\t( 0 )\"\"\"\\");
		System.out.println("\t|\"^\"`    |");
		System.out.println("\t||_/=\\\\__|");
		
		
	}
} //ce

// 문자 " " 처리 / 숫자 " " 처리X 
// 미리 만들어진 예약어를 제외한 모든 문자는 " " 처리
// %s : 문자열 / %d : 정수 / %s : 실수