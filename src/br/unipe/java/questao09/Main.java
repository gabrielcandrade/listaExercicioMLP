package br.unipe.java.questao09;

import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		
		Scanner leitor = new Scanner(System.in);
		
		int qnt_pacientes = 0, qnt_mulheres_ideal = 0, qnt_pessoas_adultas = 0, idade = 0, qnt_homens = 0, 
				somatorio_idade_homens = 0, idade_mais_velho = 0;
		double media_idade_homens, peso, altura, altura_mais_baixa = 5.00;
		String mais_velho = null, mulher_mais_baixa = null, nome, sexo;
		
		while (true) {
			System.out.println("Qual o seu nome? ");
			nome = leitor.nextLine();
			
			if (nome.equalsIgnoreCase("fim")) {
				break;
			}
			
			System.out.println("Qual o seu sexo? \nUse M para Masculino e F para Feminino: ");
			sexo = leitor.nextLine();
			
			System.out.println("Qual o seu peso? ");
			peso = Float.parseFloat(leitor.nextLine());
			
			System.out.println("Qual a sua idade? ");
			idade = Integer.parseInt(leitor.nextLine());
			
			System.out.println("Qual a sua altura? ");
			altura = Float.parseFloat(leitor.nextLine());
			

			System.out.print("\n\n");
			
			qnt_pacientes++;
			
			if (sexo.equalsIgnoreCase("m")) {
				qnt_homens++;
				somatorio_idade_homens += idade;
			}
			
			if (sexo.equalsIgnoreCase("f") && altura > 1.60 && altura <= 1.70 && peso > 70) {
				qnt_mulheres_ideal++;
			}
			
			if (idade > 18 && idade <= 25) {
				qnt_pessoas_adultas++;
			}
			
			if (idade > idade_mais_velho) {
				idade_mais_velho = idade;
				mais_velho = nome;
			}
			
			if (sexo.equalsIgnoreCase("f") && mulher_mais_baixa == null) {
				mulher_mais_baixa = nome;
			}
			else {
				if (sexo.equalsIgnoreCase("f") && altura < altura_mais_baixa) {
					altura_mais_baixa = altura;
					mulher_mais_baixa = nome;
				}
			}
		}
		
		if (qnt_homens != 0) {
			media_idade_homens = somatorio_idade_homens / qnt_homens;
		}
		else {
			media_idade_homens = 0;
		}
		
		System.out.println("Relatório\n\n");
		System.out.println("A quantidade de pacientes: " + qnt_pacientes);
		System.out.println("A media de idade de homens: " + media_idade_homens);
		System.out.println("A quantidade de mulheres ideais: " + qnt_mulheres_ideal);
		System.out.println("A quantidade de pessoas adultas: " + qnt_pessoas_adultas);
		System.out.println("O nome do paciente mais velho: " + mais_velho);
		System.out.println("O nome da mulher mais baixa: " + mulher_mais_baixa);
		
		leitor.close();
	}

}
