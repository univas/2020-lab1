package br.edu.univas.main;

import java.util.Scanner;

public class StartApp2 {

	public static void main(String[] args) {
		//vocês a leitura de 2 numeros e imprimir a soma 
		//deles
		Scanner leitura = new Scanner(System.in);
		
		System.out.println("Por favor, digite o 1º número:");
		int a = leitura.nextInt();
		
		System.out.println("Por favor, digite o 2º número:");
		int b = leitura.nextInt();
		
		int resultado = a + b;
		System.out.println("A soma é: " + resultado);
		
		float x = 20.99f;
		float y = leitura.nextFloat();
		
		leitura.close();
	}
}
