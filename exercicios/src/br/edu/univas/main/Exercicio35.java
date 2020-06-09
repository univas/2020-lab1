package br.edu.univas.main;

import java.util.Scanner;

public class Exercicio35 {

	public static void main(String[] args) {
		Scanner leitura = new Scanner(System.in);

		int[] numeros = new int[50];
		
		for (int i = 0; i < 50; i++) {
			numeros[i] = leitura.nextInt();
		}
		
		int count = 0;
		for (int i = 0; i < 50; i++) {
			if (numeros[i] < 0) {
				numeros[i] = 0;
				count++;
			}
		}
		
		System.out.println("Quantidade de numeros negativos: " + count);
		
		leitura.close();
	}
}
