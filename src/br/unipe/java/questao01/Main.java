package br.unipe.java.questao01;

import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		float salario, novoSalario, percentual, aumento;
		
		Scanner leitor = new Scanner(System.in);
		System.out.println("Digite o seu salário: ");
		salario = leitor.nextFloat();
		System.out.println("Digite o seu percentual de aumento: ");
		percentual = leitor.nextInt();
		
		aumento = (float) (salario * percentual/100.0);
		
		novoSalario = (float) (salario + aumento);
		
		System.out.println("O aumento foi de: " + aumento);		
		System.out.println("O novo salario será de " + novoSalario + " reais");
		leitor.close();
	}

}
