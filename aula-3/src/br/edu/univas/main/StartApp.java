package br.edu.univas.main;

public class StartApp {

	public static void main(String[] args) {
		int anoCorrente = 2020;
		int anoNascimento = 1994;
		
		int idade = anoCorrente - anoNascimento;
		System.out.println("A idade do pião é: " + idade);
		
		int saldoInicial = 199;
		int valorDeposito = 500;
		int saldoAtual = saldoInicial + valorDeposito;
		System.out.println("Saldo atual: " + saldoAtual);
		
		String primeiroNome = "Rodrigo";
		String ultimoNome = "Faria";
		String nomeCompleto = primeiroNome + " " + ultimoNome;
		System.out.println("Nome do pião é: " + nomeCompleto);
		
		int x = 10;
		int y = 15;
		int z = x * y;
		System.out.println("10 X 15 = " + z);
		
		float m = 147;
		float n = 8;
		float o = m / n;
		System.out.println("144 / 9 = " + o);
		
		int a = 10;
		int b = 3;
		int c = a % b;
		System.out.println("10 % 3 = " + c);
		
		int d = 100;
		int e = 15;
		int f = d * e / 100;
		System.out.println("15% de 100 é " + f);
		
		int i = 20;
		i = i + 1;
		i += 1;
		i++;
		
		i = i - 1;
		i -= 1;
		i--;
		
		
		i *= 10;
		i /= 10;
		
	}
	
}
