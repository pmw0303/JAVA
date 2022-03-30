package ���Ǳ�;

import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.Label;
import java.awt.Panel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
 
public class Btn {
   private Frame mainFrame;
   private Label headerLabel;
   private Label statusLabel;
   private Panel controlPanel;
 
   public Btn() {
      prepareGUI(); //GUI �� Graphical user interface �� �۸� 
      				// ���ݱ��� ���� command-line text mode�� �Է¹޴°��ε� GUI ���Ἥ ���콺 �Է��� �������ִ�
   }
 
   public static void main(String[] args) {
      Btn buttons = new Btn();
      buttons.showButton();
      
   }
   
 
   private void prepareGUI() {
      // Frame �� ���� ����
      mainFrame = new Frame("���� �߰�"); // ������ �̸�
      mainFrame.setSize(400, 200); // ������ ������
      mainFrame.setLayout(new GridLayout(3, 1));
      mainFrame.setLocation(880, 640); // ��������ġ
      mainFrame.addWindowListener(new WindowAdapter() { // ������ ������ ������ ����
         public void windowClosing(WindowEvent windowEvent) {
            System.exit(0);
         }
      });
 
      // ��ܿ� �ִ� ��
      headerLabel = new Label();
      headerLabel.setAlignment(Label.CENTER);
      headerLabel.setText("���Ḧ ������ �ּ���");
 
      // �ϴ� ���°� ��
      statusLabel = new Label();
      statusLabel.setText("������....");
      statusLabel.setAlignment(Label.CENTER);
      statusLabel.setSize(350, 100);
 
      controlPanel = new Panel();
      controlPanel.setLayout(new FlowLayout());
 
      mainFrame.add(headerLabel);
      mainFrame.add(controlPanel);
      mainFrame.add(statusLabel);
      mainFrame.setVisible(true);
   }
 
   void showButton() { // ��ư
      Button btn1 = new Button("�ݶ�[300]");
      Button btn2 = new Button("ȯŸ[200]");
      Button btn3 = new Button("���̴�[100]");
      Button btn4 = new Button("�����[1,000]");
   
      controlPanel.add(btn1);
      controlPanel.add(btn2);
      controlPanel.add(btn3);
      controlPanel.add(btn4);
 
      btn1.addActionListener(new ActionListener() { // ��ưŬ���� ���ۼ���
         public void actionPerformed(ActionEvent e) {
            statusLabel.setText("�ݶ� ���õǾ����ϴ�.");
            if(Controller.�ڱ�<300) { // �ڱ��� �����ϸ� ������ �� ����
            	statusLabel.setText("�ڱ��� �����Ͽ� ������ �� �����ϴ�.");
            }
            else { // �ݶ� 1�� ����, �ڱ� ����
            	Controller.�ݶ�++; 
            	Controller.�ڱ� -= 300 ;
	            
            }
         }
      });
 
      btn2.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent e) {
            statusLabel.setText("ȯŸ�� ���õǾ����ϴ�.");
            if(Controller.�ڱ�<200) {
            	statusLabel.setText("�ڱ��� �����Ͽ� ������ �� �����ϴ�.");
            }
            else{
            	Controller.ȯŸ++; 
            	Controller.�ڱ� -= 200;
            	
            }
         }
      });
 
      btn3.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent e) {
            statusLabel.setText("���̴ٰ� ���õǾ����ϴ�.");
            if(Controller.�ڱ�<100) {
            	statusLabel.setText("�ڱ��� �����Ͽ� ������ �� �����ϴ�.");
            }
            else{
            	Controller.���̴�++; 
            	Controller.�ڱ� -= 100;
            	
            }
         }
      });
      
      btn4.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent e) {
            statusLabel.setText("������� ���õǾ����ϴ�.");
            if(Controller.�ڱ�<1000) {
            	statusLabel.setText("�ڱ��� �����Ͽ� ������ �� �����ϴ�.");
            }
            else{
            	Controller.�����++; 
            	Controller.�ڱ� -= 1000;
            	
            }
         }
      });
 
      mainFrame.setVisible(true);
      mainFrame.setAlwaysOnTop(true);
 
   }
   
   void closeButton() {
	   mainFrame.setVisible(false);
   }
}