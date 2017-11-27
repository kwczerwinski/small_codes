package SPOJ;

import java.util.Scanner;

public class LCM {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int loop = input.nextInt();
		int a, b, i = 1, j = 1;
		while((loop--) > 0) {
			a = input.nextInt();
			b = input.nextInt();
			input.nextLine();
			while(true) {
				if(a*i < b*j) i++;
				else if(a*i > b*j) j++;
				else {
					System.out.println(a*i);
					break;
				}
			}
			i = j = 1;
		} //while(loop)
		input.close();
	} //main

} //LCM
