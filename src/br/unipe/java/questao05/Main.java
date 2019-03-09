package br.unipe.java.questao05;

import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		int refrigerante;
		float gasolina;
		double preco;
		
		Scanner leitor = new Scanner(System.in);
		
		System.out.println("Quantos refrigerantes voce comprou? ");
		refrigerante = leitor.nextInt();
		
//		Tive que colocar esta linha para dar certo o codigo.
//		Sera que seria melhor usar o ParseInt, ParseFloat em tudo?
		
		leitor.nextLine();
		System.out.println("Quantos litros de gasolina voce abasteceu? ");
		gasolina = Float.parseFloat(leitor.nextLine());
		
		preco = (refrigerante * 3.00) + (gasolina * 2.50);
		System.out.println(preco);
		
		leitor.close();
	}

}
