package br.edu.univas.main;

import java.util.Scanner;

public class Questao3 {

	public static void main(String[] args) {
		Scanner leitura = new Scanner(System.in);
		
		float folhaSalarial = 0.0f;
		
		for (int i = 0; i < 5; i++) {
			folhaSalarial += leitura.nextFloat();
		}
		
		float folhaSalarialComAumento = folhaSalarial * 1.15f;
		
		System.out.println("Folha salarial atual: " + folhaSalarial);
		System.out.println("Folha salarial com 15% de aumento: " + folhaSalarialComAumento);
		
		leitura.close();
	}
	
}
