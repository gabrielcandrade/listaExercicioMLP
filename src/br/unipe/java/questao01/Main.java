package br.unipe.java.questao01;

import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		float salario, novoSalario;
		int percentual;
		
		Scanner leitor = new Scanner(System.in);
		System.out.println("Digite o seu sal�rio: ");
		salario = leitor.nextFloat();
		System.out.println("Digite o seu percentual de aumento: ");
		percentual = leitor.nextInt();
		
		novoSalario = salario + (salario * percentual/100);
		
		System.out.println("O novo salario ser� de " + novoSalario + "reais");
		leitor.close();
	}

}
