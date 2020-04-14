package br.edu.univas.main;

public class Questao3 {

	public static void main(String[] args) {
		int fatorial = 8;
		
		//8! = 8 X 7 X 6 X 5 X 4 X 3 X 2 X 1
		
		for (int i = 7; i >= 1; i--) {
			fatorial = fatorial * i;
		}
		
		System.out.println("O fatorial de 8 é: " + fatorial);
	}
	
}
