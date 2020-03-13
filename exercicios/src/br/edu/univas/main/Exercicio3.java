package br.edu.univas.main;

public class Exercicio3 {

	public static void main(String[] args) {
		int age = 61;

		if (age < 8) {
			System.out.println("Infantil A");
		} else if (age < 11) {
			System.out.println("Infantil B");
		} else if (age < 14) {
			System.out.println("Juvenil A");
		} else if (age < 18) {
			System.out.println("Juvenil B");
		} else if (age < 61) {
			System.out.println("Adulto");
		} else {
			System.out.println("Senior");
		}
	}

}
