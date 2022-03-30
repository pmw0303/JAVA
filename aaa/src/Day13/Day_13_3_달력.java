package Day13;

import java.util.Calendar;
import java.util.Scanner;

public class Day_13_3_달력 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print(" 연도 :"); int year = sc.nextInt();
		System.out.print(" 월 :");	int month = sc.nextInt();
		
		달력(year, month);
	}
	
	public static void 달력(int year, int month) {
		while(true) { // 종료조건 4번
			// 캘린더 클래스 내 현재 날짜/시간 객체 호출
			Calendar cal = Calendar.getInstance();
			// 연도, 월, 일
	//		int year = cal.get(Calendar.YEAR);
	//		int month = cal.get(Calendar.MONTH)+1;
//			int day = cal.get(Calendar.DAY_OF_MONTH);
//			// 해당 월의 1일의 요일찾기
//				// 1. 사용자 정의 캘린더 설정
				cal.set(year, month-1, 1); // 예) 3월 1일
				// 2. 3월1일의 요일
				int sweek = cal.get(Calendar.DAY_OF_WEEK);
				// 3. 3월의 마지막 일
				int eday = cal.getActualMaximum(Calendar.DAY_OF_MONTH);		
				
			System.out.println("\t\t **** " + year + "년" + month + "월 **** " );
			System.out.println("일\t월\t화\t수\t목\t금\t토");
			
			// 현재 월 1일의 위치
			for(int i = 1 ; i < sweek ; i++) {
				System.out.print("\t");
			}
			// 1일부터 마지막 날까지 출력
			for(int i = 1 ; i <= eday ; i++) {
				System.out.print(i + "\t"); // i = 일 출력
				// 토요일마다 줄바꿈처리 [ 요일 7배수 ]
				if(sweek % 7 ==0 ) 
				System.out.println();
				sweek++;
				
			} //버튼
			try {
				System.out.println("\n\n [ 1.◀(이전달)  2.▶(다음달) 3.다시검색 4.종료] \n\n");
				Scanner sc = new Scanner(System.in);
				int ch = sc.nextInt();		
				if(ch==1) {
					month -=1;
					if(month == 0) { year-=1; month = 12;}
				}else if(ch==2) {
					month +=1;
					if(month == 13) { month = 1; year+=1;}
				}else if(ch==3) {
					System.out.print(" 연도 : "); year = sc.nextInt();
					System.out.print(" 월 : "); month = sc.nextInt();
				}else if(ch==4) {
					System.out.println("종료");
					break;
				}else 
					System.out.println("잘못된 번호");
			}catch(Exception e) {
				System.out.println("잘못된 입력");
			}
		} // while 끝			
	} // 달력 끝
} // class 끝
