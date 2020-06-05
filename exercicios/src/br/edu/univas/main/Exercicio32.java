package br.edu.univas.main;

import java.util.Scanner;

public class Exercicio32 {

	public static void main(String[] args) {
		Scanner leitura = new Scanner(System.in);
		
		int[] notas = new int[30];
		int menor = 0;
		int maior = 0;
		
		for (int i = 0; i < 5; i++) {
			System.out.println("Digite sua nota:");
			int nota = leitura.nextInt();
			notas[i] = nota;
			
			if (i == 0) {
				menor = nota;
				maior = nota;
			} else if (nota < menor) {
				menor = nota;
			} else if (nota > maior) {
				maior = nota;
			}
		}
		
		int soma = 0;
		int contador = 0;
		for (int i = 0; i < 5; i++) {
			if (notas[i] == menor || notas[i] == maior) {
				continue;
			}
			soma += notas[i];
			contador++;
		}

		int media = soma / contador;
		System.out.println("A média é: " + media);
			
		
		leitura.close();
	}
	
}
