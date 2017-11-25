package SPOJ;

import java.util.Scanner;

public class ExponentiationLastDigit {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		byte loop = input.nextByte();
		int a, b;
		byte[][] lastDigit = {{0,0,0,0},
							  {1,1,1,1},
							  {6,2,4,8},
							  {1,3,9,7},
							  {6,4,6,4},
							  {5,5,5,5},
							  {6,6,6,6},
							  {1,7,9,3},
							  {6,8,4,2},
							  {1,9,1,9}
							 };
		while((loop--) > 0) {
			a = (int)(input.nextLong() % 10);
			b = (int)(input.nextLong() % 4);
			input.nextLine();
			System.out.println(lastDigit[a][b]);
		}
		input.close();
	} //main

} //ExponentiationLastDigit