package com.problem1015;

public class Main {

	public static void main(String[] args) {
		
		double x1, x2, y1, y2;
		double distancia;
		
		x1 = 1.0;
		y1 = 7.0;
		x2 = 5.0;
		y2 = 9.0;
		
		distancia = Math.sqrt((Math.pow((x2-x1), 2)+ Math.pow((y2-y1), 2)));
		
		System.out.printf("%.4f", distancia);
	}
}
