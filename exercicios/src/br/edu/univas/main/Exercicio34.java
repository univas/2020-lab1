package br.edu.univas.main;

import java.util.Scanner;

public class Exercicio34 {

	public static void main(String[] args) {
		Scanner leitura = new Scanner(System.in);
		
		int numeroAlunos = 5;
		int[] notasTurmaA = new int[numeroAlunos];
		int[] notasTurmaB = new int[numeroAlunos];
		int somaNotasTurmaA = 0;
		int somaNotasTurmaB = 0;
		
		System.out.println("Digite as notas da turma A:");
		for (int i = 0; i < numeroAlunos; i++) {
			System.out.println("Digite a nota:");
			notasTurmaA[i] = leitura.nextInt();
			somaNotasTurmaA += notasTurmaA[i];
		}
		
		System.out.println("Digite as notas da turma B:");
		for (int i = 0; i < numeroAlunos; i++) {
			System.out.println("Digite a nota:");
			notasTurmaB[i] = leitura.nextInt();
			somaNotasTurmaB += notasTurmaB[i];
		}
		
		int mediaTurmaA = somaNotasTurmaA / numeroAlunos;
		int mediaTurmaB = somaNotasTurmaB / numeroAlunos;
		
		System.out.println("A média da turma A foi: " + mediaTurmaA);
		System.out.println("A média da turma B foi: " + mediaTurmaB);
		
		leitura.close();
	}
}
