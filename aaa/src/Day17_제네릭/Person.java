package Day17_���׸�;

public class Person<T>{

	//�ʵ�
	private String name;
	private int age;
	
	// ������
	public Person() {}
	
	public Person(String name) {	
		this.name = name;
	}
		
	// �޼ҵ�
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
}
