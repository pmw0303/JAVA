package Day12;

import java.io.IOException;
import java.util.Arrays;

public class Day12_1 {

	public static void main(String[] args) throws IOException {
		
		// p496
			// String Ŭ����
				// 1. java.lang ��Ű�� [import] �Ҽ�
				// 2. ��ü�ε� �ڵ� ���ͷ� [��ü�� �ڵ� ����]
				// 3. 13���� ������ [���ڿ�, ����Ʈ�� ��]
				// 4. �ܺ� [����, ��Ʈ��ũ ��]�� ���� �����ʹ� ���� ����Ʈ��
		
		// p497
		// 1. ���� �� ����Ʈ�� ������ �� �ִ� ����Ʈ �迭 ����
		byte[] bytes = {72,101,108,108,111,32,74,97,118,97};
		// 2. ����Ʈ �迭 -> ���ڿ� ��ȯ
		String str1 = new String(bytes);
		
		// 3. Ȯ��	
		System.out.println("����Ʈ �迭 -> " + str1);
		
		// 4. Ư�� ��ġ���� ��ȯ
		String str2 = new String(bytes, 6, 4);
		// new String( �迭��, �����ε���, ����)
		System.out.println("����Ʈ �迭 -> " + str2);
		
		// p498
			// System.out : �ý���Ŭ������ ���
			// System.in : �ý���Ŭ������ �Է�
		byte[] bytes2 = new byte[100];
		
		System.out.println("�Է�"); // ����ʵ� �� print�޼ҵ� ȣ��
		int readByteNo = System.in.read(bytes2);
		
		System.out.println("�Է¹��� ����Ʈ" + Arrays.toString(bytes2));
		
		String str3 = new String(bytes2, 0, readByteNo-2);
		System.out.println(str3);
		
	}
}
