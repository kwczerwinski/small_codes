package SPOJ;

import java.util.Scanner;

public class ShorterWords {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		byte loop = input.nextByte();
		StringBuilder word;
		while((loop--) > 0) {
			word = new StringBuilder(input.next());
			for(int i = 0; i < word.length(); i++) {
				for(int j = i; j < word.length(); j++) {
					if(word.charAt(i) != word.charAt(j)) {
						if(j > i + 2) {
							word.replace(i+1, j, String.valueOf(j-i));
							i++;
						}
						else i = j - 1;
						break;
					}
					if(j >= word.length() - 1) {
						if(j > i + 1) word.replace(i+1, j+1, String.valueOf(j-i+1));
						i = word.length();
					}
				}
			}
			System.out.println(word);
		} //while(loop)
		input.close();
	}

}
