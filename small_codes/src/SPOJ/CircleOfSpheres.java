package SPOJ;

import java.util.Scanner;

public class CircleOfSpheres {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		double r = input.nextDouble();
		double d = input.nextDouble();
		System.out.println(3.141592654*(r*r-d*d/4));
		input.close();
	}

}