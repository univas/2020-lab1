package uribr.edu.univas.uri;

import java.util.Scanner;

public class Exercicio1007 {

	public static void main(String[] args) {
		Scanner leitura = new Scanner(System.in);
		
		int a = leitura.nextInt();
		int b = leitura.nextInt();
		int c = leitura.nextInt();
		int d = leitura.nextInt();
		
		int produto = a * b - c * d;
		
		System.out.println("DIFERENCA = " + produto);
		
		leitura.close();
	}
	
}
