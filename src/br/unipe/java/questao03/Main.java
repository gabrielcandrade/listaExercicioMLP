package br.unipe.java.questao03;

import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		int numero;
		
		Scanner leitor = new Scanner(System.in);
		System.out.println("A tabuada de quanto voce deseja ver? ");
		numero = leitor.nextInt();
		
		for (int i = 0; i < 10; i++) {
			System.out.println( i + " X " + numero + " = " + (numero * i));
		}
		
		leitor.close();
	}
}
