package Day13;

import java.util.Random;

public class Day13_1 {
	public static void main(String[] args) {
		
		// p534
		
		// Math.abs 절대값
		
		System.out.println(" 절대값 = " + Math.abs(-5));
		System.out.println(" 절대값 = " + Math.abs(-3.14));
		
		// ceil 올림
		System.out.println(" 올림 = " + Math.ceil(5.3));
		System.out.println(" 올림 = " + Math.ceil(-5.3));
		
		// 버림
		System.out.println(" 버림 = " + Math.floor(5.3));
		System.out.println(" 버림 = " + Math.floor(-5.3));
		
		// 최대값
		System.out.println(" 최대값 = " + Math.max(5, 9));
		System.out.println(" 최소값 = " + Math.min(5.3, 2.5));
		
		// 랜덤값 (0 ~ 1사이)
		System.out.println(" 랜덤값 = " + Math.random());
		System.out.println(" 랜덤값 = " + Math.random()*10);
		
		// 가까운정수 실수값
		System.out.println(" 가까운 정수의 실수 = " + Math.rint(5.3));
		System.out.println(" 가까운 정수의 실수 = " + Math.rint(-6.7));
		
		// 반올림
		System.out.println(" 반올림 = " + Math.round(4.4));
		System.out.println(" 반올림 = " + Math.round(-3.2));
		
		double value = 12.3456; // 소수 3번째 자리에서 반올림
		double temp = value *100;
		long temp2 = Math.round(temp);
		
		double value2 = temp2/100.0;
		System.out.println(value2);
		
		System.out.println(" 0~1 사이의 수 : " + Math.random());
		System.out.println(Math.random()*6); // 0 ~ 5.9xxxxxxxxxx
		System.out.println(Math.random()*6 +1);
		
		int num = (int)(Math.random()*6)+1;
		System.out.println(num); // 정수로 강제 형변환 해서 1 ~ 6
		
		
		Random r = new Random();
		System.out.println(" 1~6 까지 난수 : " + (r.nextInt(6)+1));
		
		
		
		
	}

}
