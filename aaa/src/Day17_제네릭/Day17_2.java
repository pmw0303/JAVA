package Day17_제네릭;

public class Day17_2 {
	
	public static void main(String[] args) {
		
		// 1. 객체생성
		Box<Integer> box1 = new Box<>();
		// 2. 메소드 호출 후 결과 값을 객체에 대입
		box1 = Util.<Integer>boxing(100);
		// 3. 확인
		System.out.println(box1.get());
		
		
		// p662~663
		// 1. p1 객체를 선언하는데 생성자
		//		에 정수 '1' 과 문자열 '사과' 넣기
		// 이유 : 제네릭<정수,문자열>
		Pair<Integer, String> p1
		= new Pair<Integer, String>(1, "사과");
		// 2. p2 객체
		Pair<Integer, String> p2
		= new Pair<Integer, String>(1, "사과");
		
		boolean result1 = Util.<Integer, String>Compare(p1, p2);
		
		if(result1) {
			System.out.println("같은 값");
		}else {
			System.out.println("다른 값");
		}
		
		
		Pair<String, String> p3	= new Pair<>("user1", "홍길동");
		Pair<String, String> p4	= new Pair<>("user2", "임꺽정");
		
		boolean result2 = Util.Compare(p3, p4);
		
		if(result2) {
			System.out.println("같은 값");
		}else {
			System.out.println("다른 값");
		}
	}

}
