package br.edu.univas.main;

import java.util.Scanner;

public class Exercicio21 {

	public static void main(String[] args) {
		Scanner leitura = new Scanner(System.in);
		
		int par = 0;
		int impar = 0;
		
		for (int i = 0; i < 20; i++) {
			System.out.println("Digite um número: ");
			int numero = leitura.nextInt();
			
			if (numero % 2 == 0) {
				par++;
			} else {
				impar++;
			}
		}

		System.out.println("Quantidade de pares: " + par);
		System.out.println("Quantidade de ímpares: " + impar);
		
		leitura.close();
	}
}
