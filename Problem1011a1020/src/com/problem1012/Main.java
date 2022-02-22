package com.problem1012;

public class Main {

	public static void main(String[] args) {
		
		double pi = 3.14159;
		double A, B, C;
		
		A = 12.7;
		B = 10.4;
		C = 15.2;
		
		System.out.printf("TRIANGULO: %.3f \n", (A*C)/2);
		System.out.printf("CIRCULO: %.3f \n", pi * Math.pow(C, 2));
		System.out.printf("TRAPEZIO: %.3f \n", (A+B)/2*C);
		System.out.printf("QUADRADO: %.3f \n", B * B);
		System.out.printf("RETANGULO: %.3f \n", A*B);		
	}
}
