package Day03;

public class Day03_1 {
	
	// 1���� : ��� , �Է�
			// 2���� : ����(����) , ���(����) 
			// ��� 
				// ��ǻ���� �Ǵܷ�~~ => ����Ǽ� 
				// ���ǽ��� true �̸� ���๮ ó�� 
				// ����  
					// 1.  IF( ���ǽ�[true/false] ) ���๮;
					// 2.  IF( ���ǽ� ) ���๮[��];
					//     ELSE ���๮[����];
					// 3.  ���๮�� 2�� �̻�( ; 2�� �̻��̸� )  {   } ����ó�� 
					// 4.  ����Ǽ� �ټ��϶� [ ������ �ټ��϶� ]
					//	   IF( ����1 ) { ���๮[��1]; }
					//	   ELSE IF( ����2 ) { ���๮[��2]; }
					//	   ELSE IF( ����3 ) { ���๮[��3]; }
					//	   ELSE IF( ����4 ) { ���๮[��4]; }
					//	   ELSE IF( ����5 ) { ���๮[��5]; }
					//     ELSE { ���๮[����]; }
					// 5. if ��ø
					//		IF( ���ǽ� ) { 
					//			IF( ���ǽ� ){ ���๮; }
					//			ELSE { ���๮; } 
					//		}ELSE{
					//			IF( ���ǽ� ){ ���๮; }
					//			ELSE { ���๮; }
					//		}

	public static void main(String[] args) {

		if (3 > 1)
			System.out.println("3�� 1���� ũ��. ");
		// ���� 3�� 1���� ũ�� ��� / �ƴϸ� ���X
		// true ����

		if (3 > 5)
			System.out.println("3�� 5���� ũ��. ");
		// ���� 3�� 5���� ũ�� ���o �ƴϸ� ���X

		if (3 > 1)
			System.out.println("3�� 1���� ũ��. ");
		else
			System.out.println("3�� 1���� �۴�. ");
		// ���� 3�� 1���� ũ�� ���� ��� / �ƴϸ� �ؿ� ���

		if (3 > 5) {
			System.out.println("true");
			System.out.println("3�� 2���� ũ��. ");
		} else {
			System.out.println("false");
			System.out.println("3�� 5���� �۴�. ");
		}

		if (3 > 5) //��� 1��
			System.out.println("3�� 5���� ũ��. ");
		else if (3 > 4)
			System.out.println("3�� 4���� ũ��. ");
		else if (3 > 3)
			System.out.println("3�� 3���� ũ��. ");
		else if (3 > 2)
			System.out.println("3�� 2���� ũ��. ");
		else
			System.out.println("true ����. ");

		
		
		if (3 > 5) //��� ������
			System.out.println("3�� 5���� ũ��. ");
		if (3 > 4)
			System.out.println("3�� 4���� ũ��. ");
		if (3 > 3)
			System.out.println("3�� 3���� ũ��. ");
		if (3 > 2)
			System.out.println("3�� 2���� ũ��. ");
			System.out.println("true ����. ");
	}
}
