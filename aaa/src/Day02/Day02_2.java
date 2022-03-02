package Day02;

public class Day02_2 {
	
	public static void main(String[] args) {
		
		byte var1 = -128;
		System.out.println(var1);
		
		byte var2 = -30;
		System.out.println(var2);
		
		byte var3 = 30;
		System.out.println(var3);
		
		byte var4 = 'j';
		System.out.println(var4);
		
		char c1 = 'a';
		System.out.println(c1);
		
		char c2 = 97;
		System.out.println(c2);
		
		char c3 = '\u0041';
		System.out.println(c3);
		
		char c4 = '가';
		System.out.println(c4);
		
		char c5 = 44032;
		System.out.println(c5);
		
		char c6 = '\uac00';
		System.out.println(c6);
		// 진법 : 컴퓨터가 2진수만 사용하면 표현 단위가 적음 -> 표현단위 다양성
		// 2진수 : 0,1 / 8진수 : 0~7 / 10진수 : 0~9 / 16진수 : 0~9 abcdef
		
		//short : +- 약 3만
		short num1 = 30000; System.out.println(num1);
		//short num2 = 40000; System.out.println(num2);
		
		//int : +- 약 20억
		int num2 = 10; System.out.println(num2); // 10진수
		int num3 = 012; System.out.println(num3); // 8진수는 앞에 0 붙임
		int num4 = 0xA; System.out.println(num4); // 16진수는 앞에 0x
		
		//long : 8바이트 정수 +- 20억이상
		long num5 = 100000000L; System.out.println(num5);
		
		//float : 4바이트[데이터 뒤에 f] 9자리까지 / double(실수 기본 타입) : 8바이트 17자리까지
		double num6 = 3.14; System.out.println(num6);
		float num7 = 3.14f; System.out.println(num7);
		
		double num8 = 0.1212411951042180421082014102412084; System.out.println(num8);
		
		
	}

}
