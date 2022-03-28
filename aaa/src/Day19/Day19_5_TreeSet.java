package Day19;

import java.util.Scanner;
import java.util.TreeSet;

public class Day19_5_TreeSet {
	
	public static void main(String[] args) {
		
		// p753 - TreeSet (2진트리)
			// 1. 하나의 객체 = 노드
			// 2. 각 노드는 최대 2개의 자식 노드를 가질 수 있음
		 	// 3. 부모보다 작으면 왼쪽, 크면 오른쪽 
			// 4. 가장 왼쪽이 작고, 오른쪽이 큼
			// 5. TreeSet<기존자료형클래스> : 
			// 6. TreeSet<사용자정의클래스> : Comparable, Compator 
		TreeSet<Integer> scores = new TreeSet<>();
		
		scores.add(87); System.out.println("확인 : " + scores);
		scores.add(88); System.out.println("확인 : " + scores);
		scores.add(90); System.out.println("확인 : " + scores);
		scores.add(49); System.out.println("확인 : " + scores);
		scores.add(60); System.out.println("확인 : " + scores);
		// * 정렬을 자동으로 해줌
		System.out.println(scores.first()); // 가장 왼쪽 노드
		System.out.println(scores.last()); // 가장 오른쪽 노
		System.out.println(scores.lower(89)); // 89기준으로 왼쪽
		System.out.println(scores.higher(70)); // 70기준으로 오른쪽
		System.out.println(scores.floor(95)); // 95포함 기준으로 왼쪽 [같거나 작은]
		System.out.println(scores.ceiling(85)); // 85포함 기준으로 오른쪽 [같거나 큰]
		
		scores.pollFirst(); // 가장 왼쪽 삭제
		System.out.println(scores);
		scores.pollLast(); // 가장 오른쪽 삭제
		System.out.println(scores);
		
		// 오름차순 / 내림차순
		// 오름차순 : 기본
		// 내림차순 : .descendingSet()		
		System.out.println("오름차순 : " +scores);
		System.out.println("내림차순 : " +scores.descendingSet()); // 내림차순
		
		Scanner scanner = new Scanner(System.in);
		
		// 반복문을 이용한 오름차순 / 내림차순 출력
		System.out.println("==============");
		System.out.println("오름차순");
		for(Integer temp : scores) {
			System.out.println(temp);
		}
		
		System.out.println("내림차순");
		for(Integer temp : scores.descendingSet()) {		
			System.out.println(temp);
		}
		
		int i = scanner.nextInt();
		scores.add(i);
		System.out.println(scores);
		System.out.println(scores.descendingSet());
	}

}
