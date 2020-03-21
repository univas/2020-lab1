package br.edu.univas.main;

public class Questao1 {

	public static void main(String[] args) {
		float x1 = 7;
		float x2 = 8;
		float y1 = 15;
		float y2 = -4;
		
		float x = x2 - x1;
		float y = y2 - y1;
		
		x = x * x;
		y = y * y;
		
		float resultado = x + y;
		double resultadoFinal = Math.sqrt(resultado);
		System.out.println(resultadoFinal);
		
		System.out.println("Resultado: " + Math.sqrt(resultado));
	}
}
