package Day06;

public class Korean {
	// Korean Ŭ���� ����
	
	// 1. �ʵ�
	String nation = "���ѹα�";
			// ����
	String name;
			// �̸� ���� �ʱ�ȭ X -> NULL
	String ssn;
			// �ֹε�Ϲ�ȣ ���� �ʱ�ȭ X -> NULL 
	
	// 2. ������
		// ����1 : �������̸� == Ŭ�����̸� ����
		// ����2 : �ܺηκ��� ������ �Ű� ��[�μ�] ����
		// ����3 : ������ ������ �̸� ���� �� ����
			// �����ε� : ������ �̸��� ��� �ڵ带 ������
	
	Korean(){
		// ���빰 X
	}
	
	Korean(String n){
		// �ʵ� 1���� ���� ������
		name = n;
		
	}
	
	Korean(String n, String s){
		// �ʵ� 2���� ���� ������
		name = n;
		ssn = s;
	}
	
	Korean(String nation, String name, String ssn){
		// �ʵ� 3���� ���� ������
		this.nation = nation;
		this.name = name;
		this.ssn = ssn;
		
		// ���κ��� ( ���� Ŭ���� �� ���� )
		// �Ű����� ( �ܺηκ��� ���� ���� )
		// ���κ��� == �Ű����� �̸��� �����ϸ� �浹
		// ���κ��� ǥ�� ���
			// this : ����Ŭ���� ǥ��
	}
	
	// 3. �޼ҵ�
	

}
