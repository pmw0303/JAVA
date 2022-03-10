package 라면레시피;

import java.util.Scanner;

public class Noodle {

	public static void main(String[] args) {

		// 라면 레시피
		// 1. 레시피 추가 / 2. 레시피 보기

		// 2. 레시피 보기 -> 전체 이름 출력
		// 1. 레시피 출력 / 2. 레시피 수정 / 3. 레시피 삭제

		Scanner sc = new Scanner(System.in); // 입력 할 수 있는 객체 선언

		Recipe[] recipe = new Recipe[100]; // 레시피 추가를 위한 배열 선언

		while (true) { // while 시작

			System.out.println("----------------------------");
			System.out.println("1. 레시피 추가 / 2. 레시피 보기");
			int ch = sc.nextInt();

			if (ch == 1) { // 레시피 추가
				System.out.println("----------레시피 추가---------");
				System.out.println("이름 입력 : ");
				String name = sc.next();
				System.out.println("물 양 입력 : ");
				String water = sc.next();
				System.out.println("시간 입력 : ");
				String time = sc.next();
				System.out.println("추가재료 입력 : ");
				String plus = sc.next();
				// 레시피 내용 입력받기

				Recipe 레시피 = new Recipe(name, water, time, plus); // 레시피 객체 생성

				for (int i = 0; i < recipe.length; i++) { // 레시피 배열 길이만큼 탐색
					if (recipe[i] == null) { // 빈 배열이면 저장
						recipe[i] = 레시피;
						break;
					}
				} // 저장 for end

			} else if (ch == 2) { // 레시피 보기
				System.out.println("----------레시피---------");
				System.out.println("번호\t이름");
				
				for(int i = 0 ; i < recipe.length ; i++) {
					if(recipe[i] != null) { // 레시피가 비어있지 않으면 천제 이름 출력
						System.out.printf("%s\t%s\n",i, recipe[i].name);
						 
					}
				}
					
				System.out.println("----------------------");
				System.out.println("1. 레시피 출력 / 2. 레시피 수정 / 3. 레시피 삭제");
				int ch1 = sc.nextInt();
				
				if(ch1 == 1) { // 라면 레시피 출력하기
					System.out.println("라면 번호 입력 : "); 
					int num = sc.nextInt();
					if(recipe[num] != null) {
						System.out.println("레시피 이름 : " + recipe[num].name);
						System.out.println("물 양 : " + recipe[num].water);
						System.out.println("시간 : " + recipe[num].time);
						System.out.println("추가재료 : " + recipe[num].plus);
					}else 
						System.out.println("레시피가 존재하지 않습니다"); // 라면 레시피 출력 끝
				}else if(ch1 == 2) { // 레시피 수정하기
					System.out.println("----------------------");
					System.out.println("수정할 번호 입력 : "); int num = sc.nextInt();
					if(recipe[num] != null) {
						System.out.println("레시피 이름 : "); String name = sc.next();
						System.out.println("물 양 : "); String water = sc.next();
						System.out.println("시간 : "); String time = sc.next();
						System.out.println("추가재료 : "); String plus = sc.next();
						
						Recipe recipe1 = new Recipe(name, water, time, plus);
						recipe[num] = recipe1; // 레시피 수정
						
					}else System.out.println("레시피가 존재하지 않습니다");
				}else if(ch1 == 3) {
					System.out.println("----------------------");
					System.out.println("삭제할 번호 입력 : "); int num = sc.nextInt();
					
					if(num != recipe.length - 1) { // 삭제할 번호가 전체 레시피보다 크지 않으면
						recipe[num] = recipe[num + 1]; // 뒤의 인덱스를 땡긴다
						recipe[num +1] = null;
						System.out.println("삭제 되었습니다");
					}else {
						recipe[num] = null; // 아니면 그냥 삭제한다
					}
					
				}else {
					System.out.println("잘못된 번호입니다");
				}
				
			}

		}
	}
}
