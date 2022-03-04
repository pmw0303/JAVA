package Day04;

public class Day04_4 {

	public static void main(String[] args) {
		
//		데이터 저장 1개 -> 변수
//		배열 [특정(인덱스) 기준으로 나열]
//					1. 인덱스 ; 저장되는 순서(0번 ~)
//					2. [ ] ; 대괄호
//					3. 동일한 자료형
		
//		선언 
//			1. 자료형[] 배열명; 2. 자료형 배열명[];
//			3. 자료형[] 배열명 = { 데이터1, 데이터2, ... };
//			4. 자료형[] 배열명 = new 자료형[길이];
				
		int[] scores = {83, 90, 87};
		
		System.out.println("scores[0] : " + scores[0]);
		System.out.println("scores[1] : " + scores[1]);
		System.out.println("scores[2] : " + scores[2]);
					
					
		int sum = 0;
		for(int i=0 ; i < 3 ; i++) {
			
			sum += scores[i];
			System.out.println("scores["+i+"] : " + sum);
		}
		
		double avg = (double)sum/3;
		System.out.println(" 총합 : " + sum);
		System.out.println(" 평균 : " + avg);
		
		
		int[] array = new int[3];
//			int[] : int형 배열선언
//			정수배열1 : 배열이름[아무거나]
//			new : 메모리 할당 (객체, 배열에서 사용)
//			int[3] : 자료형[길이] 저장 개수
		
		for(int i = 0 ; i < 3 ; i++) { // 데이터 넣기 전
			System.out.println(array[i]);
		}
		
		array[0] = 100; array[1] = 32; array[2] = 25;
		
		
		for(int i = 0 ; i < array.length ; i++) { // 데이터 넣은 후   i < 3 -> i < array.length
			System.out.println(array[i]);
		}
		
		// 향상된 for
		for(int temp : array) {
			System.out.println(temp);
		}
		
		
		
		
	}
}
