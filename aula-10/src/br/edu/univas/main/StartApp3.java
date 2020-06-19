package br.edu.univas.main;

public class StartApp3 {

	public static void main(String[] args) {
		int[] idades = {17, 18, 19, 20, 21, 22, 26, 28, 30};
		int idadeProcurada = 31;
		
		//busca binaria
		int begin = 0;
		int last = idades.length - 1;
		int mid = 0;
		int index = -1;
		
		while (begin <= last) {
			mid = (begin + last) / 2;
			
			if (idades[mid] < idadeProcurada) {
				begin = mid + 1; 
				
			} else if (idades[mid] > idadeProcurada) {
				last = mid - 1;
				
			} else {
				index = mid;
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
