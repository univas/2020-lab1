package br.edu.univas.main;

import java.util.Scanner;

public class Questao2 {

	public static void main(String[] args) {
		Scanner leitura = new Scanner(System.in);
		
		int counterSim = 0;
		int counterNao = 0;
		int counterSul = 0;
		int counterSudeste = 0;
		int counterCentroOeste = 0;
		int counterNorte = 0;
		int counterNordeste = 0;
		
		for (int i = 0; i < 10; i++) {
			System.out.println("Você acredita que a vacina contra o COVID-19 fique pronta ainda em 2020?");
			System.out.println("1 - SIM");
			System.out.println("2 - NÃO");
			System.out.print("Digite sua opção:");
			
			int opcao1 = leitura.nextInt();
			if (opcao1 == 1) {
				counterSim++;
			} else {
				counterNao++;
			}
			
			System.out.println("Qual região do Brasil você mora?");
			System.out.println("1 - SUL");
			System.out.println("2 - SUDESTE");
			System.out.println("3 - CENTRO-OESTE");
			System.out.println("4 - NORTE");
			System.out.println("5 - NORDESTE");
			System.out.print("Digite sua opção:");
			
			int opcao2 = leitura.nextInt();
			if (opcao2 == 1) {
				counterSul++;
			} else if (opcao2 == 2) {
				counterSudeste++;
			} else if (opcao2 == 3) {
				counterCentroOeste++;
			} else if (opcao2 == 4) {
				counterNorte++;
			} else {
				counterNordeste++;
			}
		}
		
		System.out.println("Resultado da Pesquisa:");
		System.out.println(counterSim + " pessoas votaram SIM");
		System.out.println(counterNao + " pessoas votaram NÃO");
		
		System.out.println("Votos por região:");
		System.out.println(counterSul + " pessoas moram no SUL");
		System.out.println(counterSudeste + " pessoas moram no SUDESTE");
		System.out.println(counterCentroOeste + " pessoas moram no CENTRO-OESTE");
		System.out.println(counterNorte + " pessoas moram no NORTE");
		System.out.println(counterNordeste + " pessoas moram no NORDESTE");
		
		leitura.close();
	}
}
