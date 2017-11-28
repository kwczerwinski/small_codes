package SPOJ;

import java.util.Scanner;

public class GCD {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int loop = input.nextInt();
		int a, b, t;
		while((loop--) > 0) {
			a = input.nextInt();
			b = input.nextInt();
			input.nextLine();
			if(a == 0) System.out.println(b);
			else if(b == 0) System.out.println(a);
			else {
				if(a < b) {
					t = a;
					a = b;
					b = t;
				}
				while(b != 0) {
					t = b;
					b = a % b;
					a = t;
				}
				System.out.println(a);
			}
		}
		input.close();
	}

}
