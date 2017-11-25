package SPOJ;

import java.util.Scanner;

class Main {

	public static void main(String[] args) throws java.lang.Exception {
		Scanner input = new Scanner(System.in);
		byte loop = input.nextByte();
		long number;
		input.nextLine();
		while((loop--)>0) {
			number = input.nextInt();
			if(number > 9) System.out.println("0 0");
			else if(number == 0 || number == 1) System.out.println("0 1");
			else if(number == 2) System.out.println("0 2");
			else if(number == 3) System.out.println("0 6");
			else if(number == 4) System.out.println("2 4");
			else if(number == 5 || number == 6 || number == 8) System.out.println("2 0");
			else if(number == 7) System.out.println("4 0");
			else if(number == 9) System.out.println("8 0");
		}
		input.close();
	} //main

} //LastDigits
