package SPOJ;

import java.util.Scanner;

public class Reversification {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int loop = input.nextInt();
		int arrayLength;
		int[] array;
		while((loop--) > 0) {
			arrayLength = input.nextInt();
			array = new int[arrayLength];
			while((arrayLength--) > 0) array[arrayLength] = input.nextInt();
			input.nextLine();
			for(int i = 0; i < array.length - 1; i++) {
				System.out.print(array[i] + " ");
			}
			System.out.println(array[array.length - 1]);
		}
		input.close();
	}

}
