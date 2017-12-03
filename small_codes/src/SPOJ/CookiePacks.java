package SPOJ;

import java.io.IOException;
import java.util.Scanner;

public class CookiePacks {

	public static void main(String[] args) throws IOException {
		Scanner input = new Scanner(System.in);
		int manQty, cookiesInPack, answer, loop = intRead();
		while((loop--) > 0) {
			answer = 0;
			manQty = intRead();
			cookiesInPack = intRead();
			while((manQty--) > 0) {
				answer += 86400 / intRead();
			}
			if(answer % cookiesInPack > 0) System.out.println(answer / cookiesInPack + 1);
			else System.out.println(answer / cookiesInPack);
		}
		input.close();
	} //main
	
	private static int intRead() throws IOException {
		int tmp = 0, number = 0;
		while(tmp >= 0 && tmp <= 9) {
			number = number * 10 + tmp;
			tmp = System.in.read() - 48;
		}
		return number;
	}
}