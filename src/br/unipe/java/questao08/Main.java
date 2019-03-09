package br.unipe.java.questao08;

import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		String nome;
		int diarias;
		float apurado = 0;
		
		Scanner leitor = new Scanner(System.in);
		
		while (true) {
			float conta = 40;
			System.out.println("Qual o seu nome? ");
			nome = leitor.nextLine();
			
			if (nome.equalsIgnoreCase("fim")) {
				break;
			}
			
			System.out.println("Voce deseja passar quantos dias na pousada? ");
			diarias = leitor.nextInt();
			leitor.nextLine();
			
			if (diarias < 10) {
				conta += 15;
			}
			else {
				conta += 8;
			}
			
			apurado += conta;
			
			System.out.println("O cliente: " + nome);
			System.out.println("Tera como valor da conta: " + conta + " reais");
			
		}
		
		System.out.println("Foi apurado o total de: " + apurado + " reais");
		
		leitor.close();
	}

}
