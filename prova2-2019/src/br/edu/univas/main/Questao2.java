package br.edu.univas.main;

import java.util.Scanner;

public class Questao2 {

	public static void main(String[] args) {
		Scanner leitura = new Scanner(System.in);
		
		int menorValor = 0;

		for (int i = 0; i < 100; i++) {
			System.out.println("Digite um número qualquer:");
			int valorDigitado = leitura.nextInt();
			
			if ( i == 0 || valorDigitado < menorValor) {
				menorValor = valorDigitado;
			}
		}
		
		System.out.println("O menor valor digitado foi: " + menorValor);
		
		leitura.close();
	}
	
}
