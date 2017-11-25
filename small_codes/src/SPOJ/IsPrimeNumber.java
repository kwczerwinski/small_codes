package SPOJ;

import java.math.BigInteger;
import java.util.Scanner;

public class IsPrimeNumber {
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		short number;
		for(int loop = input.nextInt() ; loop > 0; loop--) {
			number = input.nextShort();
			if(BigInteger.valueOf(number).isProbablePrime(10)) System.out.println("TAK");
			else System.out.println("NIE");
			
//	SLOW DETERMINISTIC WAY
//			
//			if(number < 2) System.out.println("NIE"); 
//			else if(number < 4) System.out.println("TAK");
//			else if(number % 2 == 0 || number % 3 == 0) System.out.println("NIE");
//			else if(number < 9) System.out.println("TAK");
//			else {
//				int i = 5;
//				while(true) {
//					if(number % i == 0 || number % (i + 2) == 0) {
//						System.out.println("NIE");
//						break;
//					}
//					if(i*i < number) i += 6;
//					else {
//						System.out.println("TAK");
// 						break;
//					}
//				} //while
//			} //else	
			
		} //for
		input.close();
		
	} //main

} //Main
