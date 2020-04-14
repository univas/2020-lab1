package br.edu.univas.main;

public class Questao1 {

	public static void main(String[] args) {
		int numero = 17;
		
		do {
			
			if (numero % 11 == 0 &&
				numero % 13 == 0 &&
				numero % 17 == 0) {
				break;
			}
			
			numero++;
		} while(true);
		
		System.out.println(numero);
	}
	
}
