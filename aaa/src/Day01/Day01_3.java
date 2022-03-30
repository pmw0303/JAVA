package Day01;

import java.util.Scanner;

public class Day01_3 { //cs
	public static void main(String[] args) { //ms 
		
		
		Scanner sc = new Scanner(System.in);
		//Scanner : 입력 클래스
		//scanner : 객체 이름
		//new : 메모리 할당
		//Scanner() : 생성자 
		//System.in : 입력 / System.out : 출력
		
		System.out.print("이름 입력 : ");
		
		String name = sc.next();
		//String : 문자열 클래스
		//name : 객체 이름
		//입력객체.next() : 입력객체 내 저장된 데이터 가져오기
		System.out.println("이름은 : " + name);
	} //me

} //ce

