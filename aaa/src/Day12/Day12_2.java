package Day12;

public class Day12_2 {

	// p499 String Ŭ���� �޼ҵ�

	// charAt() : ���ڿ����� Ư������ ����

	public static void main(String[] args) {
		String ssn = "123456-1876541";
		char s = ssn.charAt(7);

		switch (s) {
		case '1':
		case '3':
			System.out.println("����");
			break;
		case '2':
		case '4':
			System.out.println("����");

		}
		
		// p501 equals() : ���ڿ� ��
			// �⺻�ڷ��� ����ϴ� ������ ������ ��밡�� / ==
			// String Ŭ���� ����ϴ� ��ü�� == ������ ��� �Ұ� / equals
		
		
		
		String strVar1 = new String("�Ź�ö");
		String strVar2 = "�Ź�ö";
		
		if(strVar1 == strVar2) { // �� �ּ� ��
			System.out.println("���� String");
		}else if(strVar1 != strVar2) {
			System.out.println("�ٸ� String");
		}
		
		if(strVar1.equals(strVar2)) { // �� ������ ��
			System.out.println("���� ���ڿ�");
		}else {
			System.out.println("�ٸ� ���ڿ�");
		}
		
		// p502 getBytes() : ���ڿ� -> ����Ʈ�� ��ȯ
		String str = "�ȳ��ϼ���";
		
		byte[] bytes1 = str.getBytes(); // ���ڿ� -> ������Ʈ��
		System.out.println(bytes1.length); // �迭 ����
		
		String str1 = new String(bytes1);
		System.out.println("����Ʈ�� -> ���ڿ� : " + str1);
		try {
		byte[] byte2 = str.getBytes("EUC-KR");
		System.out.println("���� : " +byte2.length);
		String str2 = new String(byte2, "EUC-KR");
		System.out.println("����Ʈ�� -> ���ڿ� : " +str2);
		
		byte[] byte3 = str.getBytes("UTF-8");
		System.out.println("���� : " +byte3.length);
		String str3 = new String(byte3, "UTF-8");
		System.out.println("����Ʈ�� -> ���ڿ� : " +str3);
		System.out.println();
		}catch(Exception e) {
			
		}
		
		String oldStr = "�ڹٴ� ��ü����";
		String newStr = oldStr.replace("�ڹ�", "JAVA");
		
		System.out.println("���� : " + oldStr);
		System.out.println("���ο� : " + newStr);
		System.out.println();
		
		// p507 Substring() vs split() : ���ڿ� �ڸ���
		//     �ε��� ����        ���ڱ���
		String ssn3 = "888888-1111111";
				
		String firstNum = ssn3.substring(0, 6);
		System.out.println(firstNum);
		
		String secondNum = ssn3.substring(7);
		System.out.println(secondNum);
		// split
		System.out.println(ssn3.split("-")[0]); // �պκ� 
		System.out.println(ssn3.split("-")[1]); // �޺κ�
		System.out.println("-------------------------");
		// p508
			// �������ڿ�.toLowerCase() -> ���� [�ҹ���]
			// �������ڿ�.toUpperCase() -> ���� [�빮��]
		
		// p509
			// ���ڿ�.trim() : �������� 
		// p510 valuOf() : �⺻Ÿ�� [int, double ��] -> ���ڿ� ��ȯ
		String str2 = String.valueOf(10); // int�� 10 -> String 10 ���� ��ȯ
		String str3 = String.valueOf(10.5); // double�� 10.5 -> String 10.5 ���� ��ȯ
		String str4 = String.valueOf(true); // boolean�� true -> String true
		String str5 = 10+""; // ����+���� -> ����
		
		System.out.println(str2 + 10);
		System.out.println(str3 + 10);
		// if(str4) -> ���� [��������]
		System.out.println(str4 + 10);
		
		
	}

}
