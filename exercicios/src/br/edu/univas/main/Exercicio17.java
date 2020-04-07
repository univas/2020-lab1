package br.edu.univas.main;

public class Exercicio17 {

	public static void main(String[] args) {
		int quantidadeSemestre = 8;
		int porcentagemDeAumento = 5;
		float valorAtual = 1000;
		
		for (int i = 0; i < quantidadeSemestre - 1; i++) {
			float valorDeAumento = valorAtual * porcentagemDeAumento / 100;
			valorAtual += valorDeAumento;
		}
		
		System.out.println("O valor da mensalidade será: " + valorAtual);
	}
}
