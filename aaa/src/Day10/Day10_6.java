package Day10;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Day10_6 {
	
	// ����ó�� : �ڹ� �� �޸� -> ���� �����ġ
	// DBó�� : �ڹ� �� �޸� -> DB ���� [PC]
		// FileOutputStream : ���� ��� Ŭ����
			// ��ü��.write(byte ��);
		// FileInputStream : ���� �Է� Ŭ����
			// ��ü��.read(byte �迭);
		// String Ŭ����
			// ���ڿ�.equals() : ���ڿ� �� �޼ҵ�
			// ���ڿ�.getBytes() : ���ڿ� -> ����Ʈ�� ��ȯ
			// new String[����Ʈ�迭] : ����Ʈ�迭 -> ����
	
	public static void main(String[] args) throws IOException {
		// ** �Ѵ� byte�� �ۿ� �ȵ� **
		
		// 1. ���� ���(�����ϱ�)
		FileOutputStream ������� = new FileOutputStream("D:/�ڹ�/java.txt");
		// FileOutputStream : ���� ��� Ŭ����
		// FileOutputStream( ���ϰ��/���ϸ�.Ȯ����) 
		String ���� = "�Էµ� ������";
		�������.write(����.getBytes()); 
		
		// 2. ���� �Է�(�޾ƿ���)
		FileInputStream �����Է� = new FileInputStream("D:/�ڹ�/java.txt");
		byte[] bytes = new byte[1000]; 
				�����Է�.read(bytes);
				System.out.println("���ϳ��� : " + new String(bytes));
	}

}
