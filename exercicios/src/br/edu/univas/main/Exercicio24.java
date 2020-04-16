package br.edu.univas.main;

public class Exercicio24 {

	public static void main(String[] args) {
		
		int soma = 0;
		
		for (int i = 1; i <= 101; i++) {
			if (i % 5 == 0) {
				continue;
			}
			soma = soma + i;
		}
		
		System.out.println("A soma total é: " + soma);
	}
}
