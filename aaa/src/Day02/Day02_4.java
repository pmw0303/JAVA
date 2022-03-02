package Day02;

public class Day02_4 {

	public static void main(String[] args) {
		
		//연산자
		
		//산술, 비교, 논리, 대입, 증감, 삼항[조건]
		 
		
		// 산술연산자
		int no1 = 10; int no2 = 20;
		System.out.println("합 : " + no1+no2); // 문자열 + 정수 -> 연결 연산자
		System.out.println("합 : " + (no1+no2));// 문자열 + (정수 + 정수) -> 계산
		System.out.println("합 : " + (no1-no2));
		System.out.println("합 : " + (no1*no2));
		System.out.println("합 : " + (no1/no2));
		System.out.println("합 : " + (no1%no2));
		
		// 증감연산자
		no1++;
		System.out.println(no1);
		no1--;
		System.out.println(no1);
		System.out.println("선위증가 : " + ++no1);
		System.out.println("후위증가 : " + no1++);
		
		//비교연산자
		System.out.println("이상 : " +(no1>=no2));
		System.out.println("이하 : " +(no1<=no2));
		System.out.println("초과 : " +(no1>no2));
		System.out.println("미만 : " +(no1>no2));
		System.out.println("같다 : " +(no1==no2));
		System.out.println("같지않다 : " +(no1!=no2));
		
		//논리연산자
			// and && : 2개 이상의 비교연산자가 모두 true -> true 아니면 false
			// or || : 2개 이상의 비교연산자가 하나라도 true -> true 아니면 false
		
		int no3 = 30; int no4 = 40;
		System.out.println("and : " + (no1 >= no2 && no4 >= no3));
		System.out.println("or : " + (no1 >= no2 || no4 >= no3));
		System.out.println("not : " + !(no1 >= no2 || no4 >= no3));
		
		//대입연산자
		no1 = no1 + 10; System.out.println(no1);
		no1 += 10; System.out.println(no1);
		
		System.out.println("no1 = " + (no1-=10));
		System.out.println("no1 = " + (no1/=10));
		
		//조건연산자
		int score = 85;
		char grade = score > 90 ? 'A' : 'B';
			// 조건식 ? 참 : 거짓
	
		System.out.println("등급 : " + grade);
		char grade2 = score > 90 ? 'A' : score > 80 ? 'B' : 'C';
		System.out.println("등급 : " + grade2);
		
	}
}
