package com.problem1018;

public class Main {

	public static void main(String[] args) {
		
		int N, nota100, nota50, nota20, nota10, nota5, nota2, nota1;
		int aux;
		
		N = 11257;
		nota100 = N/100;
		aux = N % 100;
		nota50 = aux/50;
		aux = aux % 50;
		nota20 = aux/20;
		aux = aux % 20;
		nota10 = aux/10;
		aux = aux % 10;
		nota5 = aux/5;
		aux = aux % 5;
		nota2 = aux/2;
		aux = aux % 2;
		nota1 = aux;
		
		System.out.println(N);
		System.out.println(nota100 + " nota(s) de R$ 100,00");
		System.out.println(nota50 + " nota(s) de R$ 50,00");
		System.out.println(nota20 + " nota(s) de R$ 20,00");
		System.out.println(nota10 + " nota(s) de R$ 10,00");
		System.out.println(nota5 + " nota(s) de R$ 5,00");
		System.out.println(nota2 + " nota(s) de R$ 2,00");
		System.out.println(nota1 + " nota(s) de R$ 1,00");
	}
}
