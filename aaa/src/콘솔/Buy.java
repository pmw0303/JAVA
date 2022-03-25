package 콘솔;

import java.util.Random;

public class Buy extends Thread {
	
	String 음료이름;
	
	public Buy(String 음료이름) {
		this.음료이름 = 음료이름;
	}
	
	@Override
	public synchronized void run() {
		
		
		// 병렬처리 실행
		try {Thread.sleep(5000);}catch(Exception e) {} // 컴퓨터 구매활동 3초이후 시작
		while(true) {
			if(Drink.경고횟수>=4) {
				break;
			}
			if(음료이름=="콜라") {
				Random random = new Random();			
				int buy = random.nextInt(2)+1;
				if (Drink.콜라 < buy) {
					Drink.경고횟수 += 1;
					Drink.메시지.add(0,"경고) 콜라가 부족하여 판매하지 못했습니다");
					if(Drink.메시지.size()>=8) {
						Drink.메시지.remove(5);
					}
				}
				else {
					Drink.콜라 -= buy;
					Drink.자금 += buy*400 ;
					Drink.메시지.add(0,"콜라 " + buy + " 개 판매되었습니다. + " + buy*400 + "원");
					if(Drink.메시지.size()>=8) {
						Drink.메시지.remove(5);
					}
				}
					try {Thread.sleep(2000-Drink.시간차이*10);}catch(Exception e) {}
			}
			else if(음료이름=="환타") {	
				Random random = new Random();
				int buy = random.nextInt(2)+1;
				if (Drink.환타 < buy) {
					Drink.경고횟수 += 1;
					Drink.메시지.add(0,"경고) 환타가 부족하여 판매하지 못했습니다");
					if(Drink.메시지.size()>=8) {
						Drink.메시지.remove(5);
					}
				}
				else {
					Drink.환타 -= buy;
					Drink.자금 += buy*300 ;
					Drink.메시지.add(0,"환타 " + buy + " 개 판매되었습니다. + " + buy*300 + "원");
					if(Drink.메시지.size()>=8) {
						Drink.메시지.remove(5);
					}
				}
				try {Thread.sleep(2000-Drink.시간차이*10);}catch(Exception e) {}
			}
			else if(음료이름=="사이다") {	
				Random random = new Random();
				int buy = random.nextInt(2)+1;
				if (Drink.사이다 < buy) {
					Drink.경고횟수 += 1;
					Drink.메시지.add(0,"경고) 사이다가 부족하여 판매하지 못했습니다");
					if(Drink.메시지.size()>=8) {
						Drink.메시지.remove(5);
					}
				}
				else {
					Drink.사이다 -= buy;
					Drink.자금 += buy*200 ;
					Drink.메시지.add(0,"사이다 " + buy + " 개 판매되었습니다. + " + buy*200 + "원");
					if(Drink.메시지.size()>=8) {
						Drink.메시지.remove(5);
					}
				}
				try {Thread.sleep(2000-Drink.시간차이*10);}catch(Exception e) {}
			}
			else if(음료이름=="레드불") {	
				Random random = new Random();
				int buy = random.nextInt(2)+1;
				if (Drink.레드불 < buy) {
					Drink.경고횟수 += 1;
					Drink.메시지.add(0,"경고) 레드불이 부족하여 판매하지 못했습니다");
					if(Drink.메시지.size()>=8) {
						Drink.메시지.remove(5);
					}
				}
				else {
					Drink.레드불 -= buy;
					Drink.자금 += buy*1500 ;
					Drink.메시지.add(0,"레드불 " + buy + " 개 판매되었습니다. + " + buy*1500 + "원");
					if(Drink.메시지.size()>=8) {
						Drink.메시지.remove(5);
					}
				}
				try {Thread.sleep(2000-Drink.시간차이*10);}catch(Exception e) {}
			}
		}
			
	}

}

