package ���Ǳ�;

import java.text.DecimalFormat;

public class Picture {
	
	public static void cls() { // �ݺ������� ����� �о�� �����̴°�ó�� ǥ���ϱ� ���� �ݺ��� ��¸޼ҵ�
		for(int i = 1 ; i <= 60; i++) { // 60�� ��� �ݺ���
			System.out.println();
		}
	}
	
	 public static void ����ȭ��() {
		 	for(int i = 1 ; i <= 34 ; i++) {
		 		System.out.println();
		 	}
			System.out.println("\t\t\t������������������������������������������������������");
			System.out.println("\t\t\t��         ȭ�������۾�        ��");
			System.out.println("\t\t\t������������������������������������������������������");
			System.out.println("\t\t�ܼ�â�� �ִ�ȭ ���ֽð� ȭ�������۾� �ڽ��� ������ �ʵ��� ȭ���� Ȯ�����ּ���");
			System.out.println(); //�ܼ�â�� �˸��� ������� �����ϵ��� �ϴ� ��ġ 
			System.out.println();
			
			System.out.println("\t\t\t********* ���Ǳ� ���� *********");
			System.out.println("\t\t\t     ���Ǳ⿡ ������� ���ڶ�   ");
			System.out.println("\t\t\t     �Ǹ����� ���ϸ� ����Դϴ�   ");
			System.out.println("\t\t\t         �� ä���ּ���!        ");
			System.out.println("\t\t\t*****************************");

	 }
	
	public static void ȭ����¸޼ҵ�() { // ȭ�� ��� �޼ҵ�
		DecimalFormat df = new DecimalFormat("#,##0"); // �ڱ� ������� ����
		while(true) { // ���ѷ��� [���� ���� : ���Ƚ�� 4ȸ�̻�]
			if(Controller.���Ƚ��>=4) {  // ���Ƚ�� 4ȸ �̻�� ���� ������ ����
				break;
			}
			for(int i = 0 ; i < 2 ; i++) { // ���Ǳ� ���ڿ� ��¦�̴� ȿ�� �ֱ����� 2���� ȭ������ ������ ����
				if(i == 0) {
					cls(); // ȭ�� �о�� �޼ҵ�
					String money = df.format(Controller.�ڱ�); // �ڱ��� ������� �����Ͽ� ���ڿ��� ����
					System.out.println("  ���������������������������������������������������������������������������������������������������������������������������� ");
					System.out.println("  ��                                                            �� ");
					System.out.println("  ��     �����������   ��       ���������   ��     ���������   ��     �� ");
					System.out.println("  ��         ���       ��         ��  ��     ����          ��   ��     �� ");
					System.out.println("  ��         ���       ��         ��  ��     ��           ��    ��     �� ");
					System.out.println("  ��        ��  ��      ����     ���������   ��          ��     ��     �� ");
					System.out.println("  ��       ��    ��     ��                            ��      ��     ��        ***********************************");
					System.out.printf ("  ��      ��      ��    ��         ��                 ��       ��     ��                       �˸���                 \n");
					System.out.printf ("  ��     ��        ��   ��         ��                ��        ��     ��        %-15s ��� Ƚ��:%s              \n","Level : " + Controller.�ð�����,Controller.���Ƚ��);
					System.out.printf ("  ��                  ��         ������������     ��         ��     ��        %-30s              \n",Controller.�޽���.get(4)); // ���ڿ� �ε����� ����� ���� ���
					System.out.printf ("  ��                                                            ��        %-30s              \n",Controller.�޽���.get(3)); // ���ڿ� �ε����� ����� ���� ���
					System.out.printf ("  ��                                                            ��        %-30s              \n",Controller.�޽���.get(2)); // ���ڿ� �ε����� ����� ���� ���
		            System.out.printf ("  ��        COLA         FANTA        CIDER      RED BULL       ��        %-30s              \n",Controller.�޽���.get(1)); // ���ڿ� �ε����� ����� ���� ���
		            System.out.printf ("  ��     ����������������������  ����������������������  ����������������������  ����������������������     ��        %-30s              \n",Controller.�޽���.get(0)); // ���ڿ� �ε����� ����� ���� ���
		            System.out.println("  ��     ��         ��  �� ###     ��  ��    #    ��  ��####��    ��     ��        ***********************************");
		            System.out.println("  ��     ��COCA COLA��  ��  ###    ��  ��# # # # #��  ��####��    ��     �� ");
		            System.out.println("  ��     ��     ####��  ��         ��  ��  # # #  ��  ��####��    ��     ��                      ���� �ڱ�  ");
		            System.out.println("  ��     ��####*####��  �� F A N   ��  ��# # # # #��  ��    ��####��     ��                      " + money);
		            System.out.println("  ��     ��####*    ��  ��     T A ��  ��    #    ��  ��    ��####��     �� ");
		            System.out.println("  ��     ��         ��  ��         ��  ��  CIDER  ��  ��    ��####��     �� ");
					System.out.println("  ��     ����������������������  ����������������������  ����������������������  ����������������������     ��                      ��ư��ġ");
					System.out.printf ("  ��        %3d          %3d           %3d          %3d         ��        ����������������������������������������������������������������������\n",Controller.�ݶ�,Controller.ȯŸ,Controller.���̴�,Controller.�����);	
					System.out.print  ("  ��                                                            ��        ��                                 ��\n");
					System.out.print  ("  ��                                                            ��        ��                                 ��\n");
					System.out.print  ("  ��                                               (|) (��)      ��        ��                                 ��\n");
		            System.out.print  ("  ��       ###  ####   ###  #   # ####              #####       ��        ��                                 ��\n");
		            System.out.print  ("  ��      #   # #   # #   # #   # #   #             #           ��        ��                                 ��\n");
		            System.out.print  ("  ��      # ### ####  #   # #   # ####              ####        ��        ��                                 ��\n");
		            System.out.print  ("  ��      #   # #   # #   # #   # #                     #       ��        ��                                 ��\n");
		            System.out.print  ("  ��       #### #   #  ###   ###  #                 ####        ��        ��                                 ��\n");
					System.out.print  ("  ��     ����������������������������������������������������������������������������������������������������     ��        ����������������������������������������������������������������������\n");
					System.out.println("  ��     ��                                                ��     �� ");
					System.out.println("  ��     ��                                                ��     �� ");
					System.out.println("  ��     ��                                                ��     �� ");
					System.out.println("  ��     ����������������������������������������������������������������������������������������������������     �� ");
					System.out.println("  ���������������������������������������������������������������������������������������������������������������������������� ");
				}
				else {
					cls();
					String money = df.format(Controller.�ڱ�);
					System.out.println("  ���������������������������������������������������������������������������������������������������������������������������� ");
					System.out.println("  ��                                                            �� ");
					System.out.println("  ��     �����������   ��       ���������   ��     ���������   ��     �� ");
					System.out.println("  ��         ���       ��         ��  ��     ����          ��   ��     �� ");
					System.out.println("  ��         ���       ��         ��  ��     ��           ��    ��     �� ");
					System.out.println("  ��        ��  ��      ����     ���������   ��          ��     ��     �� ");
					System.out.println("  ��       ��    ��     ��                            ��      ��     ��        ***********************************");
					System.out.printf ("  ��      ��      ��    ��         ��                 ��       ��     ��                       �˸���                 \n");
					System.out.printf ("  ��     ��        ��   ��         ��                ��        ��     ��        %-15s ��� Ƚ��:%s              \n","Level : " + Controller.�ð�����,Controller.���Ƚ��);
					System.out.printf ("  ��                  ��         ������������     ��         ��     ��        %-30s              \n",Controller.�޽���.get(4));
					System.out.printf ("  ��                                                            ��        %-30s              \n",Controller.�޽���.get(3));
					System.out.printf ("  ��                                                            ��        %-30s              \n",Controller.�޽���.get(2));
		            System.out.printf ("  ��        COLA         FANTA        CIDER      RED BULL       ��        %-30s              \n",Controller.�޽���.get(1));
		            System.out.printf ("  ��     ����������������������  ����������������������  ����������������������  ����������������������     ��        %-30s              \n",Controller.�޽���.get(0));
		            System.out.println("  ��     ��         ��  �� ###     ��  ��    #    ��  ��####��    ��     ��        ***********************************");
		            System.out.println("  ��     ��COCA COLA��  ��  ###    ��  ��# # # # #��  ��####��    ��     �� ");
		            System.out.println("  ��     ��     ####��  ��         ��  ��  # # #  ��  ��####��    ��     ��                      ���� �ڱ�  ");
		            System.out.println("  ��     ��####*####��  �� F A N   ��  ��# # # # #��  ��    ��####��     ��                      " + money);
		            System.out.println("  ��     ��####*    ��  ��     T A ��  ��    #    ��  ��    ��####��     �� ");
		            System.out.println("  ��     ��         ��  ��         ��  ��  CIDER  ��  ��    ��####��     �� ");
					System.out.println("  ��     ����������������������  ����������������������  ����������������������  ����������������������     ��                      ��ư��ġ");
					System.out.printf ("  ��        %3d          %3d           %3d          %3d         ��        ����������������������������������������������������������������������\n",Controller.�ݶ�,Controller.ȯŸ,Controller.���̴�,Controller.�����);	
					System.out.print  ("  ��                                                            ��        ��                                 ��\n");
					System.out.print  ("  ��                                                            ��        ��                                 ��\n");
					System.out.print  ("  ��                                               (|) (��)      ��        ��                                 ��\n");
		            System.out.print  ("  ��       ###  ####   ###  #   # ####              #####       ��        ��                                 ��\n");
		            System.out.print  ("  ��      #   # #   # #   # #   # #   #             #           ��        ��                                 ��\n");
		            System.out.print  ("  ��      # ### ####  #   # #   # ####              ####        ��        ��                                 ��\n");
		            System.out.print  ("  ��      #   # #   # #   # #   # #                     #       ��        ��                                 ��\n");
		            System.out.print  ("  ��       #### #   #  ###   ###  #                 ####        ��        ��                                 ��\n");
					System.out.print  ("  ��     ����������������������������������������������������������������������������������������������������     ��        ����������������������������������������������������������������������\n");
					System.out.println("  ��     ��                                                ��     �� ");
					System.out.println("  ��     ��                                                ��     �� ");
					System.out.println("  ��     ��                                                ��     �� ");
					System.out.println("  ��     ����������������������������������������������������������������������������������������������������     �� ");
					System.out.println("  ���������������������������������������������������������������������������������������������������������������������������� ");
				}
				try {
					Thread.sleep(160);
				}
				catch (Exception e) {}

			}
			
		}
	} // ��¸޼ҵ� end
	
	public static void ����ī��Ʈ() {
		for(int i = 0 ; i <= 5 ; i++) {
			cls();
			if(i==0) {
				System.out.println();
				System.out.println();
				System.out.println();
				System.out.println();
				System.out.println();
				System.out.println();
				try {Thread.sleep(1000);}catch(Exception e) {}
			}
			else if(i==1) {			
				System.out.println("\t\t\t          �ƢƢƢƢƢƢƢƢƢ�         ");
				System.out.println("\t\t\t          �Ƣ�                 ");
				System.out.println("\t\t\t          �ƢƢƢƢƢƢƢƢƢ�         ");
				System.out.println("\t\t\t                  �Ƣ�         ");
				System.out.println("\t\t\t                  �Ƣ�         ");
				System.out.println("\t\t\t          �ƢƢƢƢƢƢƢƢƢ�         ");
				
				try {Thread.sleep(1000);}catch(Exception e) {}
			}
			else if(i==2) {
				System.out.println("\t\t\t          �Ƣ�     �Ƣ�          ");
				System.out.println("\t\t\t          �Ƣ�     �Ƣ�          ");
				System.out.println("\t\t\t          �Ƣ�     �Ƣ�          ");
				System.out.println("\t\t\t          �ƢƢƢƢƢƢƢƢƢ�         ");
				System.out.println("\t\t\t                 �Ƣ�          ");
				System.out.println("\t\t\t                 �Ƣ�          ");
				try {Thread.sleep(1000);}catch(Exception e) {}
			}
			else if(i==3) {
				System.out.println("\t\t\t          �ƢƢƢƢƢƢƢƢƢ�         ");
				System.out.println("\t\t\t                  �Ƣ�         ");
				System.out.println("\t\t\t          �ƢƢƢƢƢƢƢƢƢ�         ");
				System.out.println("\t\t\t                  �Ƣ�         ");
				System.out.println("\t\t\t                  �Ƣ�         ");
				System.out.println("\t\t\t          �ƢƢƢƢƢƢƢƢƢ�         ");
				try {Thread.sleep(1000);}catch(Exception e) {}
			}
			else if(i==4) {
				System.out.println("\t\t\t          �ƢƢƢƢƢƢƢƢƢ�         ");
				System.out.println("\t\t\t                  �Ƣ�         ");
				System.out.println("\t\t\t          �ƢƢƢƢƢƢƢƢƢ�         ");
				System.out.println("\t\t\t          �Ƣ�                 ");
				System.out.println("\t\t\t          �Ƣ�                 ");
				System.out.println("\t\t\t          �ƢƢƢƢƢƢƢƢƢ�         ");
				try {Thread.sleep(1000);}catch(Exception e) {}
			}
			else if(i==5) {
				System.out.println("\t\t\t              �Ƣ�             ");
				System.out.println("\t\t\t            �ƢƢƢ�             ");
				System.out.println("\t\t\t              �Ƣ�             ");
				System.out.println("\t\t\t              �Ƣ�             ");
				System.out.println("\t\t\t              �Ƣ�             ");
				System.out.println("\t\t\t          �ƢƢƢƢƢƢƢƢƢ�         ");
				try {Thread.sleep(1000);}catch(Exception e) {}
			}
		}
	}
	
	 public static void gameover() {
	      System.out.println();      
	      System.out.println("   ##########       ######      ####    ####   ############");
	      System.out.println("  ############     ########     #####  #####   ############");
	      System.out.println("  ####    ####   ####    ####   ############   ####");
	      System.out.println("  ###            ####    ####   ##  ####  ##   ############");
	      System.out.println("  ###    #####   ############   ##  ####  ##   ############");
	      System.out.println("  ####      ##   ############   ##  ####  ##   ####");
	      System.out.println("  ############   ####    ####   ##  ####  ##   ############");
	      System.out.println("   ##########    ####    ####   ##  ####  ##   ############");
	      System.out.println();
	      System.out.println("     ######      ####    ####   ############   ##########");
	      System.out.println("   ####  ####    ####    ####   ############   ####  #####");
	      System.out.println("  ####    ####   ####    ####   ####           ###    #####");
	      System.out.println("  ###      ###   ####    ####   ############   ####  #####");
	      System.out.println("  ###      ###   ####    ####   ############   ##########");
	      System.out.println("  ####    ####    ####  ####    ####           ###    ###");
	      System.out.println("   ####  ####      ########     ############   ###     ###");
	      System.out.println("     ######          ####       ############   ###      ###");
	   }
	 
	 public static void ��ũ���() { // ��ũ ��� �޼ҵ�
		cls();
		System.out.println("\t\t\t---------------- ����ǥ ----------------");
		System.out.println("\t\t\t��ŷ\t�̸�\t�÷��̽ð�\t�ڸ�Ʈ");
		for(int i = 0 ; i < 10 ; i++) {
		System.out.println("\t\t\t"+(i+1)+"\t"+ Controller.��ŷ.get(i).getName()+"\t"+ Controller.��ŷ.get(i).getPlaytime()+"��\t"+ Controller.��ŷ.get(i).getContent());
		}
		System.out.println("\t\t\t---------------------------------------");
	 }

}
