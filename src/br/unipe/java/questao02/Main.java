package br.unipe.java.questao02;

import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		int valor;
		
		for (int i = 0; i <= 10; i++) {
			System.out.println("Insira um numero que te direi se ele eh par ou impar: ");
			valor = leitor.nextInt();
			
			if (valor % 2 == 0) {
				System.out.println("Par");
			}
			else {
				System.out.println("Impar");
			}
		}
		leitor.close();
	}
}
