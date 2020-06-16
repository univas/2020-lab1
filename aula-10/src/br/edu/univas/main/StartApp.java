package br.edu.univas.main;

public class StartApp {

	public static void main(String[] args) {
		int[] idade = new int[10];
		idade[0] = 10;
		idade[1] = 20;
		idade[2] = 30;
		idade[3] = 40;
		idade[4] = 50;
		idade[5] = 76;
		idade[6] = 70;
		idade[7] = 80;
		idade[8] = 90;
		idade[9] = 100;
		
		//bubble sort
		boolean swap = true;
		
		do {
			swap = false;
			for (int i = 0; i < idade.length - 1; i++) {
				if (idade[i] > idade[i + 1]) {
					int aux = idade[i];
					idade[i] = idade[i + 1];
					idade[i + 1] = aux;
					swap = true;
				}
			}
		} while(swap);
		
		System.out.println("Array Ordenado::::");
		for (int i = 0; i < idade.length; i++) {
			System.out.println(idade[i]);
		}
	}
	
}
