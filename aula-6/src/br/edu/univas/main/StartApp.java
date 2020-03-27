package br.edu.univas.main;

public class StartApp {

	public static void main(String[] args) {
		int idade = 7;
		
		if (idade == 5) {
			System.out.println("Pré-II");
		} else if (idade == 6) {
			System.out.println("1º Ano");
		} else if (idade == 7) {
			System.out.println("2º Ano");
		} else if (idade == 8) {
			System.out.println("3º Ano");
		} else if (idade == 9) {
			System.out.println("4º Ano");
		} else {
			System.out.println("5º Ano");
		}
		
		//aceitos pelo switch :::
		//byte - short - int - char - String
		
		switch (idade) {
			case 5:
				System.out.println("Pré-II");
				break;
			case 6:
				System.out.println("1º Ano");
				break;
			case 7:
				System.out.println("2º Ano");
				break;
			case 8:
				System.out.println("3º Ano");
				break;
			case 9:
				System.out.println("4º Ano");
				break;
			default:
				System.out.println("5º Ano");
				break;
		}
	}
	
}
