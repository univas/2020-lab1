package br.edu.univas.main;

import java.util.Scanner;

public class StartApp {

	public static void main(String[] args) {
		//vocês façam um loop de repetição para imprimir a tabuada do 2
		//alterar o programa para fazer a leitura de qual numero o usuario quer ver a tabuada
		//altarar o programa para ler um numero entre 1 (inclusive) e 15 (inclusive)
		
		Scanner leitura = new Scanner(System.in);
		
		int numero = 0;
		
		do {
			System.out.println("Por favor, digite um numero de 1 a 15 para ver a tabuada:");
			numero = leitura.nextInt();
			
			if (numero >= 1 && numero <= 15) {
				break;
			}
		} while(false);
		
		for (int i = 1; i <= 10; i++) {
			int valor = numero * i;
			System.out.println(numero + " X "+ i + " = " + valor);
		}
	}
	
}
