package br.edu.univas.main;

public class Exercicio10 {

	public static void main(String[] args) {
		float altura = 1.70f;
		int sexo = 0;
		float pesoIdeal = 0;
		
		if (sexo == 0) { //mulher
			pesoIdeal = 62.1f * altura - 44.7f;
			
		} else if (sexo == 1) { //homem
			pesoIdeal = 72.7f * altura - 58f;
		}
		
		System.out.println("Seu peso ideal é: " + pesoIdeal);
	}
	
}
