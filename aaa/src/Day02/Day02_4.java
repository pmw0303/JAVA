package Day02;

public class Day02_4 {

	public static void main(String[] args) {
		
		//������
		
		//���, ��, ��, ����, ����, ����[����]
		 
		
		// ���������
		int no1 = 10; int no2 = 20;
		System.out.println("�� : " + no1+no2); // ���ڿ� + ���� -> ���� ������
		System.out.println("�� : " + (no1+no2));// ���ڿ� + (���� + ����) -> ���
		System.out.println("�� : " + (no1-no2));
		System.out.println("�� : " + (no1*no2));
		System.out.println("�� : " + (no1/no2));
		System.out.println("�� : " + (no1%no2));
		
		// ����������
		no1++;
		System.out.println(no1);
		no1--;
		System.out.println(no1);
		System.out.println("�������� : " + ++no1);
		System.out.println("�������� : " + no1++);
		
		//�񱳿�����
		System.out.println("�̻� : " +(no1>=no2));
		System.out.println("���� : " +(no1<=no2));
		System.out.println("�ʰ� : " +(no1>no2));
		System.out.println("�̸� : " +(no1>no2));
		System.out.println("���� : " +(no1==no2));
		System.out.println("�����ʴ� : " +(no1!=no2));
		
		//��������
			// and && : 2�� �̻��� �񱳿����ڰ� ��� true -> true �ƴϸ� false
			// or || : 2�� �̻��� �񱳿����ڰ� �ϳ��� true -> true �ƴϸ� false
		
		int no3 = 30; int no4 = 40;
		System.out.println("and : " + (no1 >= no2 && no4 >= no3));
		System.out.println("or : " + (no1 >= no2 || no4 >= no3));
		System.out.println("not : " + !(no1 >= no2 || no4 >= no3));
		
		//���Կ�����
		no1 = no1 + 10; System.out.println(no1);
		no1 += 10; System.out.println(no1);
		
		System.out.println("no1 = " + (no1-=10));
		System.out.println("no1 = " + (no1/=10));
		
		//���ǿ�����
		int score = 85;
		char grade = score > 90 ? 'A' : 'B';
			// ���ǽ� ? �� : ����
	
		System.out.println("��� : " + grade);
		char grade2 = score > 90 ? 'A' : score > 80 ? 'B' : 'C';
		System.out.println("��� : " + grade2);
		
	}
}
