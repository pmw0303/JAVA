package Day10;

public interface GamePad {

	// 1. ����ʵ�
	// 2. �߻� �޼ҵ�
	public void Abtn(); 
	public void Bbtn();
	public void Cbtn();
			
	// 3. ����Ʈ �޼ҵ�
	default void GamePadEnd() {
		System.out.println("�����е� ����");
	}
	static void Charge() {
		System.out.println("������");
	}
	// 4. ���� �޼ҵ�
}
