package 엘리베이터;

import java.util.Scanner;


public class Elevate {

	Scanner sc = new Scanner(System.in);
	
	int maxFloor = 10; // 최고층
	int minFloor = 1; // 최소층
	int curFloor = 1; // 최근층
	int desFloor = 0; // 목적층

	

	void up() {
		while (curFloor < desFloor) {
			System.out.println("올라갑니다. 현재 층은 : " + curFloor);
			curFloor++;
		}
	}

	void down() {
		while (curFloor > desFloor) {
			System.out.println("내려갑니다. 현재 층은 : " + curFloor);
			curFloor--;
		}
	}
	
	void ask() {
		System.out.println("층 수를 입력 : ");
		desFloor = sc.nextInt();
		if(desFloor < minFloor || desFloor > maxFloor || desFloor == curFloor) {
			System.out.println("오류입니다");
			System.out.println("층을 다시 입력해 주세요 : ");
		}else {
			System.out.println("문을 닫습니다");
			if(desFloor < curFloor) {
				down();
			}else if(desFloor > curFloor) {
				up();
			}
		}System.out.println("문이 열립니다");
		ask();
	}
}
