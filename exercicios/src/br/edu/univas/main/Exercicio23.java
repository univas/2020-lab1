package br.edu.univas.main;

public class Exercicio23 {

	public static void main(String[] args) {

		// primeira forma:
//		for (int i = 0; i < 10; i++) {
//
//			for (int j = 0; j <= i; j++) {
//				System.out.print("*");
//			}
//
//			System.out.println();
//		}

		// segunda forma:
		String output = "";
		for (int i = 0; i < 10; i++) {
			output = output + "*";
			System.out.println(output);
		}
	}

}
