package Day02;

public class Day02_2 {
	
	public static void main(String[] args) {
		
		byte var1 = -128;
		System.out.println(var1);
		
		byte var2 = -30;
		System.out.println(var2);
		
		byte var3 = 30;
		System.out.println(var3);
		
		byte var4 = 'j';
		System.out.println(var4);
		
		char c1 = 'a';
		System.out.println(c1);
		
		char c2 = 97;
		System.out.println(c2);
		
		char c3 = '\u0041';
		System.out.println(c3);
		
		char c4 = '��';
		System.out.println(c4);
		
		char c5 = 44032;
		System.out.println(c5);
		
		char c6 = '\uac00';
		System.out.println(c6);
		// ���� : ��ǻ�Ͱ� 2������ ����ϸ� ǥ�� ������ ���� -> ǥ������ �پ缺
		// 2���� : 0,1 / 8���� : 0~7 / 10���� : 0~9 / 16���� : 0~9 abcdef
		
		//short : +- �� 3��
		short num1 = 30000; System.out.println(num1);
		//short num2 = 40000; System.out.println(num2);
		
		//int : +- �� 20��
		int num2 = 10; System.out.println(num2); // 10����
		int num3 = 012; System.out.println(num3); // 8������ �տ� 0 ����
		int num4 = 0xA; System.out.println(num4); // 16������ �տ� 0x
		
		//long : 8����Ʈ ���� +- 20���̻�
		long num5 = 100000000L; System.out.println(num5);
		
		//float : 4����Ʈ[������ �ڿ� f] 9�ڸ����� / double(�Ǽ� �⺻ Ÿ��) : 8����Ʈ 17�ڸ�����
		double num6 = 3.14; System.out.println(num6);
		float num7 = 3.14f; System.out.println(num7);
		
		double num8 = 0.1212411951042180421082014102412084; System.out.println(num8);
		
		
	}

}
