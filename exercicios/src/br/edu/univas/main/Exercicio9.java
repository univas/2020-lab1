package br.edu.univas.main;

public class Exercicio9 {

	public static void main(String[] args) {
		float faixa1 = 1000f, 
			  faixa2 = 1500f,
			  faixa3 = 2000f, 
			  precoCelular1 = 1300.1f,
			  precoCelular2 = 1400.1f, 
			  precoCelular3 = 1500.1f,
			  precoCelular4 = 1600.1f, 
			  precoCelular5 = 1700.1f,
			  precoCelular6 = 1800.1f, 
			  valorDeCompra = 1900.1f;
		float faixa = 0;
		String aparelhosDisponiveis = "";
		
		
		if (valorDeCompra <= faixa1) {
			//faixa 1
			faixa = faixa1;
			if (precoCelular1 <= faixa1) {
				aparelhosDisponiveis += precoCelular1 + ", ";
			}
			if (precoCelular2 <= faixa1) {
				aparelhosDisponiveis += precoCelular2 + ", ";
			}
			if (precoCelular3 <= faixa1) {
				aparelhosDisponiveis += precoCelular3 + ", ";
			}
			if (precoCelular4 <= faixa1) {
				aparelhosDisponiveis += precoCelular4 + ", ";
			}
			if (precoCelular5 <= faixa1) {
				aparelhosDisponiveis += precoCelular5 + ", ";
			}
			if (precoCelular6 <= faixa1) {
				aparelhosDisponiveis += precoCelular6 + ", ";
			}
			
		} else if (valorDeCompra <= faixa2) {
			//faixa 2
			faixa = faixa2;
			if (precoCelular1 <= faixa2) {
				aparelhosDisponiveis += precoCelular1 + ", ";
			}
			if (precoCelular2 <= faixa2) {
				aparelhosDisponiveis += precoCelular2 + ", ";
			}
			if (precoCelular3 <= faixa2) {
				aparelhosDisponiveis += precoCelular3 + ", ";
			}
			if (precoCelular4 <= faixa2) {
				aparelhosDisponiveis += precoCelular4 + ", ";
			}
			if (precoCelular5 <= faixa2) {
				aparelhosDisponiveis += precoCelular5 + ", ";
			}
			if (precoCelular6 <= faixa2) {
				aparelhosDisponiveis += precoCelular6 + ", ";
			}
		} else {
			//faixa 3
			faixa = faixa3;
			if (precoCelular1 <= faixa3) {
				aparelhosDisponiveis += precoCelular1 + ", ";
			}
			if (precoCelular2 <= faixa3) {
				aparelhosDisponiveis += precoCelular2 + ", ";
			}
			if (precoCelular3 <= faixa3) {
				aparelhosDisponiveis += precoCelular3 + ", ";
			}
			if (precoCelular4 <= faixa3) {
				aparelhosDisponiveis += precoCelular4 + ", ";
			}
			if (precoCelular5 <= faixa3) {
				aparelhosDisponiveis += precoCelular5 + ", ";
			}
			if (precoCelular6 <= faixa3) {
				aparelhosDisponiveis += precoCelular6 + ", ";
			}
		}
		
		System.out.println("Você irá comprar um celular "
				+ "na faixa de " + faixa + 
				". Os aparelhos disponíveis são: "
				+ aparelhosDisponiveis);
	}
	
}
