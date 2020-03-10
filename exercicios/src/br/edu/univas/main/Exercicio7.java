package br.edu.univas.main;

public class Exercicio7 {

	public static void main(String[] args) {
		int a = 8;
		int b = 5;
		int c = 6;
		int d = 9;
		int e = 10;
		
		int soma = 0;
		
		if (a % 2 == 0) {
			soma += a;
		}
		
		if (b % 2 == 0) {
			soma += b;
		}
		
		if (c % 2 == 0) {
			soma += c;
		}
		
		if (d % 2 == 0) {
			soma += d;
		}
		
		if (e % 2 == 0) {
			soma += e;
		}
		
		System.out.println("A soma dos números pares é: " + soma);
	}
	
}
