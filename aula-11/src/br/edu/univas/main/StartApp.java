package br.edu.univas.main;

import java.util.Scanner;

public class StartApp {

	public static void main(String[] args) {
		//criação de variavel
		//tipo nome_da_variavel = valor;
		int idade = 10;
		int peso = 50;
		//short byte int long float double boolean char => 8 tipos primitivos
		//String => é considerado um tipo primitivo!
		System.out.println("UNIVAS 2020!");
		System.out.println(idade);
		
		if (idade < 20 && peso > 35) {
			//
			//
			//
		} else if (idade < 40 || peso < 70) {
			System.out.println("Olá :)");
			System.out.println("Tudo bem?");
		} else {
			//
		}
		
		
		for (int i = 0; i < 10; i++) {
			//continue;
			//break;
			if (i % 3 == 0) {
				continue;
			}
			System.out.println(i);
		}
		
		int i = 0;
		while (i < 10) {
			i++;
		}

		i = 0;
		do {
			i++;
		} while (i < 10);
		
		
		Scanner leitura = new Scanner(System.in);
		
		System.out.println("Digite a quantidade de alunos:");
		int quantidadeAlunos = leitura.nextInt();
		
		int[] notas = new int[quantidadeAlunos];
	}
	
}
