package Day01;

import java.util.Scanner;

public class Day01_5 {
	
	public static void main(String[] args) {
		//입력 -> 저장 -> 출력
		//1. 입력 객체 선언
		Scanner sc = new Scanner(System.in);
		//2. 입력할 대상 안내 / 3. 입력받은 데이터 다른곳에 저장
		System.out.print("이름 : ");
		String name = sc.next();
		System.out.print("아이디 : ");
		String id = sc.next();
		System.out.print("비밀번호 : ");
		String password = sc.next();
		System.out.print("이메일 : ");
		String email = sc.next();
		
		System.out.println(">>>>>>> 회원가입 완료. 정보를 확인해주세요. <<<<<<<< ");
		System.out.println("이름\t아이디\t비밀번호\t이메일");
		System.out.printf("%s\t%s\t%s\t%s",name,id,password,email);
		
	}
}
