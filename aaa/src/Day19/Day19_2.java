package Day19;

import java.util.HashSet;
import java.util.Scanner;

public class Day19_2 {
	
	// set 중복 불가능
		// 객체 내 모든 필드가 동일하면 중복 불가능*
	
	public static void main(String[] args) {
		
		// 로또 프로그램 **set 컬랙션
		
		Scanner scanner = new Scanner(System.in); // 1. 입력객체
		HashSet<Integer> set = new HashSet<>(); // 2. set 컬랙션 HashSet 클래스 객체 선언
		
		while(true) { // 무한루프 [종료조건 : set 객체 내 객체수가 6이면 break]
			System.out.println("1 ~ 45 숫자 선택(중복 불가)");
			int num = scanner.nextInt();
			
			if(num < 1 || num >45) { // 1~45 밖의 숫자는 불가
				System.err.println("선택이 불가한 번호입니다");
			}else {
				set.add(num);
				System.out.println("선택번호 : " + set);
			}
			if(set.size() == 6) {
				break;
			}
			
		}
	}
}
