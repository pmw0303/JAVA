package Day09;

import java.util.Random;
import java.util.Scanner;

public class Controller { 
	// �ش� Ŭ������ ���� ���� ��Ʈ�ѷ�
	// M : ��[������]
	// V : ��[�����]
	// C : �𵨰� �� ���� ����
	
	// ��ּ� ��û�ϴ� ����[���] ����
//		1. **���»��� C
	public String ���»���(String pw, String name, int bankNo) {
		// 1. �Է¹��� �� �����´�
			// ���¹�ȣ �ڵ�����
		String accNo = null;
		while(true) {
		Random random = new Random(); // 4�ڸ�
		int ���� = random.nextInt(10000); // 0 ~ 9999 ����
		accNo = String.format("%04d", ����);
		// %d : ���� / %4d : 4�ڸ� ���� / %04d : ����ó�� 4�ڸ� ����
		
		// �ߺ�üũ
		Boolean ���¹�ȣ�ߺ� = false;
		for (Bank temp2 : Day09_6_����������α׷�.accList) {
			if (temp2 != null && temp2.getAccNo().equals(accNo)) {
				// ���� �迭 ���� ���¹�ȣ�� �����ϸ�
				���¹�ȣ�ߺ� = true; // ���ѹݺ�
			}
		}if(���¹�ȣ�ߺ� == false) // �ߺ��� ������
			break; // ���ѷ��� ����
	}
		
		
		
		// 2. ��üȭ -> �ټ��� ������ �ϳ��� ��ü�� ����
		Bank temp = null; // �� ��ü ����
		if(bankNo == 1) {
			temp = new KookminBank(accNo, pw, name, 0);
		}else if(bankNo == 2) {
			temp = new ShinhanBank(accNo, pw, name, 0);
		}else if(bankNo == 3) {
			temp = new HanaBank(accNo, pw, name, 0);
		}
		
		// 3. �迭�� ���� [DB/file]
		int i = 0;
		for(Bank temp2 : Day09_6_����������α׷�.accList) {
			if(temp2 == null) {
				Day09_6_����������α׷�.accList[i] = temp;
				System.out.println("+++ ���� ��� +++");
				return accNo; // 
			}
			i++;
		}		
		return null;
	}
//		2. **�Ա� U
	public boolean �Ա�(String accNo, int input) {
		// ������ ���¹�ȣ�� ã�Ƽ�
		int i =0;
		for(Bank temp : Day09_6_����������α׷�.accList) {
			if(temp != null && temp.getAccNo().equals(accNo)) {
				// ������ ���¹�ȣ�� ������ �Ա�
				// ������ ����
				Day09_6_����������α׷�.accList[i].setMoney(temp.getMoney()+input);
												// setter = �����ݾ� + �Աݾ�
				return true;
			}i++;
		}
		// ������ ���¹�ȣ�� ������ �Ա� ����
		return false;
	}
//		3. **��� U
	public int ���(String accNo, String pw, int output) {
		// ������ ���¹�ȣ�� ã�Ƽ�
		int i = 0;
		for(Bank temp : Day09_6_����������α׷�.accList) {
			if (temp != null && temp.getAccNo().equals(accNo) && temp.getPw().equals(pw)) {
				if(temp.getMoney() < output)
				return 1; // �ܾ��� ������ ��ȯ

			} else {
				Day09_6_����������α׷�.accList[i].setMoney(temp.getMoney() - output);
				return 2; // ��� ����
			}
		}
		return 3; // ������ ������ �ƴ� ��� ���и� �ǹ�
		// �ش� ���¹�ȣ�� ��й�ȣ�� ��ġ Ȯ��
		// ��й�ȣ�� ��ġ�ϸ� ���
		// �ƴϸ� ��� ����
		
	}
//		4. **��ü U
	public int ��ü(String accNo, String pw, int ��ü�ݾ�, String �޴°���) {
		// ������ ���¹�ȣ�� ��й�ȣ ��ġ
		// �޴°��� ã��
		// ���ΰ��¿��� ��ü�ݾ� ����
		// �޴°��¿��� ��ü�ݾ� ���ϱ�
		// ���� ��� �� : ���ΰ�������Ʋ��, �޴°�������Ʋ��, �ܰ����
		int i = 0;
		for(Bank temp : Day09_6_����������α׷�.accList) {
			if(temp != null && temp.getAccNo().equals(accNo) 
					&& temp.getPw().equals(pw)) {
				int j =0;
				for(Bank temp2 : Day09_6_����������α׷�.accList) {
					if(temp2 != null && temp.getAccNo().equals(�޴°���)) {
						if(temp.getMoney() < ��ü�ݾ�) {
							// �ܾ׺���
							return 1;
						}else {
							Day09_6_����������α׷�.accList[i].setMoney(temp.getMoney()-��ü�ݾ�);
							Day09_6_����������α׷�.accList[j].setMoney(temp2.getMoney()+��ü�ݾ�);
							return 2; // ����
						}
					}j++;
				}// �޴°��� ����
//				return 3;
			} 
			i++;
		}
		
		return 4;
	}
//		5. **�����¸�� R
	public Bank[] ���¸��(String name) {
		// �Է¹��� �������� ���¸�� ���� ��ȯ
		// ������ ������ ã�Ƽ� �迭�޾� �ѱ��
		Bank[] myAcc = new Bank[100]; // �迭 ����
		for(Bank temp : Day09_6_����������α׷�.accList	) {
			if(temp != null && temp.getName().equals(name)) {
				// �ش� ���³� �����ֿ� �μ��� �����ֿ� �����ϸ�
				// myAcc(�迭)�� �� ������ ã�Ƽ� �� ���¸�Ͽ� �ֱ�
				int i = 0;
				for(Bank temp2 : myAcc) {
					if(temp2 == null) {
						myAcc[i] = temp; 
						break;
					}i++;
				}
			}
		}
		return myAcc;
	}
//		6. **���� U����
	public boolean ����() {
		return false;
	}

} // 7679 1    4242 1
