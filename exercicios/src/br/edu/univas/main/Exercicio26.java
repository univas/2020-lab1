package br.edu.univas.main;

import java.util.Scanner;

public class Exercicio26 {

	public static void main(String[] args) {
		Scanner leitura = new Scanner(System.in);
	
		float somaTodasVendas = 0;
		
		while(true) {
			System.out.println("Digite o valor de sua venda: ");
			float venda = leitura.nextFloat();
			
			if (venda == -1) {
				break;
			}
			
			somaTodasVendas = somaTodasVendas + venda;
		}
		
		System.out.println("A soma total das vendas é: " + somaTodasVendas);
		
		leitura.close();
	}
}
