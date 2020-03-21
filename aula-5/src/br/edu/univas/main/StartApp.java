package br.edu.univas.main;

import java.util.Scanner;

public class StartApp {

	public static void main(String[] args) {
		//tipo nome = valor
		Scanner leitura = new Scanner(System.in);
		
		System.out.println("Por favor, digite seu nome:");
		String nome = leitura.nextLine();
		
		System.out.println("Seja bem vindo: " + nome);
		
		System.out.println("Por favor, digite o ano do seu nascimento:");
		int anoNascimento = leitura.nextInt();
		
		System.out.println("Ano de nascimento: " + anoNascimento);
		
		leitura.close();
	}
	
}
