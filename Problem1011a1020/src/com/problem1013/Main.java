package com.problem1013;

public class Main {

	public static void main(String[] args) {
		
		int valor1, valor2, valor3; 
		int MaiorAB = 0;
		
		valor1 = 217;
		valor2 = 14;
		valor3 = 6;
		
		MaiorAB = (valor1+valor2+Math.abs(valor1-valor2))/2;
		MaiorAB = (MaiorAB+valor3+Math.abs(MaiorAB-valor3))/2;
		
		System.out.println(MaiorAB + " eh o maior");
	}
}