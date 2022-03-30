package けいしけいし;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int a,b,c;
		a = scanner.nextInt();
		
		
		for(int i=0 ; i < a ; i++) {			
				b = scanner.nextInt();
				c = scanner.nextInt();
				System.out.println(b+c);		
		}
		
	}
}
