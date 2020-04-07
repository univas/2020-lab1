package br.edu.univas.main;

import java.util.Scanner;

public class Exercicio19 {

	public static void main(String[] args) {
		Scanner leitura = new Scanner(System.in);
		
		int contadorDeVotoMaria = 0;
		int contadorDeVotoJoao = 0;
		int contadorDeVotoJose = 0;
		
		for (int i = 0; i < 10; i++) {
			System.out.println("Por favor, digite seu voto:");
			int voto = leitura.nextInt();
			
			if (voto == 1) {
				contadorDeVotoMaria++;
			} else if (voto == 2) {
				contadorDeVotoJoao++;
			} else {
				contadorDeVotoJose++;
			}
		}
		
		if (contadorDeVotoMaria > contadorDeVotoJoao && contadorDeVotoMaria > contadorDeVotoJose) {
			System.out.println("A nova representante é a Maria!");
		
		} else if (contadorDeVotoJoao > contadorDeVotoJose) {
			System.out.println("O novo representante é o João!");
			
		} else {
			System.out.println("O novo representante é o José!");
			
		}
	}
	
}
