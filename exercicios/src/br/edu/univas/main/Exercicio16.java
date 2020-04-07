package br.edu.univas.main;

import java.util.Scanner;

public class Exercicio16 {

	public static void main(String[] args) {
		Scanner leitura = new Scanner(System.in);
		
		float somaDasNotas = 0;
		int totalAlunos = 30;
		
		for (int i = 0; i < totalAlunos; i++) {
			System.out.println("Por favor digite sua nota");
			
			float nota = leitura.nextFloat();
			somaDasNotas += nota;
		}
		
		float media = somaDasNotas / totalAlunos;
		System.out.println("A média geral é: " + media);
	}
	
}
