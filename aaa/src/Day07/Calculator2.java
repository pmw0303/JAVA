package Day07;

public class Calculator2 {

	
	// 1. �ʵ�
	
	// 2. ������
	
	// 3. �޼ҵ�
		// 1. ���� �޼ҵ�
	void execute() {
		double result = avg(7, 10);
		println("������ : " + result);
	}
		// 2. ��� �޼ҵ�
	double avg(int x, int y) {
		double sum = plus(x, y);
		double result = sum/2;
		return result;
	}
		// 3. ���ϱ� �޼ҵ�
	int plus(int x, int y) {
		int result = x + y;
		return result;
	}
		// 4. ������ �޼ҵ�
	void println(String message) {
		System.out.println(message);
	}
}
