package �ܼ�;

import java.text.DecimalFormat;

public class Controller extends Thread{

	
	public static void cls() {
		for(int i = 1 ; i <= 60; i++) {
			System.out.println();
		}
	}

	public static void ȭ����¸޼ҵ�() {
		DecimalFormat df = new DecimalFormat("#,##0");
		while(true) {
			if(Drink.���Ƚ��>=4) { 
				break;
			}
			for(int i = 0 ; i < 2 ; i++) {
				if(i == 0) {
					cls();
					String money = df.format(Drink.�ڱ�);
					System.out.println("  ���������������������������������������������������������������������������������������������������������������������������� ");
					System.out.println("  ��                                                            �� ");
					System.out.println("  ��     �����������   ��       ���������   ��     ���������   ��     �� ");
					System.out.println("  ��         ���       ��         ��  ��     ����          ��   ��     �� ");
					System.out.println("  ��         ���       ��         ��  ��     ��           ��    ��     �� ");
					System.out.println("  ��        ��  ��      ����     ���������   ��          ��     ��     �� ");
					System.out.println("  ��       ��    ��     ��                            ��      ��     ��        ***********************************");
					System.out.printf ("  ��      ��      ��    ��         ��                 ��       ��     ��                       �˸���                 \n");
					System.out.printf ("  ��     ��        ��   ��         ��                ��        ��     ��        %-15s ��� Ƚ��:%s              \n","Level : " + Drink.�ð�����,Drink.���Ƚ��);
					System.out.printf ("  ��                  ��         ������������     ��         ��     ��        %-30s              \n",Drink.�޽���.get(4));
					System.out.printf ("  ��                                                            ��        %-30s              \n",Drink.�޽���.get(3));
					System.out.printf ("  ��                                                            ��        %-30s              \n",Drink.�޽���.get(2));
		            System.out.printf ("  ��        COLA         FANTA        CIDER      RED BULL       ��        %-30s              \n",Drink.�޽���.get(1));
		            System.out.printf ("  ��     ����������������������  ����������������������  ����������������������  ����������������������     ��        %-30s              \n",Drink.�޽���.get(0));
		            System.out.println("  ��     ��         ��  �� ###     ��  ��    #    ��  ��####��    ��     ��        ***********************************");
		            System.out.println("  ��     ��COCA COLA��  ��  ###    ��  ��# # # # #��  ��####��    ��     �� ");
		            System.out.println("  ��     ��     ####��  ��         ��  ��  # # #  ��  ��####��    ��     ��                      ���� �ڱ�  ");
		            System.out.println("  ��     ��####*####��  �� F A N   ��  ��# # # # #��  ��    ��####��     ��                      " + money);
		            System.out.println("  ��     ��####*    ��  ��     T A ��  ��    #    ��  ��    ��####��     �� ");
		            System.out.println("  ��     ��         ��  ��         ��  ��  CIDER  ��  ��    ��####��     �� ");
					System.out.println("  ��     ����������������������  ����������������������  ����������������������  ����������������������     ��                      ��ư��ġ");
					System.out.printf ("  ��        %3d          %3d           %3d          %3d         ��        ����������������������������������������������������������������������\n",Drink.�ݶ�,Drink.ȯŸ,Drink.���̴�,Drink.�����);	
					System.out.print  ("  ��                                                            �� 	�� 				  ��\n");
					System.out.print  ("  ��                                                            �� 	�� 				  ��\n");
					System.out.print  ("  ��                                               (|) (��)      ��        ��                                 ��\n");
		            System.out.print  ("  ��       ###  ####   ###  #   # ####              #####       ��        ��                                 ��\n");
		            System.out.print  ("  ��      #   # #   # #   # #   # #   #             ##          ��        ��                                 ��\n");
		            System.out.print  ("  ��      # ### ####  #   # #   # ####              ####        ��        ��                                 ��\n");
		            System.out.print  ("  ��      #   # #   # #   # #   # #                    ##       ��        ��                                 ��\n");
		            System.out.print  ("  ��       #### #   #  ###   ###  #                 ####        ��        ��                                 ��\n");
					System.out.print  ("  ��     ����������������������������������������������������������������������������������������������������     ��	����������������������������������������������������������������������\n");
					System.out.println("  ��     ��                                                ��     �� ");
					System.out.println("  ��     ��                                                ��     �� ");
					System.out.println("  ��     ��                                                ��     �� ");
					System.out.println("  ��     ����������������������������������������������������������������������������������������������������     �� ");
					System.out.println("  ���������������������������������������������������������������������������������������������������������������������������� ");
					System.out.println();
				}
				else {
					cls();
					String money = df.format(Drink.�ڱ�);
					System.out.println("  ���������������������������������������������������������������������������������������������������������������������������� ");
					System.out.println("  ��                                                            �� ");
					System.out.println("  ��     �����������   ��       ���������   ��     ���������   ��     �� ");
					System.out.println("  ��         ���       ��         ��  ��     ����          ��   ��     �� ");
					System.out.println("  ��         ���       ��         ��  ��     ��           ��    ��     �� ");
					System.out.println("  ��        ��  ��      ����     ���������   ��          ��     ��     �� ");
					System.out.println("  ��       ��    ��     ��                            ��      ��     ��        ***********************************");
					System.out.printf ("  ��      ��      ��    ��         ��                 ��       ��     ��                       �˸���                 \n");
					System.out.printf ("  ��     ��        ��   ��         ��                ��        ��     ��        %-15s ��� Ƚ��:%s              \n","Level : " + Drink.�ð�����,Drink.���Ƚ��);
					System.out.printf ("  ��                  ��         ������������     ��         ��     ��        %-30s              \n",Drink.�޽���.get(4));
					System.out.printf ("  ��                                                            ��        %-30s              \n",Drink.�޽���.get(3));
					System.out.printf ("  ��                                                            ��        %-30s              \n",Drink.�޽���.get(2));
		            System.out.printf ("  ��        COLA         FANTA        CIDER      RED BULL       ��        %-30s              \n",Drink.�޽���.get(1));
		            System.out.printf ("  ��     ����������������������  ����������������������  ����������������������  ����������������������     ��        %-30s              \n",Drink.�޽���.get(0));
		            System.out.println("  ��     ��         ��  �� ###     ��  ��    #    ��  ��####��    ��     ��        ***********************************");
		            System.out.println("  ��     ��COCA COLA��  ��  ###    ��  ��# # # # #��  ��####��    ��     �� ");
		            System.out.println("  ��     ��     ####��  ��         ��  ��  # # #  ��  ��####��    ��     ��                      ���� �ڱ�  ");
		            System.out.println("  ��     ��####*####��  �� F A N   ��  ��# # # # #��  ��    ��####��     ��                      " + money);
		            System.out.println("  ��     ��####*    ��  ��     T A ��  ��    #    ��  ��    ��####��     �� ");
		            System.out.println("  ��     ��         ��  ��         ��  ��  CIDER  ��  ��    ��####��     �� ");
					System.out.println("  ��     ����������������������  ����������������������  ����������������������  ����������������������     ��                      ��ư��ġ");
					System.out.printf ("  ��        %3d          %3d           %3d          %3d         ��        ����������������������������������������������������������������������\n",Drink.�ݶ�,Drink.ȯŸ,Drink.���̴�,Drink.�����);	
					System.out.print  ("  ��                                                            �� 	�� 				  ��\n");
					System.out.print  ("  ��                                                            �� 	�� 				  ��\n");
					System.out.print  ("  ��                                               (|) (��)      ��        ��                                 ��\n");
		            System.out.print  ("  ��       ###  ####   ###  #   # ####              #####       ��        ��                                 ��\n");
		            System.out.print  ("  ��      #   # #   # #   # #   # #   #             ##          ��        ��                                 ��\n");
		            System.out.print  ("  ��      # ### ####  #   # #   # ####              ####        ��        ��                                 ��\n");
		            System.out.print  ("  ��      #   # #   # #   # #   # #                    ##       ��        ��                                 ��\n");
		            System.out.print  ("  ��       #### #   #  ###   ###  #                 ####        ��        ��                                 ��\n");
					System.out.print  ("  ��     ����������������������������������������������������������������������������������������������������     ��	����������������������������������������������������������������������\n");
					System.out.println("  ��     ��                                                ��     �� ");
					System.out.println("  ��     ��                                                ��     �� ");
					System.out.println("  ��     ��                                                ��     �� ");
					System.out.println("  ��     ����������������������������������������������������������������������������������������������������     �� ");
					System.out.println("  ���������������������������������������������������������������������������������������������������������������������������� ");
					System.out.println();
				}
				try {
					Thread.sleep(160);
				}
				catch (Exception e) {}

			}
			
		}
	} // ��¸޼ҵ� end
	public static void ����ȭ�����() {
		for(int i = 0 ; i <= 5 ; i++) {
			cls();
			System.out.println("����������������������������������������������������������");
			System.out.println("��     ���Ǳ⿡ ������� ���ڶ�   ��");
			System.out.println("��     �Ǹ����� ���ϸ� ����Դϴ�   ��");
			System.out.println("��          ��  ä�켼��        ��");
			System.out.println("��������������������������������������������������������");
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
				System.out.println("          �ƢƢƢƢƢƢƢƢƢ�         ");
				System.out.println("          �Ƣ�                 ");
				System.out.println("          �ƢƢƢƢƢƢƢƢƢ�         ");
				System.out.println("                  �Ƣ�         ");
				System.out.println("                  �Ƣ�         ");
				System.out.println("          �ƢƢƢƢƢƢƢƢƢ�         ");
				try {Thread.sleep(1000);}catch(Exception e) {}
			}
			else if(i==2) {
				System.out.println("          �Ƣ�     �Ƣ�          ");
				System.out.println("          �Ƣ�     �Ƣ�          ");
				System.out.println("          �Ƣ�     �Ƣ�          ");
				System.out.println("          �ƢƢƢƢƢƢƢƢƢ�         ");
				System.out.println("                 �Ƣ�          ");
				System.out.println("                 �Ƣ�          ");
				try {Thread.sleep(1000);}catch(Exception e) {}
			}
			else if(i==3) {
				System.out.println("          �ƢƢƢƢƢƢƢƢƢ�         ");
				System.out.println("                  �Ƣ�         ");
				System.out.println("          �ƢƢƢƢƢƢƢƢƢ�         ");
				System.out.println("                  �Ƣ�         ");
				System.out.println("                  �Ƣ�         ");
				System.out.println("          �ƢƢƢƢƢƢƢƢƢ�         ");
				try {Thread.sleep(1000);}catch(Exception e) {}
			}
			else if(i==4) {
				System.out.println("          �ƢƢƢƢƢƢƢƢƢ�         ");
				System.out.println("                  �Ƣ�         ");
				System.out.println("          �ƢƢƢƢƢƢƢƢƢ�         ");
				System.out.println("          �Ƣ�                 ");
				System.out.println("          �Ƣ�                 ");
				System.out.println("          �ƢƢƢƢƢƢƢƢƢ�         ");
				try {Thread.sleep(1000);}catch(Exception e) {}
			}
			else if(i==5) {
				System.out.println("              �Ƣ�             ");
				System.out.println("            �ƢƢƢ�             ");
				System.out.println("              �Ƣ�             ");
				System.out.println("              �Ƣ�             ");
				System.out.println("              �Ƣ�             ");
				System.out.println("            �ƢƢƢƢƢ�         ");
				try {Thread.sleep(1000);}catch(Exception e) {}
			}
		}
	}

}
	
