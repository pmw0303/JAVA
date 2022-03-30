package Day09;

public class Computer extends Calculator {
	// 서브 클래스 extends 슈퍼클래스
	// 필드

	// 생성자

	// 메소드
	// **오버라이딩 [ 부모클래스내 메소드 재정의(수정) ]
	// ctrl + space bar -> 세모
	
	@Override // 상속받은 부모가 가지고 있는 메소드 호출
	double areaCircle(double r) {
		// TODO Auto-generated method stub
		System.out.println("Computer 객체의 areaCircle");
		return Math.PI * r * r;
	}

}
