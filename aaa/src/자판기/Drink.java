package ���Ǳ�;

import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Label;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.Scanner;


public class Drink extends KeyBoard{
	
	public static void main(String[] args) { // �޽��� �ε����� ���� �ְ� �߰�
		Scanner scanner = new Scanner(System.in);

	    
		while(true) { // ����ȭ�� �ݺ��� ���� [�������� : 1�����ý�]
			while(true) {
				Controller.�޽�����ŷ���¸޼ҵ�(); // �޽����� ��ŷ ����Ʈ�� null�����Ұ�� NullPointer ���� �߻� ����
				Controller.load(); // ��ũ ���� ����� ���� �ҷ�����
				Picture.����ȭ��(); // ����ȭ�� ��� �޼ҵ�
				try {
					System.out.println("\t\t\t1.���ӽ���\t2.��������"); 
					System.out.print("\t\t\t���� >> "); int ch = scanner.nextInt();
					scanner.nextLine(); // �������� ȭ��� ����Ű����� ���� nextLine ���
					if(ch==1) {
						break; // ����ȭ��
					}
					else if(ch==2) {
						Picture.��ũ���(); // ��ũ ��� �޼ҵ�
						System.out.println("\t\t\t���ܰ�� ���ư��÷��� �ƹ�Ű�� �����ּ���..");
						scanner.nextLine();
					}
					else {
						
					}
				}
				catch(Exception e) { //
					System.out.println("�˸�) �߸��� �Է��Դϴ�.");
					scanner = new Scanner(System.in);
				}
			}			
			Picture.����ī��Ʈ(); // ī��Ʈ�ٿ� ��¸޼ҵ�	
			Controller.���۽ð� = System.currentTimeMillis(); // ���۽ð� ����
			//currentTimeMillis ������  ���۽ð��� 1/1000�� ������ �˷���  1/10���� ���� ǥ�����ִ� nanoTime�� �ʿ䰡 ������
			TimeCheck timecheck = new TimeCheck(); // �ð� üũ ��ü ����
			Music ������� = new Music("�������.mp3",true); // ���������� ��ü ����
			Buy buy1 = new Buy("�ݶ�"); // ��ǻ�� �ݶ� ���� ��ü ����
			Buy buy2 = new Buy("ȯŸ"); // ��ǻ�� ȯŸ ���� ��ü ����
			Buy buy3 = new Buy("���̴�"); // ��ǻ�� ���̴� ���� ��ü ����
			Buy buy4 = new Buy("�����"); // ��ǻ�� ����� ���� ��ü ����
			
			

			
			
//			Ű����� ���� ä���
//			Frame f = new Frame("Demo");
//			f.setLayout(new FlowLayout());
//			f.setSize(500, 500);
//			Label l = new Label();
//			l.setText("�������Դϴ�..");
//			f.add(l);
//			f.setVisible(true);
//			f.setLocation(200, 200);
//			f.setAlwaysOnTop(true); // �׻� ����
//			// Creating and adding the key listener
//			KeyBoard k = new KeyBoard();
//			f.addKeyListener(k);
////////////////////////////////////////////////
			
			
			Btn buttons = new Btn(); // ��ư��ü ����
			buttons.showButton(); // ��ư ����
			�������.start();	// ���������� ������ ���� (thread 1)
			timecheck.start(); // �ð�üũ ������ ���� (thread 2)
			buy1.start(); // ��ǻ�� �ݶ� ���� ������ ���� (thread 3)
			buy2.start(); // ��ǻ�� ȯŸ ���� ������ ���� (thread 4)
			buy3.start(); // ��ǻ�� ���̴� ���� ������ ���� (thread 5)
			buy4.start(); // ��ǻ�� ����� ���� ������ ���� (thread 6)
			Picture.ȭ����¸޼ҵ�(); // ȭ����¸޼ҵ� while ���ѷ��� (main thread)
			
			/////////////////////////���ӿ���////////////////////////////////////////
			
			buttons.closeButton(); // ���ӿ����� ��ư ����
			Picture.gameover(); // ���ӿ���ȭ�� ��� �޼ҵ�
			�������.close(); // ������� ������ ����
			timecheck.setStop(true); // �ð�üũ ������ ����
			buy1.setStop(true); // ���� ������ ����
			buy2.setStop(true); // ���� ������ ����
			buy3.setStop(true); // ���� ������ ����
			buy4.setStop(true); // ���� ������ ����
			
			Controller.���Ӹ��¸޼ҵ�(); // �ڱ�, ���� ���, ���Ƚ��, �ð����� ���� �ʱⰪ����
			long ����ð� = System.currentTimeMillis(); // ��ũ������ ���� ����ð� Ȯ��
			long ���ӽð� = (����ð�-Controller.���۽ð�)/1000; // �� ���ӽð��� ������ ����
			
			System.out.println();
			
			int result = Controller.��ũ����(���ӽð�); // ��ũ �����޼ҵ�
			if(result<=9) { // ������ 10���̻��϶� ��ũ��� (�ε��� �̹Ƿ� 0~9)
				System.out.println(" �����մϴ�!! " + (result+1) + "�� �Դϴ�!!");
				System.out.print("�̸��� �Է����ּ��� : "); String �̸� = scanner.nextLine();
				System.out.print("�ڸ�Ʈ�� �Է����ּ��� : "); String �ڸ�Ʈ = scanner.nextLine();
				Controller.��ũ���(result, ���ӽð�, �̸�, �ڸ�Ʈ);
			}
			Controller.save(); // ��ũ���� ���� ����޼ҵ�
			
		}	
	}
		
}
