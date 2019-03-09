package br.unipe.java.questao07;

import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		int cont_reprovado = 0, cont_exame = 0, cont_aprovado = 0;
		float nota1, nota2, media, media_geral = 0;
		
		Scanner leitor = new Scanner(System.in);
		for (int i = 0; i <= 6; i++) {
			System.out.println("Digite a sua primeira nota: ");
			nota1 = Float.parseFloat(leitor.nextLine());
			System.out.println("Digite a sua segunda nota: ");
			nota2 = Float.parseFloat(leitor.nextLine());
			
			media = (nota1 + nota2) / 2;
			
			if (media < 3.0) {
				System.out.println("Reprovado");
				cont_reprovado++;
			}
			else if (media >= 3.0 && media < 7.0){
				System.out.println("Exame");
				cont_exame++;
			}
			else {
				System.out.println("Aprovado");
				cont_aprovado++;
			}
			media_geral += media; 
		}
		System.out.println("Total de alunos aprovados: " + cont_aprovado);
		System.out.println("Total de alunos no exame: " + cont_exame);
		System.out.println("Total de alunos reprovados: " + cont_reprovado);
		System.out.println("A media geral da galera foi: "+ media_geral/6);
		
		leitor.close();
	}

}
