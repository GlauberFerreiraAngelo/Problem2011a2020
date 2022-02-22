package com.problem1017;

public class Main {

	public static void main(String[] args) {
		
		double autonomia = 12.0;
		int distancia, tempoGastoNaViagem, velocidade;
		@SuppressWarnings("unused")
		double litros;
		
		tempoGastoNaViagem = 10;
		velocidade = 85;
		
		distancia = tempoGastoNaViagem*velocidade;
		litros = distancia/autonomia;
		
		System.out.printf("%.3f", litros);
	}
}
