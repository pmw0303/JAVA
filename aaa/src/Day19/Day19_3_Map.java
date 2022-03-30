package Day19;

import java.util.HashMap;

public class Day19_3_Map {
	
	public static void main(String[] args) {
		
		// Map 컬랙션 = json
			// *키(객체) , 값(객체) => 엔트리
			// 키 : set 컬랙션(중복불가) 값 : list 컬랙션(중복가능)
			// HashMap 클래스
				// 1. map객체명.put(키, 값) : 엔트리 추가
				// 2. map객체명.size() : 엔트리 개수
				// 3. map객체명.get(키) : 해당 키의 값 출력
				// 4. map객체명.keySet() : map 객체 내 모든 키
				// 5. map객체명.values() : map 객체 내 모든 값
					// 키 값은 중복 안됨 -> 키를 알면 값을 알 수 있음
					// for( 임시객체명 : map객체명.ketSet()) { }
				// 6. map객체명.remove(키) : 해당 키의 엔트리 삭제
				// 7. map객체명.clear() : 전체 엔트리 삭제
		
		// List : 순서(인덱스) 저장
		// Set : 순서 없는 저장
		// Map : 키와 값으로 이루어진 엔트리 저장 [순서X]
		
		// 1. HashMap 클래스 객체 선언
		HashMap<String, Integer> map = new HashMap<>();
		// HashMap : 컬랙션 프레임워크 map 클래스
		// <제네릭, 제네릭> : key, value 와 구성된 제네릭
			// map : map 객체명(아무거나)
				
		map.put("ㅋㅋㅋ", 30); System.out.println("확인 : " + map);
		// 리스트 = [ 객체, 객체, ... ]
		// 세트 = [ 객체, 객체, ... ]
		// 맵 = { 키 = 값 }
		map.put("홍길동", 70); System.out.println("확인 : " + map);
		map.put("홍동", 75); System.out.println("확인 : " + map);
		map.put("홍길동", 60); System.out.println("확인 : " + map); 
		// *키 중복 안됨 [덮어 씌움]
		
		System.out.println("값 : " + map.get("홍동"));
		System.out.println("map 객체 내 엔트리 수 : " + map.size());
		
		System.out.println("모든 키 호출 : " + map.keySet());
		System.out.println("모든 값 호출 : " + map.values());
		
		// 반복문 [key 반복문 이용 -> 모든 value 호출]
		for(String temp : map.keySet()) {
			System.out.println(temp + " : " + map.get(temp) );
		}
	
		map.remove("홍길동"); // 삭제
		System.out.println("확인 : " + map);
		
		map.clear(); // 전체 삭제
		System.out.println("확인 : " + map);
	}
}
