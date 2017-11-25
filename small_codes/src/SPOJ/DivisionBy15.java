package SPOJ;

import java.math.BigInteger;
import java.util.Scanner;

public class DivisionBy15 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		BigInteger number;
		while(!(number = new BigInteger(input.next())).equals(BigInteger.ZERO)) {
			if((number.mod(BigInteger.valueOf(15))).equals(BigInteger.ZERO)) System.out.println("TAK");
			else System.out.println("NIE");
		}
		input.close();
	}

}