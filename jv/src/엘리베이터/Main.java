package ����������;

import java.util.Scanner;

public class Main {
   /* ����Ƚ��: 
    * 
    * 1.���������� ��ü ����
    *       1.����
    * 2.�ʱ�޴� [1. ���������� ȣ��] ���������� �⺻�� = 0��
    *       1. �������� �Է¹ޱ� *ȣ��� �������� ���
    *       2. �������� �Է¹ޱ�
    * 
    */
   public static void main(String[] args) {
      
      Scanner scanner = new Scanner(System.in);// �Է°�ü ����
      
      Elevator elevator = new Elevator(10);// ó�� �⺻�� 1 ���� ����
      
      while (true) {
         System.out.println("-----------------------------------����������-------------------------------------------");
         System.out.println("��������Դϱ�? 1~20: "); int ȣ������ = scanner.nextInt(); // ���� ���� �Է¹ޱ�
         
         boolean �������� = false; // ���� ���� ����
         if(elevator.���� != ȣ������) {// ���������� �ƴϸ�
            if(ȣ������ < elevator.����) {// ȣ������ ���� ������ġ�� ������
               while(true) {// ���� ���� ����
                  elevator.����--;// ������ �������鼭 �ϳ��� ��������
                  System.out.println(elevator.���� + "��");
                  if(ȣ������ == elevator.����) { // ������ �������̵Ǹ�
                     System.out.println("����");
                     �������� = true;
                     break;                // ����
                  }// �������̸� end
               }// �������� end   
            }else {// ȣ������ ���� �������� ������
               while(true) {// ���� ���� ����
                  elevator.����++;// ������ �ö󰡸鼭 �ϳ��� �÷���
                  System.out.println(elevator.���� + "��");
                  if(ȣ������ == elevator.����) { // ������ �������̵Ǹ�
                     System.out.println("����");
                     �������� = true;
                     break;                // ����
                  }// �������̸� end
               }// �������� end   
            }               
            
         }else if(ȣ������ < 0 && ȣ������ > 20) { // �������� �����
            System.out.println("����)) 1~20�� ���� �Է����ּ���");
         }
         
         
         if(�������� == true){// ������ ������
            System.out.println("������ ���ڽ��ϱ�?: "); int �������� = scanner.nextInt(); // �������� �Է¹ޱ�
            if(�������� >= 1 && �������� <= 20) {// ���־��϶�
               if(elevator.���� < ��������) {// ������������ ���������� ������
                  System.out.println("�ö󰩴ϴ�");
                  while(true) {
                     elevator.����++;
                     if(elevator.���� == ��������) {
                        System.out.println("�����߽��ϴ�");
                        break;
                     }
                  }// while end
               }//else if() {// ������������ ���������� ������
                  
               
            }else {// ���ְ� ����������
               
            }
            
            
         }
         System.out.println(elevator.����);
      }// while
   }// me
}// cs