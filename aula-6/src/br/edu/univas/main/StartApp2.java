package br.edu.univas.main;

import java.util.Scanner;

public class StartApp2 {

	//Usando SWITCH, fazer uma aplicação que vai ler um 
	//numero de 1 a 12 e vai imprimir qual é o mês do ano
	public static void main(String[] args) {
		Scanner leitura = new Scanner(System.in);
		
		System.out.println("Por favor, digite o número do mês:");
		int mes = leitura.nextInt();
		leitura.close();
		
		switch(mes) {
			case 1:
				System.out.println("Janeiro");
				break;
			case 2:
				System.out.println("Fevereiro");
				break;
			case 3:
				System.out.println("Março");
				break;
			case 4:
				System.out.println("Abril");
				break;
			case 5:
				System.out.println("Maio");
				break;
			case 6:
				System.out.println("Junho");
				break;
			case 7:
				System.out.println("Julho");
				break;
			case 8:
				System.out.println("Agosto");
				break;
			case 9:
				System.out.println("Setembro");
				break;
			case 10:
				System.out.println("Outubro");
				break;
			case 11:
				System.out.println("Novembro");
				break;
			case 12:
				System.out.println("Dezembro");
				break;
		}
		
		//vem pra essa linha
	}
}
