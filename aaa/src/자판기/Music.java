package ���Ǳ�;


import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;

import javazoom.jl.player.Player;

public class Music extends Thread{ // �ܺ� api javazoom ����Ʈ ���� wav���ϸ� �������ִµ� mp3 ���ϵ� �ٷ� ������ �ְ� ���ִ� api

	private Player player;
	private boolean isLoop;// ���� ���ѹݺ����� �ѹ��� ����Ǵ��� ����
	private File file;
	private FileInputStream fis;
	private BufferedInputStream bis;
	
	public Music(String name, boolean isLoop) {//������
		// ���� ����� ���ѹݺ������� ����
		try {// ����ó��
			this.isLoop = isLoop; //isLoop �����ʱ�ȭ
			file = new File(Drink.class.getResource("../music/" + name).toURI()); //getResource()
			// , getResourceAsStream()�� ���� jar�� ��Ű¡�� ���� ������ ���� ���� �� �ִ�
			fis = new FileInputStream(file);
			bis = new BufferedInputStream(fis);
			player = new Player(bis);
			
		}catch(Exception e) {// ���� �߻� ��
			System.out.println(e.getMessage());
		}
	}
	
	public int getTime() {// ����ǰ� �ִ� ������ � ��ġ���� �˷���
		if(player == null)
			return 0;
		return player.getPosition();
	}
	
	public void close() { // ���� ����
		isLoop = false;
		player.close(); //������ ��������
		this.interrupt(); //�ش� �����带 �������·� �������
	}
	
	@Override
	public void run() {
		try {
			do {
				player.play();//�� ����
				fis = new FileInputStream(file);
				bis = new BufferedInputStream(fis);
				player = new Player(bis);
				
			}while(isLoop);//isLoop�� true�̸� ���ѹݺ�
			
		}catch(Exception e) {// ���� �߻� ��
			System.out.println(e.getMessage());
		}
	}
}