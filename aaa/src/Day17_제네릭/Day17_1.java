package Day17_제네릭;

public class Day17_1 {
	
	public static void main(String[] args) {
		
		// 제네릭
			// 선언 : public class 클래스명<제네릭이름>
			// 목적 : 외부에서 
		// p658
			// 객체 생성
		
		Box<String> box1 = new Box<String>();
		box1.set("홍길동");
		String str = box1.get();
		
			// 객체 2 
		Box<Integer> box2 = new Box<>();
		// 클래스에 Integer 타입 넣기    // <>생략 가능
		box2.set(6);
		int val = box2.get();
		
		System.out.println(str);
		System.out.println(val);
		
		
		// p659
		// 1. 객체 생성하는데 제네릭 타입 넣기
		Product<Tv, String> product1 = new Product<>();
		// 2. 객체내 필드에 각 제네릭타입으로 값 넣기
		product1.setKind(new Tv());
		product1.setModel("스마트TV");
		// 3. 호출
		Tv tv = product1.getKind(); // 
		String tvmodel = product1.getModel();
		
		System.out.println(tv);
		System.out.println(tvmodel);
		
		
		// 1. 객체 생성하는데 제네릭타입 넣기
		Product<Car, String> product2 = new Product<>();
		// 2. 객체내 필드에 각 제네릭타입으로 갑 넣기
		product2.setKind(new Car());
		product2.setModel("디젤");
		// 3. 호출
		Car car = product2.getKind();
		String carmodel = product2.getModel();
		
		
		//
		Product<Integer, Double> product3 = new Product<>();
		
		
	}

}
