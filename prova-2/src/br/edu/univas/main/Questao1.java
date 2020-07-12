package br.edu.univas.main;

import java.util.Scanner;

public class Questao1 {

	public static void main(String[] args) {
		Scanner leitura = new Scanner(System.in);
		
		float[] contasA = new float[12];
		float[] contasB = new float[12];
		float maiorContaA = 0.0f;
		float menorContaA = 0.0f;
		float mediaContaA = 0.0f;
		float somaContaA = 0.0f;
		float maiorContaB = 0.0f;
		float menorContaB = 0.0f;
		float mediaContaB = 0.0f;
		float somaContaB = 0.0f;
		int quantidadeConta = 12;
		
		System.out.println("Contas morador A");
		for (int i = 0; i < quantidadeConta; i++) {
			System.out.println("Digite sua conta: ");
			float conta = leitura.nextFloat();
			contasA[i] = conta;
			somaContaA += conta;
			
			if (i == 0) {
				maiorContaA = conta;
				menorContaA = conta;
			} else if (conta > maiorContaA) {
				maiorContaA = conta;
			} else if (conta < menorContaA) {
				menorContaA = conta;
			}
		}
		
		System.out.println("Contas morador B");
		for (int i = 0; i < quantidadeConta; i++) {
			System.out.println("Digite sua conta: ");
			float conta = leitura.nextFloat();
			contasB[i] = conta;
			somaContaB += conta;
			
			if (i == 0) {
				maiorContaB = conta;
				menorContaB = conta;
			} else if (conta > maiorContaB) {
				maiorContaB = conta;
			} else if (conta < menorContaB) {
				menorContaB = conta;
			}
		}
		
		mediaContaA = somaContaA / quantidadeConta;
		mediaContaB = somaContaB / quantidadeConta;
		
		System.out.println("Maior Conta do morador A: " + maiorContaA);
		System.out.println("Menor Conta do morador A: " + menorContaA);
		System.out.println("Média Conta do morador A: " + mediaContaA);
		System.out.println("Maior Conta do morador B: " + maiorContaB);
		System.out.println("Menor Conta do morador B: " + menorContaB);
		System.out.println("Média Conta do morador B: " + mediaContaB);
		
		leitura.close();
	}
	
}
