package br.unipe.java.questao04;

import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		float salario;
		
		Scanner leitor = new Scanner(System.in);
		
		while (true) {
			System.out.println("Qual o seu nome? ");
			String nome = leitor.nextLine();
			
			if (nome.equalsIgnoreCase("fim")) {
				System.out.println("Saindo do programa.");
				break;
			}
			
			System.out.println("Qual o seu salario? ");
			salario = Float.parseFloat(leitor.nextLine());
			
			if (salario < 500) {
				System.out.println("Salario reajustado: \nSera " + (salario * 1.2) + " reais");
			}
			else {
				System.out.println("Salario mantido o mesmo.");
			}
		}
		
		leitor.close();
	}

}
