package SPOJ;

import java.util.Scanner;

public class StringMerge {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int loop = input.nextInt();
		while((loop--) > 0) System.out.println(stringMerge(input.next(), input.next()));
		input.close();
	} //main
	
	private static String stringMerge(String S1, String S2) {
		StringBuilder S = new StringBuilder();
		for(int i = 0; i < Math.min(S1.length(), S2.length()); i++) {
			S.append(S1.charAt(i));
			S.append(S2.charAt(i));
		}
		return S.toString();
	} //stringMerge

}