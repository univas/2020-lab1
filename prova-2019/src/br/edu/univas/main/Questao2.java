package br.edu.univas.main;

public class Questao2 {

	public static void main(String[] args) {
		float x1 = 10;
		float y1 = 15;
		
		if (x1 > 0 && y1 > 0) {
			System.out.println("Quandrante I");
		} else if (x1 < 0 && y1 > 0) {
			System.out.println("Quandrante II");
		} else if (x1 < 0 && y1 < 0) {
			System.out.println("Quandrante III");
		} else if (x1 > 0 && y1 < 0) {
			System.out.println("Quandrante IV");
		} else if (x1 == 0 && y1 == 0) {
			System.out.println("Origin");
		}
	}
}
