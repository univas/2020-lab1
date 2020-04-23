package uribr.edu.univas.uri;

import java.util.Scanner;

public class Exercicio1001 {

	public static void main(String[] args) {
		Scanner leitura = new Scanner(System.in);
		
		int a = leitura.nextInt();
		int b = leitura.nextInt();
		
		int x = a + b;
		
		System.out.println("X = " + x);
		
		leitura.close();
	}
	
}
