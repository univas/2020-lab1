package br.edu.univas.main;

import java.util.Scanner;

public class Exercicio11 {

	public static void main(String[] args) {
		Scanner leitura = new Scanner(System.in);
		
		System.out.println("Por favor digite seu nome:");
		String pessoa1 = leitura.nextLine();
		
		System.out.println("Por favor digite seu ano de nascimento:");
		int anoNascimentoPessoa1 = leitura.nextInt();
		leitura.nextLine(); //é para leitura do ENTER
		
		System.out.println("Por favor digite seu nome:");
		String pessoa2 = leitura.nextLine();
		
		System.out.println("Por favor digite seu ano de nascimento:");
		int anoNascimentoPessoa2 = leitura.nextInt();
		leitura.nextLine(); //é para leitura do ENTER
		
		System.out.println("Por favor digite seu nome:");
		String pessoa3 = leitura.nextLine();
		
		System.out.println("Por favor digite seu ano de nascimento:");
		int anoNascimentoPessoa3 = leitura.nextInt();
		leitura.nextLine(); //é para leitura do ENTER
		
		int anoAtual = 2015;

		if (anoNascimentoPessoa1 < anoNascimentoPessoa2 && anoNascimentoPessoa1 < anoNascimentoPessoa3) {
			int idade = anoAtual - anoNascimentoPessoa1;
			System.out.println("Nome: " + pessoa1);
			System.out.println("Idade: " + idade);
		
		} else if (anoNascimentoPessoa2 < anoNascimentoPessoa3) {
			int idade = anoAtual - anoNascimentoPessoa2;
			System.out.println("Nome: " + pessoa2);
			System.out.println("Idade: " + idade);
		
		} else  {
			int idade = anoAtual - anoNascimentoPessoa3;
			System.out.println("Nome: " + pessoa3);
			System.out.println("Idade: " + idade);
		}
	}
	
}
