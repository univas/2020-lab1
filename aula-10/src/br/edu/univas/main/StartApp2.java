package br.edu.univas.main;

public class StartApp2 {

	public static void main(String[] args) {
		int[] idades = {17, 18, 19, 20, 21, 22, 26, 28, 30};
		
		int idadeProcurada = 190;
		
		//busca sequencial
		int index = -1;
		
		for (int i = 0; i < idades.length; i++) {
			if (idades[i] == idadeProcurada) {
				index = i;
				break;
			}
		}
		
		if (index == -1) {
			System.out.println("Idade não encontrada!");
		} else {
			System.out.println("Idade encontrada na posição: " + index);
		}
	}
	
}
