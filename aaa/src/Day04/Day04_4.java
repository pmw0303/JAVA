package Day04;

public class Day04_4 {

	public static void main(String[] args) {
		
//		������ ���� 1�� -> ����
//		�迭 [Ư��(�ε���) �������� ����]
//					1. �ε��� ; ����Ǵ� ����(0�� ~)
//					2. [ ] ; ���ȣ
//					3. ������ �ڷ���
		
//		���� 
//			1. �ڷ���[] �迭��; 2. �ڷ��� �迭��[];
//			3. �ڷ���[] �迭�� = { ������1, ������2, ... };
//			4. �ڷ���[] �迭�� = new �ڷ���[����];
		
//		������ ȣ��
//			�迭�� : �迭 �޸� �ּҰ�
//			1. �迭��[�ε��� ��ȣ] : �ش� �ε��� ��ȣ�� ������ ȣ��
//		������ ����[����]
//			1. �迭��[�ε��� ��ȣ] = ���ο� ������
//		�迭 ����
//			1. �迭��.length : �迭 ���� [���� ����]
//		for �迭 Ȱ��
//			for( �ڷ��� �ӽú��� : �迭�� ) { }
//			�迭 �� 0��°���� ������ ȣ��
				
		int[] scores = {83, 90, 87};
		
		System.out.println("scores[0] : " + scores[0]);
		System.out.println("scores[1] : " + scores[1]);
		System.out.println("scores[2] : " + scores[2]);
					
					
		int sum = 0;
		for(int i=0 ; i < 3 ; i++) {
			
			sum += scores[i];
			System.out.println("scores["+i+"] : " + sum);
		}
		
		double avg = (double)sum/3;
		System.out.println(" ���� : " + sum);
		System.out.println(" ��� : " + avg);
		
		
		int[] array = new int[3];
//			int[] : int�� �迭����
//			�����迭1 : �迭�̸�[�ƹ��ų�]
//			new : �޸� �Ҵ� (��ü, �迭���� ���)
//			int[3] : �ڷ���[����] ���� ����
		
		for(int i = 0 ; i < 3 ; i++) { // ������ �ֱ� ��
			System.out.println(array[i]);
		}
		
		array[0] = 100; array[1] = 32; array[2] = 25;
		
		
		for(int i = 0 ; i < array.length ; i++) { // ������ ���� ��   i < 3 -> i < array.length
			System.out.println(array[i]);
		}
		
		// ���� for
		for(int temp : array) {
			System.out.println(temp);
		}
		
		
		
		
	}
}
