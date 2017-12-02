package SPOJ;

import java.util.Scanner;

public class HexFloat {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int loop = input.nextInt();
		String str, s1, s2, s3, s4;
		while((loop--) > 0) {
			str = Integer.toHexString(Float.floatToIntBits(input.nextFloat()));
			if(str.equals("0")) System.out.println("0 0 0 0");
			else {
				s1 = str.substring(0,1).equals("0") ? str.substring(1,2) : str.substring(0,2);
				s2 = str.substring(2,3).equals("0") ? str.substring(3,4) : str.substring(2,4);
				s3 = str.substring(4,5).equals("0") ? str.substring(5,6) : str.substring(4,6);
				s4 = str.substring(6,7).equals("0") ? str.substring(7,8) : str.substring(6,8);
				System.out.println(s1 + " " + s2 + " " + s3 + " " + s4);
			}
		}
		input.close();
	}

}