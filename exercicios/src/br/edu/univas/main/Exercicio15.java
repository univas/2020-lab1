package br.edu.univas.main;

import java.util.Scanner;

public class Exercicio15 {

	public static void main(String[] args) {
		Scanner leitura = new Scanner(System.in);
		
		System.out.println("Por favor digite seu peso:");
		float peso = leitura.nextFloat();
		
		System.out.println("Por favor digite sua altura:");
		float altura = leitura.nextFloat();
		
		float imc = peso / (altura * altura);
		
		if (imc < 18.5f) {
			System.out.println("Abaixo do peso");
		} else if (imc <= 24.9f) {
			System.out.println("Peso normal");
		} else if (imc <= 29.9f) {
			System.out.println("Sobrepeso");
		} else if (imc <= 34.9f) {
			System.out.println("Obesidade grau 1");
		} else if (imc <= 39.9f) {
			System.out.println("Obesidade grau 2");
		} else {
			System.out.println("Obesidade grau 3");
		}
		
	}
	
}
