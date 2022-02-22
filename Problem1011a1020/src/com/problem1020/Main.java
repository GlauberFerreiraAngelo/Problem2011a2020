package com.problem1020;

public class Main {

	public static void main(String[] args) {
		
		int ano, mes, dias;
		int valor;
		
		valor = 800;
		
		ano = valor / 365;
		valor = valor % 365;
		
		mes = valor / 30;
		valor = valor % 30;
		
		dias = valor;
		
		System.out.println(ano + " ano(s)");
		System.out.println(mes + " mes(es)");
		System.out.println(dias + " dia(s)");
	}
}
