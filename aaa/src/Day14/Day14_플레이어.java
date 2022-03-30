package Day14;

import java.util.Scanner;

public class Day14_플레이어 {
	
	// 예제 
		// < 1.음악재생/중지 2.영상재생/중지 >
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		boolean soundsw = true; // 소리 재생 true / 종료
		boolean moviesw = true;
		
		while(true) {
			System.out.println("1.소리재생/ 2.영상재생");
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
