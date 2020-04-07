package br.edu.univas.main;

public class Exercicio20 {

	public static void main(String[] args) {

		int soma = 0;
		
		for (int i = 2; i <= 100; i = i + 2) {
			soma += i;
		}
		
		System.out.println("A soma dos numeros pares entre 1 e 101 é: " + soma);
	}
}
