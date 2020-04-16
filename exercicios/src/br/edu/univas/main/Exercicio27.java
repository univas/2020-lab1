package br.edu.univas.main;

import java.util.Scanner;

public class Exercicio27 {

	public static void main(String[] args) {
		Scanner leitura = new Scanner(System.in);

		int soma = 0;
		
		for (int i = 0; i < 50; i++) {
			System.out.println("Digite um número: ");
			int numero = leitura.nextInt();
			
			if (numero % 3 == 0) {
				soma = soma + numero;
			}
		}
		
		System.out.println("A soma total é: " + soma);
		
		leitura.close();
	}
}
