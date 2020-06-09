package br.edu.univas.main;

import java.util.Scanner;

public class Exercicio33 {

	public static void main(String[] args) {
		Scanner leitura = new Scanner(System.in);

		int quantidade = 5;
		int[] numeros = new int[quantidade];
		
		for (int i = 0; i < quantidade; i++) {
			System.out.println("Digite um numero:");
			numeros[i] = leitura.nextInt();
		}
		
		for (int i = 0; i < quantidade; i++) {
			int contador = 0;
			
			for (int j = 0; j < quantidade; j++) {
				if (i != j && numeros[i] == numeros[j]) {
					contador++;
				}
			}
			
			if (contador > 0) {
				System.out.println(numeros[i]);
			}
		}
		
		leitura.close();
	}
}
