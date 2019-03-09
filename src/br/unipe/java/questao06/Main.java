package br.unipe.java.questao06;

import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		float salario_bruto, prestacao;
		
		Scanner leitor = new Scanner(System.in);
		
		System.out.println("Digite o valor do seu salario bruto: ");
		salario_bruto = Float.parseFloat(leitor.nextLine());
		System.out.println("Digite o valor da prestacao do emprestimo: ");
		prestacao = Float.parseFloat(leitor.nextLine());
		
		if (salario_bruto * 0.3 >= prestacao) {
			System.out.println("Podemos fazer negocio!");
		}
		else {
			System.out.println("Valor de salario insuficiente para tal prestacao.");
		}
		
		leitor.close();
	}

}
