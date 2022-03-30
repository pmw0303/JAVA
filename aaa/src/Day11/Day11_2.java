package Day11;

public class Day11_2 {

	// p442
	// ��ǻ�� �ϵ���� ���� ���� [����Ұ�]
	// ������� �߸��� ���� or �������� �߸��� �ڵ�
	// ���� �� 1. �Ϲݿ��� 2. ���࿹��
	// �Ϲݿ��� : ������ �� ���� �˻�
	// ���࿹�� : ������ �� ���� �˻�
	// ����ó��
	// ���� : ������ �߻��ϸ� ���α׷� ���� [������]
	// ���� ������ �߻��ϸ� ��ü �ڵ� ���� [���α׷� ����X]

	public static void main(String[] args) {

		// p423
		try {
			String data = null;
			System.out.println(data.toString()); // toString() : ��ü ���� ���
			// ������ ���� X
			// ���� ���� : null ���̱� ������ �޸� �Ҵ��� ���� / ��� �Ұ�
		} catch (NullPointerException e) {
			System.out.println("���� : " + e);
		}
		// p424
		try {
		String[] �迭 = new String[2];
		�迭[0] = "a"; �迭[1] = "b"; �迭[2] = "c";
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("���� : " + e);
		}
		
		// p426
		try{
		String data1 = "100";
		String data2 = "a100";
		int value1 = Integer.parseInt(data1); // "100" -> 100 O
		int value2 = Integer.parseInt(data2); // "a100" -> a100 X [a�� ���� �Ұ���]
		
		// ���� �߻� ���� : ���ڿ� �� ���������� ��ȯ�� ���������� ���ڿ� �� �������� ��ȯ�� �Ұ��� 
		// ���� �߻� �� catch �̵� [���� �ڵ� ���� X]
		int result = value1 + value2;
		System.out.println(result);
		}catch(NumberFormatException e) {
			System.out.println("���� : " + e);
		}
		
		// p428
		try {
		String ���ڿ� = "���缮";
		Object ���۰�ü;
		
		���۰�ü = ���ڿ�; // �ڽ� -> �θ� O
		���ڿ� = (String)���۰�ü; // �θ� -> �ڽ� X
		}catch(Exception e) {
			System.out.println("���� : " + e);
		}
	}
}
