package Day11;

public class Day11_3 {

	// p422 ���� ������
		// ���� : ��� �޼ҵ忡�� try-catch ���� �ڵ� ���� -> �Ѱ����� �̵�
	
	// p448
		// 1. 4
		// 2. 3
		// 3. 4
		// 4. 2
		// 5. 3
		// 6. 10-���ڷκ�ȯ�Ҽ�����-10-�ε������ʰ�����-10
		
	
	public static void main(String[] args) {
		
				
		try{
			findclass();
		}catch(Exception e) {}

	
		try {
			withdraw(30000);
			
		}catch(Exception e) {
			System.out.println(e);
		}
	}
		public static void findclass() throws Exception {
			
		Class clazz = Class.forName("java.lang.String2");
		
			
//		try { // ���ܰ� �߻��� �� ���� �ڵ�(���࿹��) / �Ϲݿ���(������)
//			Class clazz = Class.forName("java.lang.String2");
//		}catch(Exception e) {
//			System.out.println(e);
//		}
		}
	

	public static void withdraw(int money) throws Exception{
		if(20000 < money) {
			throw new Exception("�ܰ����");
		}
	}
}	