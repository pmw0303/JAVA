package 콘솔;

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
      prepareGUI();
   }
 
   public static void main(String[] args) {
      Btn buttons = new Btn();
      buttons.showButton();
   }
   
 
   private void prepareGUI() {
      // Frame 에 대한 셋팅
      mainFrame = new Frame("음료 추가");
      mainFrame.setSize(400, 200);
      mainFrame.setLayout(new GridLayout(3, 1));
      mainFrame.setLocation(820, 690);
      mainFrame.addWindowListener(new WindowAdapter() {
         public void windowClosing(WindowEvent windowEvent) {
            System.exit(0);
         }
      });
 
      // 상단에 있는 라벨
      headerLabel = new Label();
      headerLabel.setAlignment(Label.CENTER);
      headerLabel.setText("음료를 선택해 주세요");
 
      // 하단 상태값 라벨
      statusLabel = new Label();
      statusLabel.setText("선택중....");
      statusLabel.setAlignment(Label.CENTER);
      statusLabel.setSize(350, 100);
 
      controlPanel = new Panel();
      controlPanel.setLayout(new FlowLayout());
 
      mainFrame.add(headerLabel);
      mainFrame.add(controlPanel);
      mainFrame.add(statusLabel);
      mainFrame.setVisible(true);
   }
 
   void showButton() {
//	  Music 구매 = new Music("구매.mp3",true);
      Button btn1 = new Button("콜라[300]");
      Button btn2 = new Button("환타[200]");
      Button btn3 = new Button("사이다[100]");
      Button btn4 = new Button("레드불[1,000]");
   
      controlPanel.add(btn1);
      controlPanel.add(btn2);
      controlPanel.add(btn3);
      controlPanel.add(btn4);
 
      btn1.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent e) {
            statusLabel.setText("콜라가 선택되었습니다.");
            if(Drink.자금<300) {
            	statusLabel.setText("자금이 부족하여 구매할 수 없습니다.");
            }
            else {
	            Drink.콜라++;
	            Drink.자금 -= 300 ;
	            
            }
         }
      });
 
      btn2.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent e) {
            statusLabel.setText("환타가 선택되었습니다.");
            if(Drink.자금<200) {
            	statusLabel.setText("자금이 부족하여 구매할 수 없습니다.");
            }
            else{
            	Drink.환타++;
            	Drink.자금 -= 200;
            	
            }
         }
      });
 
      btn3.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent e) {
            statusLabel.setText("사이다가 선택되었습니다.");
            if(Drink.자금<100) {
            	statusLabel.setText("자금이 부족하여 구매할 수 없습니다.");
            }
            else{
            	Drink.사이다++;
            	Drink.자금 -= 100;
            	
            }
         }
      });
      
      btn4.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent e) {
            statusLabel.setText("레드불이 선택되었습니다.");
            if(Drink.자금<1000) {
            	statusLabel.setText("자금이 부족하여 구매할 수 없습니다.");
            }
            else{
            	Drink.레드불++;
            	Drink.자금 -= 1000;
            	
            }
         }
      });
 
      mainFrame.setVisible(true);
 
   }
}