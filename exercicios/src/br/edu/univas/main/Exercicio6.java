package br.edu.univas.main;

public class Exercicio6 {

	public static void main(String[] args) {
		float gasolina = 4.79f;
		float etanol = 3.10f;
		float result = etanol / gasolina * 100;

		if (result > 70) {
			System.out.println("Gasolina");
		} else {
			System.out.println("Etanol");
		}
	}

}
