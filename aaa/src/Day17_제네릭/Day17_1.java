package Day17_���׸�;

public class Day17_1 {
	
	public static void main(String[] args) {
		
		// ���׸�
			// ���� : public class Ŭ������<���׸��̸�>
			// ���� : �ܺο��� 
		// p658
			// ��ü ����
		
		Box<String> box1 = new Box<String>();
		box1.set("ȫ�浿");
		String str = box1.get();
		
			// ��ü 2 
		Box<Integer> box2 = new Box<>();
		// Ŭ������ Integer Ÿ�� �ֱ�    // <>���� ����
		box2.set(6);
		int val = box2.get();
		
		System.out.println(str);
		System.out.println(val);
		
		
		// p659
		// 1. ��ü �����ϴµ� ���׸� Ÿ�� �ֱ�
		Product<Tv, String> product1 = new Product<>();
		// 2. ��ü�� �ʵ忡 �� ���׸�Ÿ������ �� �ֱ�
		product1.setKind(new Tv());
		product1.setModel("����ƮTV");
		// 3. ȣ��
		Tv tv = product1.getKind(); // 
		String tvmodel = product1.getModel();
		
		System.out.println(tv);
		System.out.println(tvmodel);
		
		
		// 1. ��ü �����ϴµ� ���׸�Ÿ�� �ֱ�
		Product<Car, String> product2 = new Product<>();
		// 2. ��ü�� �ʵ忡 �� ���׸�Ÿ������ �� �ֱ�
		product2.setKind(new Car());
		product2.setModel("����");
		// 3. ȣ��
		Car car = product2.getKind();
		String carmodel = product2.getModel();
		
		
		//
		Product<Integer, Double> product3 = new Product<>();
		
		
	}

}
