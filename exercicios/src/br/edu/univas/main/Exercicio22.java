package br.edu.univas.main;

import java.util.Scanner;

public class Exercicio22 {

	public static void main(String[] args) {
		Scanner leitura = new Scanner(System.in);

		int vitoriaArgentina = 0;
		int vitoriaBrasil = 0;
		int empates = 0;
		
		for (int i = 0; i < 135; i++) {
			System.out.println("Gols da Argentina: ");
			int golsArgentina = leitura.nextInt();
			
			System.out.println("Gols do Brasil: ");
			int golsBrasil = leitura.nextInt();
			
			if (golsArgentina > golsBrasil) {
				vitoriaArgentina++;
			} else if (golsBrasil > golsArgentina) {
				vitoriaBrasil++;
			} else {
				empates++;
			}
		}
		
		System.out.println("Quantidade vitória Argentina: " + vitoriaArgentina);
		System.out.println("Quantidade vitória Brasil: " + vitoriaBrasil);
		System.out.println("Empates: " + empates);
		
		leitura.close();
	}
}
