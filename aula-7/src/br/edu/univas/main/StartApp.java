package br.edu.univas.main;

public class StartApp {

	public static void main(String[] args) {
		System.out.println("Estrutura de Repetição");
		
		// inicialização; condição; incremento/decremento
		for (int i = 1; i <= 10; i++) {
			System.out.println(i + " - Univas");
		}

		int j = 10;
		for (;;) {
			
			j++;
			if (j == 12) {
				continue;//para a passagem atual e volta pro inicio do FOR
			}
			
			System.out.println(j + " - Univas");
			
			if (j == 15) {
				break; //para a execução do FOR
			}
		}
		
		System.out.println("Fim do FOR");
		
		int m = 10;
		while (m > 0) {
			System.out.println(m + " - Dentro do While");
			m--;
		}
		
		while(true) {
			if (m == 0) {
				break;
			}
		}
		
		System.out.println("Fim do WHILE");
		
		int salario = 500;
		
		do {
			System.out.println("Seu salário é: " + salario);
			salario++;
			
			if (salario == 515) {
				break;
			}
			
		} while(true);
		
		System.out.println("Fim do DO/WHILE");
	}
	
}
