package br.edu.univas.main;

public class Exercicio9 {

	public static void main(String[] args) {
		float precoCelular1 = 1300.1f,
			  precoCelular2 = 1400.1f, 
			  precoCelular3 = 1500.1f,
			  precoCelular4 = 6009.1f, 
			  precoCelular5 = 1700.1f,
			  precoCelular6 = 9100.1f, 
			  valorDeCompra = 9000.1f;
		
		String faixaDeCompra = "Você irá comprar um celular ";
		String aparelhosDisponiveis = "";
		
		if (valorDeCompra >= 100 && valorDeCompra <= 1000) {
			faixaDeCompra += "na faixa de R$ 100 até R$ 1000";
			
			if (precoCelular1 >= 100 && precoCelular1 <= 1000 && precoCelular1 <= valorDeCompra) {
				aparelhosDisponiveis += " R$ " + precoCelular1 + ", ";
			}
			if (precoCelular2 >= 100 && precoCelular2 <= 1000 && precoCelular2 <= valorDeCompra) {
				aparelhosDisponiveis += " R$ " + precoCelular2 + ", ";
			}
			if (precoCelular3 >= 100 && precoCelular3 <= 1000 && precoCelular3 <= valorDeCompra) {
				aparelhosDisponiveis += " R$ " + precoCelular3 + ", ";
			}
			if (precoCelular4 >= 100 && precoCelular4 <= 1000 && precoCelular4 <= valorDeCompra) {
				aparelhosDisponiveis += " R$ " + precoCelular4 + ", ";
			}
			if (precoCelular5 >= 100 && precoCelular5 <= 1000 && precoCelular5 <= valorDeCompra) {
				aparelhosDisponiveis += " R$ " + precoCelular5 + ", ";
			}
			if (precoCelular6 >= 100 && precoCelular6 <= 1000 && precoCelular6 <= valorDeCompra) {
				aparelhosDisponiveis += " R$ " + precoCelular6;
			}
			
		} else if (valorDeCompra <= 2000) {
			faixaDeCompra += "na faixa de R$ 1001 até R$ 2000";
			
			if (precoCelular1 >= 1001 && precoCelular1 <= 2000 && precoCelular1 <= valorDeCompra) {
				aparelhosDisponiveis += " R$ " + precoCelular1 + ", ";
			}
			if (precoCelular2 >= 1001 && precoCelular2 <= 2000 && precoCelular2 <= valorDeCompra) {
				aparelhosDisponiveis += " R$ " + precoCelular2 + ", ";
			}
			if (precoCelular3 >= 1001 && precoCelular3 <= 2000 && precoCelular3 <= valorDeCompra) {
				aparelhosDisponiveis += " R$ " + precoCelular3 + ", ";
			}
			if (precoCelular4 >= 1001 && precoCelular4 <= 2000 && precoCelular4 <= valorDeCompra) {
				aparelhosDisponiveis += " R$ " + precoCelular4 + ", ";
			}
			if (precoCelular5 >= 1001 && precoCelular5 <= 2000 && precoCelular5 <= valorDeCompra) {
				aparelhosDisponiveis += " R$ " + precoCelular5 + ", ";
			}
			if (precoCelular6 >= 1001 && precoCelular6 <= 2000 && precoCelular6 <= valorDeCompra) {
				aparelhosDisponiveis += " R$ " + precoCelular6;
			}
			
		} else if (valorDeCompra > 2000) {
			faixaDeCompra += "acima de R$ 2000";
			
			if (precoCelular1 > 2000 && precoCelular1 <= valorDeCompra) {
				aparelhosDisponiveis += " R$ " + precoCelular1 + ", ";
			}
			if (precoCelular2 > 2000 && precoCelular2 <= valorDeCompra) {
				aparelhosDisponiveis += " R$ " + precoCelular2 + ", ";
			}
			if (precoCelular3 > 2000 && precoCelular3 <= valorDeCompra) {
				aparelhosDisponiveis += " R$ " + precoCelular3 + ", ";
			}
			if (precoCelular4 > 2000 && precoCelular4 <= valorDeCompra) {
				aparelhosDisponiveis += " R$ " + precoCelular4 + ", ";
			}
			if (precoCelular5 > 2000 && precoCelular5 <= valorDeCompra) {
				aparelhosDisponiveis += " R$ " + precoCelular5 + ", ";
			}
			if (precoCelular6 > 2000 && precoCelular6 <= valorDeCompra) {
				aparelhosDisponiveis += " R$ " + precoCelular6;
			}
		}
		
		System.out.println(faixaDeCompra + ". Os aparelhos disponíveis são: " + aparelhosDisponiveis);
	}
	
}
