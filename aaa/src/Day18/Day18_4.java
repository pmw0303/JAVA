package Day18;

import java.util.ArrayList;
import java.util.Scanner;

public class Day18_4 {

	public static void main(String[] args) {
		// 대기명단 프로그램
			// 메뉴 : [고객] 1.대기추가 2.대기취소 [관리자] 3.대기자입장
				// 대기추가 : 인원수를 입력받아 대기번호 반환
				// 대기취소 : 대기번호 입력받아 명단 취소
				// 대기자 입장 : 첫번째 대기중인 대기번호 호출
		
		Scanner scanner = new Scanner(System.in);
		
		int 대기번호=0; // 오늘 대기번호
		ArrayList<대기> 대기명단 = new ArrayList<>();
		// 여러 개의 대기 객체를 저장할 수 있는 리스트 선언
		
		while(true) {
			System.out.println("대기번호\t인원수\t대기시간[분]");
			for(대기 temp : 대기명단) {
				if (대기명단.indexOf(temp)==0) {
					System.out.println(temp.대기번호 + "\t" + temp.인원수 + "\t입장" );
				}else {
					System.out.println(temp.대기번호 + "\t" + temp.인원수 + "\t" + 대기명단.indexOf(temp) * 10);
				}
			}
			System.out.println("[고객] 1.대기추가 2.대기취소 [관리자] 3.대기자 입장");
			int ch = scanner.nextInt();
			if(ch==1) {
				System.out.println("전화번호"); String 전화번호 = scanner.next();
				System.out.println("인원수"); int 인원수 = scanner.nextInt();
				// 3개 변수 -> 1개 객체화
				대기 temp = new 대기(대기번호, 전화번호, 인원수);
				// 대기 인원들을 리스트에 저장
				대기명단.add(temp);
				대기번호 ++;// 대기명단 증가
				
			}else if(ch==2) {
				System.out.println("대기번호"); int 삭제대기번호 = scanner.nextInt();
				// 리스트 내 객체 필드 선언
				for(대기 temp : 대기명단) {
					if(temp.대기번호 == 삭제대기번호) {
						대기명단.remove(temp);
						break; 
						// 대기 명단 리스트에서 하나씩 호출하는데, 입력받은 번호와 temp의 대기번호가 같으면 삭제
					}
				}
			}else if(ch==3) {
				try {
					System.out.println("첫 번째 대기명단 입장"); 대기명단.remove(0); // 0번째 인덱스 삭제
				} catch (Exception e) {
					System.out.println("대기 명단이 없습니다");
				}		
			}else {
				
			}
		}
	}
}
