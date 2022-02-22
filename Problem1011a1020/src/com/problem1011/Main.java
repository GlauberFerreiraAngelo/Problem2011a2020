package com.problem1011;

public class Main {

	public static void main(String[] args) {
		double pi = 3.14159;
		double volume;
		int raio;
		
		raio = 15;
		volume = (4.0/3) * pi * Math.pow(raio, 3);
		
		System.out.printf("VOLUME = %.3f", volume);
	}
}
