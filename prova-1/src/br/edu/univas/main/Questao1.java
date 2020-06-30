package br.edu.univas.main;

import java.util.Scanner;

public class Questao1 {

	public static void main(String[] args) {
		Scanner leitura = new Scanner(System.in);

		int number = 0;
		int counter = 0;
		
		do {
			System.out.println("Por favor, digite um número:");
			number = leitura.nextInt();
			if (number < 0) {
				counter++;
			}
			
		} while (number != 0);

		System.out.println("A quantidade de números negativos digitados foram: " + counter);
		
		leitura.close();
	}
}
