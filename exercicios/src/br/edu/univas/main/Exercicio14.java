package br.edu.univas.main;

import java.util.Scanner;

public class Exercicio14 {

	public static void main(String[] args) {
		Scanner leitura = new Scanner(System.in);
		
		System.out.println("Digite seu nome:");
		String funcionario = leitura.nextLine();
		
		System.out.println("Digite a quantidade de horas trabalhadas:");
		float quantidadeHoras = leitura.nextFloat();
		
		System.out.println("Digite o seu valor/hora: ");
		float valorHora = leitura.nextFloat();
		
		float recebimento = quantidadeHoras * valorHora;
		
		System.out.println("Sr(a) " + funcionario + " irá receber R$ " + recebimento);
	}
	
}
