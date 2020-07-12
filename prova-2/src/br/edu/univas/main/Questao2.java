package br.edu.univas.main;

import java.util.Scanner;

public class Questao2 {

	public static void main(String[] args) {
		Scanner leitura = new Scanner(System.in);
		int[] notas = new int[1000];
		int counter = 0;
		
		do {
		
			int nota = leitura.nextInt();
			if (nota == 0) {
				break;
			} else if (nota >= 1 && nota <= 7) {
				notas[counter] = nota;
			}
			counter++;
			
		} while (true);
		
		for (int i = 0; i < counter; i++) {
			int nota = notas[i];
			if (nota == 1) {
				System.out.println("DÓ");
			} else if (nota == 2) {
				System.out.println("RÉ");
			} else if (nota == 3) {
				System.out.println("MI");
			} else if (nota == 4) {
				System.out.println("FA");
			} else if (nota == 5) {
				System.out.println("SOL");
			} else if (nota == 6) {
				System.out.println("LA");
			} else if (nota == 7) {
				System.out.println("SI");
			}
		}
		
		leitura.close();
	}
	
}
