package SPOJ;

import java.util.Scanner;

public class SkarbFinder {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int direction, steps, loop = input.nextInt();
		int[] treasure;
		while((loop--) > 0) {
			treasure = new int[]{0,0};
			steps = input.nextInt();
			while((steps--) > 0) {
				direction = input.nextInt();
				if(direction == 0) treasure[0] += input.nextInt();
				else if(direction == 1) treasure[0] -= input.nextInt();
				else if(direction == 2) treasure[1] += input.nextInt();
				else if(direction == 3) treasure[1] -= input.nextInt();
			}
			if(treasure[0] == 0 && treasure[1] == 0) System.out.println("studnia");
			else {
				if(treasure[0] > 0) System.out.println("0 " + treasure[0]);
				else if(treasure[0] < 0) System.out.println("1 " + (-1*treasure[0]));
				if(treasure[1] > 0) System.out.println("2 " + treasure[1]);
				else if(treasure[1] < 0) System.out.println("3 " + (-1*treasure[1]));
			}
		}
		input.close();
	}

}
