package Day10;

public class Child extends Parent{
	private String name;
	
	public Child() {
		this("홍길동");
		System.out.println();
	}
	
	public Child(String name) {
		this.name = name;
		System.out.println("자식 인수 1개");
	}
}
