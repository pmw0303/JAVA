package Day12;

import java.util.Random;
import java.util.Scanner;

public class Day12_4 {
	
	// 차량번호 구분 프로그램
	// 조건
//		1. 난수 0000-9999 사이에 난수 10개 생성해서 배열에 저장
//		2. 모든 차량 번호를 배열에 저장
//		3. 끝자리 번호로 홀/짝 구분
//		4. 차량 끝자리가 홀수인 차량 / 짝수인 차량 출력

	public static void main(String[] args) {
//		Random random = new Random();
//		int[] carN = new int[10];
//
//		for (int i = 0; i < carN.length; i++) {
//			carN[i] = random.nextInt(10000);
//		}
//
//		for(int j=0; j< carN.length ; j++) {
//			if(carN[j]%2 == 0) {
//				System.out.print(carN[j]+ "짝" + " ");
//			}else if(carN[j]%2 != 0) {
//				System.out.print(carN[j] + "홀" + " ");
//			}
//			
//			
//		} 홀짝 0 ~ 9999 까지 배열에 저장해서 홀짝 구분뽑기 
		
		Scanner sc = new Scanner(System.in);
		Random rd = new Random();	
		String[] carlist = new String[10];
		String[] evenlist = new String[10];
		String[] oddlist = new String[10];
			
		while(true) {
			System.out.println("\n *** 주차중인 모든 차량 번호 ***");
			for(String temp : carlist) {
				if(temp != null) { 
					if(Integer.parseInt(temp) % 2 ==0) {
						System.out.println(temp + "[짝]  ");
						for(int i=0 ; i<evenlist.length ; i++) {
							evenlist[i] = temp;
							break;
						}
					}else System.out.println(temp + "[홀]  ");
				}
			}
			// 홀수차량
			System.out.println("\n *** 홀수 차량 ***");
			// 짝수차량
			System.out.println("\n *** 짝수 차량 ***");
			
			System.out.println("1.차량입차");
			int ch = sc.nextInt();
			if(ch==1) {			
				int intnum = rd.nextInt(10000);
				String strnum = String.format("%04d", intnum);
											
				boolean save= false;
				for(int i=0; i<carlist.length; i++) {
					if(carlist[i] == null) {
						carlist[i] = strnum;
						save = true;
						break;
					}
				}
				if(save==false ) System.err.println("주차불가");
			}
		}		
	}
}
