package br.edu.univas.main;

import java.util.Scanner;

public class Exercicio29 {

	public static void main(String[] args) {
		Scanner leitura = new Scanner(System.in);
		
		String[] meses = {"Janeiro", "Fevereiro", "Março", "Abril", "Maio", "Junho",
				"Julho", "Agosto", "Setembro", "Outubro", "Novembro", "Dezembro"};
		float[] mediaDasTemperaturas = new float[12];
		float somaDasTemperaturas = 0.0f;
		
		for (int i = 0; i < 12; i++) {
			System.out.println("Por favor digite a temperatura:");
			mediaDasTemperaturas[i] = leitura.nextFloat();
			somaDasTemperaturas += mediaDasTemperaturas[i];
		}
		
		float mediaAnual = somaDasTemperaturas / 12;
		
		System.out.println("Meses acima da média:");
		
		for (int i = 0; i < 12; i++) {
			if (mediaDasTemperaturas[i] > mediaAnual) {
				System.out.println(meses[i] + " - " + mediaDasTemperaturas[i]);
			}
		}
		
		leitura.close();
	}
	
}
