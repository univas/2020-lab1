package br.edu.univas.main;

import java.util.Scanner;

public class Exercicio18 {

	public static void main(String[] args) {
		Scanner leitura = new Scanner(System.in);
		
		int soma = 0;
		
		for (int i = 0; i < 30; i++) {
			System.out.println("Digite um número:");
			int numero = leitura.nextInt();
			
			if (numero % 2 > 0 && numero >= 23 && numero <= 99) {
				soma += numero;
			}
		}
		
		System.out.println("A soma dos números é: " + soma);
		leitura.close();
	}
	
}
