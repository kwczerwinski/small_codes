package SPOJ;

import java.util.Scanner;

public class Addition {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int loop, numbers, answer = 0;
		loop = input.nextInt();
		while((loop--) > 0) {
			numbers = input.nextInt();
			while((numbers--) > 0) answer += input.nextInt();
			System.out.println(answer);
			answer = 0;
		}
		input.close();
	}

}
