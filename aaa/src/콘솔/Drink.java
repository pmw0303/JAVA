package 콘솔;

import java.util.ArrayList;

public class Drink{
	
	static int 자금 = 10000 ;
	static int 콜라 = 0 ;
	static int 사이다 = 0 ;
	static int 환타 = 0 ;
	static int 레드불 = 0 ;
	static long 시작시간 = System.currentTimeMillis();
	static int 시간차이 = 1 ;
	static int 경고횟수 = 0 ;
	static ArrayList<String> 메시지 = new ArrayList<>();
	
	
	public static void main(String[] args) {

		for(int i = 1 ; i <=5 ; i++) {
			메시지.add(" ");
		}
		Controller.시작화면출력();
		
		
		Btn buttons = new Btn();
	    buttons.showButton();
		
		// 현재 시간 저장
		// static 필드 선언 자금, 음료재고, 속도변수
		TimeCheck timecheck = new TimeCheck();
//		Music 배경음악 = new Music("배경음악.mp3",true);
		Buy buy1 = new Buy("콜라");
		Buy buy2 = new Buy("환타");
		Buy buy3 = new Buy("사이다");
		Buy buy4 = new Buy("레드불");


//		배경음악.start();
		timecheck.start();
		buy1.start();
		buy2.start();
		buy3.start();
		buy4.start();
		Controller.화면출력메소드();

		GameOver.Go();
		

			// 음료구매메소드(인수 : 속도변수  			반환 : X (음료재고에 직접접근하여 재고 차감))     o
			// 화면출력메소드(인수 : 음료재고, 자금		반환 : X)         o
			// 시간체크메소드(인수 : 현재시간   			반환 : 속도변수)     o
			
			
		// if 경고횟수3회면 break 게임종료
	}
		
}
