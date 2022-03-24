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
		// Frame �� ���� ����
		mainFrame = new Frame("���� �߰�");
		mainFrame.setSize(400, 200);
		mainFrame.setLayout(new GridLayout(3, 1));
		mainFrame.addWindowListener(new WindowAdapter() {
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
 
	private void showButton() {
 
		Button btn1 = new Button("�ݶ�");
		Button btn2 = new Button("���̴�");
		Button btn3 = new Button("ȯŸ");
		Button btn4 = new Button("�����");
 
		btn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				statusLabel.setText("�ݶ� ���õǾ����ϴ�.");
			}
		});
 
		btn2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				statusLabel.setText("���̴ٰ� ���õǾ����ϴ�.");
			}
		});
 
		btn3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				statusLabel.setText("ȯŸ�� ���õǾ����ϴ�.");
			}
		});
		
		btn4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				statusLabel.setText("������� ���õǾ����ϴ�.");
			}
		});
 
		controlPanel.add(btn1);
		controlPanel.add(btn2);
		controlPanel.add(btn3);
		controlPanel.add(btn4);
 
		mainFrame.setVisible(true);
 
	}
}