package Day15;

public class �л� extends ���{
	
	// �ʵ�
	String name;
	
	// ������
	public �л�(String name) {
		super(name);
		this.name = name;
	}
	
	// �޼ҵ�
	@Override // �θ�Ŭ���� �� ������ �޼ҵ� �̸� 
	public void �̸�ȣ��() {
		System.out.println("�ڽ� : " + this.name + "[this]");
		// ��� ������ ��Ŭ������ ���� �ʵ尡
		// �θ�Ŭ������ �����ϸ� ��밡��
		System.out.println("�ڽ� : " + super.name + "[super]");
	}

}
