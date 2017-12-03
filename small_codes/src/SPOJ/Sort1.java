package SPOJ;

import java.util.Scanner;

public class Sort1 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int pointsQty, loop = input.nextInt();
		String[] pointSymbol;
		int[] pointX, pointY;
		double[] distance;
		while((loop--) > 0) {
			pointsQty = input.nextInt();
			if(pointsQty == 1) {
				input.nextLine();
				System.out.println(input.nextLine());
			}
			else {
				pointSymbol = new String[pointsQty];
				pointX = new int[pointsQty];
				pointY = new int[pointsQty];
				distance = new double[pointsQty];
				while((pointsQty--) > 0) {
					pointSymbol[pointsQty] = input.next();
					pointX[pointsQty] = input.nextInt();
					pointY[pointsQty] = input.nextInt();
					distance[pointsQty] = Math.sqrt(pointX[pointsQty]*pointX[pointsQty]+pointY[pointsQty]*pointY[pointsQty]);
				}
				sort(pointSymbol, pointX, pointY, distance);
				for(int i = 0; i < pointSymbol.length; i++) {
					System.out.println(pointSymbol[i] + " " + pointX[i] + " " + pointY[i]);
				}
			}
		}
		input.close();
	} //main

	private static void sort(String[] symbol, int[] X, int[] Y, double[] dis) {
		String tmpS;
		int tmpX, tmpY;
		double tmpDis;
		for(int i = 0; i + 1 < symbol.length; i++) {
			for(int j = i + 1; j < symbol.length; j++) {
				if(dis[i] > dis[j]) {
					tmpS = symbol[i];
					symbol[i] = symbol[j];
					symbol[j] = tmpS;
					tmpX = X[i];
					X[i] = X[j];
					X[j] = tmpX;
					tmpY = Y[i];
					Y[i] = Y[j];
					Y[j] = tmpY;
					tmpDis = dis[i];
					dis[i] = dis[j];
					dis[j] = tmpDis;
				}
			} //for(j)
		} //for(i)
	} //sort
	
} //class