package br.edu.univas.main;

import java.util.Scanner;

public class Exercicio28 {

	public static void main(String[] args) {
		//TODO Faltou fazer a verificação se os numeros digitados estão entre 1 e 60
		Scanner leitura = new Scanner(System.in);

		int[] numerosSorteados = new int[6];
		for (int i = 0; i < 6; i++) {
			System.out.println("Digite o numero sorteado:");
			numerosSorteados[i] = leitura.nextInt();
		}
		
		int[] numerosApostados = new int[6];
		for (int i = 0; i < 6; i++) {
			System.out.println("Digite o numero apostado:");
			numerosApostados[i] = leitura.nextInt();
		}
		
		int contador = 0;
		
		for (int i = 0; i < 6; i++) {
			
			for (int j = 0; j < 6; j++) {
				
				if (numerosSorteados[i] == numerosApostados[j]) {
					contador++;
					break;
				}
			}
		}
		
		if (contador == 6) {
			System.out.println("Parabéns!!! Você já pode se aposentar!");
		} else if (contador == 5) {
			System.out.println("Você acertou 5 números! Vá até uma agência para retirar seu prêmio!");
		} else if (contador == 4) {
			System.out.println("Você acertou 4 números! Vá até uma lotérica para retirar seu prêmio!");
		} else if (contador == 3 || contador == 2 || contador == 1) {
			System.out.println("Você acertou apenas " + contador + " número(s)! Tente outra vez!");
		} else {
			System.out.println("Não foi dessa vez :( Tente outra vez!");
		}
			
		leitura.close();
	}
	
}
