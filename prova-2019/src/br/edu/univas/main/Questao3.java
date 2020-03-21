package br.edu.univas.main;

public class Questao3 {

	public static void main(String[] args) {
		int a = 12; 
		int b = 9;
		int soma = a + b;
		
		if (soma % 2 == 0) { //par
			if (soma > 1 && soma < 11) {
				System.out.println("D");
			} else if (soma > 11 && soma <= 24) {
				System.out.println("E");
			} else if (soma > 24) {
				System.out.println("F");
			}
			
		} else { //impar
			if (soma >= 1 && soma < 12) {
				System.out.println("A");
			} else if (soma > 12 && soma < 24) {
				System.out.println("B");
			} else if (soma > 24) {
				System.out.println("C");
			}
		}
	}
}
