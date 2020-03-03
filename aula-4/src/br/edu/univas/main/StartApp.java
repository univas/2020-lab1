package br.edu.univas.main;

public class StartApp {

	public static void main(String[] args) {
		
		int idade = 67;
		
		if (idade > 65) {
			System.out.println(
					"Você pode votar mas não é obrigado!");
			
		} else if (idade >= 18) {
			System.out.println("Você é obrigado a votar!");
		
		} else if (idade >= 16) {
			System.out.println(
					"Você pode votar mas não é obrigado!");
		
		} else {
		//} else if (idade < 16) {
			System.out.println("Você não pode votar!");
		}
		
		
		int saldo = 300;
		int valorMochila = 199;
		
		if (saldo >= valorMochila) {
			System.out.println("Você pode comprar a mochila!");
		} else {
			System.out.println("Você não pode comprar a mochila!");
		}
		
		
		int valorSaque = 105;
		
		if (valorSaque <= saldo) {
			System.out.println("Você pode sacar");
		} else {
			System.out.println("Saldo insuficiente");
		}
		
		idade = 50;
		if (idade == 65) {
			System.out.println("Você pode se aposentar!");
		}
		
		if (idade != 65) {
			System.out.println("Você ainda precisa trabalhar!");
		}
		
		saldo = 12;
		float valorSalgado = 2.5f;
		float valorSuco = 2;
		float valorTotal = valorSalgado + valorSuco;
		float valorOnibus = 3.9f;
		
		if (saldo >= valorTotal && saldo >= valorOnibus) {
			System.out.println("Você pode comprar o lanche");
		}
		
		if (saldo >= valorSalgado || saldo >= valorSuco) {
			System.out.println(
					"Você pode comprar ao menos 1 lanche");
		}
		
	}
	
}
