package Day10;

import java.util.ArrayList;

public class Day10_4 {

	public static void main(String[] args) {
		
		String[] 배열이름 = new String[100];
		// 리스트 [클래스 기반의 배열]
		System.out.println("배열 : " + 배열이름); // 메모리 주소 값
		배열이름[0] = "유재석";
		System.out.println("배열 : " + 배열이름[0]);
		System.out.println("길이 : " + 배열이름.length);
		
		ArrayList<String> 리스트이름 = new ArrayList<>();
		// ArrayList [자동완성]
			// <자료형> : 리스트에 저장될 자료형
			// 리스트명 : 아무거나
			// new : 메모리 할당 [객체 생성시 필수]
			// ArrayList<>() : 생성자
		System.out.println("리스트 : " + 리스트이름); // 메모리 목록
		리스트이름.add("강호동");
		리스트이름.add("강식당"); // 리스트명.add(객체명) : 리스트에 객체추가 메소드
		System.out.println("리스트 : " + 리스트이름.get(0)); // 리스트명.get(0) : 해당 인덱스의 객체 호출 메소드
		System.out.println("길이 : " + 리스트이름.size());
		
		// 배열 단점 : 메모리 할당 1번 -> 메모리 크기 고정, 변경 힘듬
			// ex ) 회원 100명 -> 100명 초과시 저장 X
			//		회원 1명이면 나머지 99개 메모리 Null [메모리 낭비]
		
		// 리스트 : 메모리 크기 가변길이 [메모리 효율성 좋음]
			// 리스트의 기본길이 10 -> 넘어가면 자동 추가 및 삭제

		// 	배열(문법) vs 리스트(클래스)
		//	추가메소드 X   추가메소드 O
		// 배열명[0]=값   리스트명.add(값)  -- 입력
		// 배열명[인덱스]  리스트명.get(인덱스)  -- 호출
		// null 할당     리스트명.remove(인덱스)  -- 삭제
		// 1 null 3    1 3  -> 리스트 자동으로 땡겨짐
		// 배열명.length  리스트명.size  -- 크기
		// 
		
		
		
	}	
}
