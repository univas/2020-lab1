package br.edu.univas.main;

import java.util.Scanner;

public class Exercicio31 {

	public static void main(String[] args) {
		Scanner leitura = new Scanner(System.in);

		int[] a = new int[10];
		int[] b = new int[10];
		int[] c = new int[10];
		
		System.out.println("Dados 1º array:");
		for (int i = 0; i < 10; i++) {
			System.out.println("Digite um numero:");
			a[i] = leitura.nextInt();
		}
		
		System.out.println("Dados 2º array:");
		for (int i = 0; i < 10; i++) {
			System.out.println("Digite um numero:");
			b[i] = leitura.nextInt();
		}

		System.out.println("Resultado de A X B:");
		for (int i = 0, j = 9; i < 10; i++, j--) {
			c[i] = a[i] * b[j];
			System.out.println(c[i]);
		}
		
		leitura.close();
	}
	
}
