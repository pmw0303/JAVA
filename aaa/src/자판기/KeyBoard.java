package ���Ǳ�;

import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Label;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class KeyBoard implements KeyListener{
	@Override
	public void keyTyped(KeyEvent e){
	}
	@Override
	public void keyPressed(KeyEvent e){
		if(e.getKeyCode() == 65) {
			if(Controller.�ڱ�<300) { // �ڱ��� �����ϸ� ������ �� ����
            	
            }
            else { // �ݶ� 1�� ����, �ڱ� ����
            	Controller.�ݶ�++; 
            	Controller.�ڱ� -= 300 ;
	            
            }
		}else if(e.getKeyCode() == 83) {
			if(Controller.�ڱ�<200) {
            	
            }
            else{
            	Controller.ȯŸ++; 
            	Controller.�ڱ� -= 200;
            	
            }
		}else if(e.getKeyCode() == 68) {
			if(Controller.�ڱ�<100) {
            	
            }
            else{
            	Controller.���̴�++; 
            	Controller.�ڱ� -= 100;
            	
            }
		}else if(e.getKeyCode() == 70) {
			if(Controller.�ڱ�<1000) {
            	
            }
            else{
            	Controller.�����++; 
            	Controller.�ڱ� -= 1000;
            	
            }
		}
	}
	
	
	@Override
	public void keyReleased(KeyEvent e) {}

//	 void GUI() {
//		Frame f = new Frame("Demo");
//		f.setLayout(new FlowLayout());
//		f.setSize(200, 200);
//		Label l = new Label();
//		l.setText("This is a demonstration");
//		f.add(l);
//		f.setVisible(true);
//		f.setAlwaysOnTop(true);
//		
//	
//	}

	void showKey() {
		
	}
	
//	}
	public static void main(String[] args)
	{
		//Setting the Frame and Labels
		Frame f = new Frame("Demo");
		f.setLayout(new FlowLayout());
		f.setSize(200, 200);
		Label l = new Label();
		l.setText("This is a demonstration");
		f.add(l);
		f.setVisible(true);
		
		//Creating and adding the key listener
		KeyBoard k = new KeyBoard();
		f.addKeyListener(k);
		f.setAlwaysOnTop(true);
	}
}