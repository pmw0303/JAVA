
import java.awt.Frame;
import java.awt.Button;
import java.awt.Panel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Bt extends Frame {

	public Bt(String bname) {
		super(bname);
		Panel p = new Panel();
		Button btn1 = new Button("�ݶ�");
		Button btn2 = new Button("���̴�");
		Button btn3 = new Button("ȯŸ");
		p.add(btn1);
		p.add(btn2);
		p.add(btn3);
		add(p);
		setSize(500, 200);
		setVisible(true);
		btn1.setEnabled(true);

		btn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Drink.�ݶ�++;
			}
		});

		btn2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Drink.���̴�++;
			}
		});
	}
}
