package Day06;

public class Day06_5 {

	public static void main(String[] args) {
		
		// 1. ������ڷ� ��ü ����
		Korean k1 = new Korean();
			// 2. ��ü ���� �� �ʵ� �� ����
			k1.name = "ȫ�浿";
			k1.ssn = "123213-123123";
		
			System.out.println(k1.nation);
			System.out.println(k1.name);
			System.out.println(k1.ssn);
			
		// 2. �ʵ� 2���� ���� �����ڷ� ��ü ����	
		Korean k2 = new Korean("���ڹ�", "011111-1234567");
		
		System.out.println(k2.nation);
		System.out.println(k2.name);
		System.out.println(k2.ssn);
		System.out.println();
		//////////////////////////////////////////////////
		// 1. �� ������ ��ü
		Korean �ѱ���1 = new Korean();
		// �ѱ��� 1 ���� ���ѹα� / �̸�, �ֹι�ȣ X
		
		// 2. �ʵ� 1�� ������ ��ü ����
		Korean �ѱ���2 = new Korean("ȫ�뵿");
		// �ѱ��� 2 ���� ���ѹα� / �̸� ȫ�浿 / �ֹι�ȣ X
		
		// 3. �ʵ� 2�� ������ ��ü ����
		Korean �ѱ���3 = new Korean("�Ӳ���", "123456-123456");
		// �ѱ��� 3 ���� ���ѹα� / �̸� �Ӳ��� / �ֹι�ȣ O
		
		// 4. �ʵ� 3�� ������ ��ü ����
		Korean �ѱ���4 = new Korean("�̱�", "��Ƽ��", "999");
		// �ѱ��� 4 ���� �̱� / �̸� ��Ƽ�� / �ֹι�ȣ O
		
		System.out.print(�ѱ���1.nation + "\t");
		System.out.print(�ѱ���1.name + "\t");
		System.out.print(�ѱ���1.ssn + "\t");
		
		System.out.println();
		
		System.out.print(�ѱ���2.nation + "\t");
		System.out.print(�ѱ���2.name + "\t");
		System.out.print(�ѱ���2.ssn + "\t");
		
		System.out.println();
		
		System.out.print(�ѱ���3.nation + "\t");
		System.out.print(�ѱ���3.name + "\t");
		System.out.print(�ѱ���3.ssn + "\t");
		
		System.out.println();
		
		System.out.print(�ѱ���4.nation + "\t");
		System.out.print(�ѱ���4.name + "\t");
		System.out.print(�ѱ���4.ssn + "\t");
		
		
		
		
	}
}
