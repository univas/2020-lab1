package br.edu.univas.main;

import java.util.Scanner;

public class Exercicio13 {

	public static void main(String[] args) {

		Scanner leitura = new Scanner(System.in);

		System.out.println("Por favor digite o 1ª número:");
		int primeiro = leitura.nextInt();

		System.out.println("Por favor digite o 2ª número:");
		int segundo = leitura.nextInt();

		System.out.println("Por favor digite o 3ª número:");
		int terceiro = leitura.nextInt();

		System.out.println("Por favor digite o 4ª número:");
		int quarto = leitura.nextInt();

		int total = (primeiro * segundo) - (terceiro * quarto);

		System.out.println("Resultado: " + total);
	}

}
