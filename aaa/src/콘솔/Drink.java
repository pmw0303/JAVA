package �ܼ�;

import java.util.ArrayList;

public class Drink{
	
	static int �ڱ� = 10000 ;
	static int �ݶ� = 0 ;
	static int ���̴� = 0 ;
	static int ȯŸ = 0 ;
	static int ����� = 0 ;
	static long ���۽ð� = System.currentTimeMillis();
	static int �ð����� = 1 ;
	static int ���Ƚ�� = 0 ;
	static ArrayList<String> �޽��� = new ArrayList<>();
	
	
	public static void main(String[] args) {

		for(int i = 1 ; i <=5 ; i++) {
			�޽���.add(" ");
		}
		Controller.����ȭ�����();
		
		
		Btn buttons = new Btn();
	    buttons.showButton();
		
		// ���� �ð� ����
		// static �ʵ� ���� �ڱ�, �������, �ӵ�����
		TimeCheck timecheck = new TimeCheck();
//		Music ������� = new Music("�������.mp3",true);
		Buy buy1 = new Buy("�ݶ�");
		Buy buy2 = new Buy("ȯŸ");
		Buy buy3 = new Buy("���̴�");
		Buy buy4 = new Buy("�����");


//		�������.start();
		timecheck.start();
		buy1.start();
		buy2.start();
		buy3.start();
		buy4.start();
		Controller.ȭ����¸޼ҵ�();

		GameOver.Go();
		

			// ���ᱸ�Ÿ޼ҵ�(�μ� : �ӵ�����  			��ȯ : X (������� ���������Ͽ� ��� ����))     o
			// ȭ����¸޼ҵ�(�μ� : �������, �ڱ�		��ȯ : X)         o
			// �ð�üũ�޼ҵ�(�μ� : ����ð�   			��ȯ : �ӵ�����)     o
			
			
		// if ���Ƚ��3ȸ�� break ��������
	}
		
}
