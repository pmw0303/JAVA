package Day14;

import java.util.Scanner;

public class Day14_�÷��̾� {
	
	// ���� 
		// < 1.�������/���� 2.�������/���� >
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		boolean soundsw = true; // �Ҹ� ��� true / ����
		boolean moviesw = true;
		
		while(true) {
			System.out.println("1.�Ҹ����/ 2.�������");
			int ch = scanner.nextInt();
			
			if(ch==1) {
				Sound sound = new Sound();
				
				if(soundsw) {
					sound.soundstop(true);
					sound.start();
					// sound.stop() = false;
					soundsw = false;
				}else {
					sound.soundstop(false);
					// sound.stop() = true;
					soundsw = true;
				}
				
				
			}else if(ch==2) {
				Movie movie = new Movie();
				if(moviesw) {
					movie.moviestop(true);
					movie.start();
					moviesw = false;
				}else {
					movie.moviestop(false);
					moviesw = false;
				}
				
			}
		}
	}

}
