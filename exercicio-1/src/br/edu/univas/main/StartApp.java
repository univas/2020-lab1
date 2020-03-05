package br.edu.univas.main;

public class StartApp {

	public static void main(String[] args) {
		float salarioMensal = 2826.66f;
		
		if (salarioMensal <= 1903.98f) {
			System.out.println("Você se enquadrou na faixa de: isento do IR");
		} else if (salarioMensal <= 2826.66) {
			System.out.println("Você se enquadrou na faixa de: 7,5% do IR");			
		} else if (salarioMensal <= 3751.05f) {
			System.out.println("Você se enquadrou na faixa de: 15% do IR");
		} else if (salarioMensal <= 4664.68f) {
			System.out.println("Você se enquadrou na faixa de: 22,5% do IR");
		} else {
			System.out.println("Você se enquadrou na faixa de: 27,5% do IR");
		}
		
	}
	
}
