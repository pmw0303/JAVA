package Day13;

import java.util.Random;

public class Day13_1 {
	public static void main(String[] args) {
		
		// p534
		
		// Math.abs ���밪
		
		System.out.println(" ���밪 = " + Math.abs(-5));
		System.out.println(" ���밪 = " + Math.abs(-3.14));
		
		// ceil �ø�
		System.out.println(" �ø� = " + Math.ceil(5.3));
		System.out.println(" �ø� = " + Math.ceil(-5.3));
		
		// ����
		System.out.println(" ���� = " + Math.floor(5.3));
		System.out.println(" ���� = " + Math.floor(-5.3));
		
		// �ִ밪
		System.out.println(" �ִ밪 = " + Math.max(5, 9));
		System.out.println(" �ּҰ� = " + Math.min(5.3, 2.5));
		
		// ������ (0 ~ 1����)
		System.out.println(" ������ = " + Math.random());
		System.out.println(" ������ = " + Math.random()*10);
		
		// ��������� �Ǽ���
		System.out.println(" ����� ������ �Ǽ� = " + Math.rint(5.3));
		System.out.println(" ����� ������ �Ǽ� = " + Math.rint(-6.7));
		
		// �ݿø�
		System.out.println(" �ݿø� = " + Math.round(4.4));
		System.out.println(" �ݿø� = " + Math.round(-3.2));
		
		double value = 12.3456; // �Ҽ� 3��° �ڸ����� �ݿø�
		double temp = value *100;
		long temp2 = Math.round(temp);
		
		double value2 = temp2/100.0;
		System.out.println(value2);
		
		System.out.println(" 0~1 ������ �� : " + Math.random());
		System.out.println(Math.random()*6); // 0 ~ 5.9xxxxxxxxxx
		System.out.println(Math.random()*6 +1);
		
		int num = (int)(Math.random()*6)+1;
		System.out.println(num); // ������ ���� ����ȯ �ؼ� 1 ~ 6
		
		
		Random r = new Random();
		System.out.println(" 1~6 ���� ���� : " + (r.nextInt(6)+1));
		
		
		
		
	}

}
