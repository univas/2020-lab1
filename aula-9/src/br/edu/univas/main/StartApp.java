package br.edu.univas.main;

import java.util.Scanner;

public class StartApp {

	public static void main(String[] args) {
		Scanner leitura = new Scanner(System.in);

		//array de inteiro
		int[] valoresInteiros = new int[5];
		valoresInteiros[0] = 51;
		valoresInteiros[1] = 44;
		valoresInteiros[2] = 64;
		valoresInteiros[3] = 74;
		valoresInteiros[4] = 70;
		
		int quartaNota = valoresInteiros[3];
		System.out.println("A quarta nota é: " + quartaNota);
		System.out.println("A quarta nota é: " + valoresInteiros[3]);
		
		System.out.println("Por favor, digite a quantidade de notas:");
		int quantidadeNotas = leitura.nextInt();

		int[] notaDasProvas = new int[quantidadeNotas];
		
		int[] notaDosTrabalhos = {5, 7, 9, 1, 4, 2, 6, 2, 9, 9};

		//ler 30 notas dos aluno e gravar em um array!
		
		int[] notas = new int[5];
		
		for (int i = 0; i < 5; i++) {
			System.out.println("Por favor digite a próxima nota: ");
			notas[i] = leitura.nextInt();
		}
		
		System.out.println("Notas digitadas:::");
		for (int i = 0; i < 5; i++) {
			System.out.println(notas[i]);
		}
		
		System.out.println("Segunda nota: " + notas[1]);
		
		leitura.close();
	}
	
}
