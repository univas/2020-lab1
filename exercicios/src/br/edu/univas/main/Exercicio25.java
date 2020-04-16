package br.edu.univas.main;

import java.util.Scanner;

public class Exercicio25 {

	public static void main(String[] args) {
		Scanner leitura = new Scanner(System.in);

		int soma = 0;
		int contador = 0;
		
		while (true) {
			System.out.println("Por favor, digite um número: ");
			int numero = leitura.nextInt();
			
			if (numero % 2 == 0) {
				soma = soma + numero;
				contador++;
				
				if (contador == 10) {
					break;
				}
			}
		}
		
		System.out.println("A soma total é: " + soma);
		
		leitura.close();
	}
}
