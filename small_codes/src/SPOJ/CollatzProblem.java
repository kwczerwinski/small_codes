package SPOJ;

import java.util.Scanner;

public class CollatzProblem {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int s, n, loop = input.nextInt();
		while((loop--) > 0) {
			n = 0;
			s = input.nextInt();
			while(s != 1) {
				if(s % 2 == 0) s/=2;
				else s = s * 3 + 1;
				n++;
			}
			System.out.println(n);
		}
		input.close();
	}

}
