package aula03;

import java.util.Scanner;

public class Dever1 {

	public static void main(String[] args) {

		// 1- Faça um programa que compare duas palavras.
		// O usuário digitará as duas palavras
		// e o programa dirá se eles são iguais ou diferentes.

		Scanner ler = new Scanner(System.in);

		System.out.println("Digite a primeira palavra");
		String primeira = ler.nextLine();

		System.out.println("Digite a segunda palavra");
		String segunda = ler.nextLine();

		if (comparadorDePalavras(primeira, segunda)) {
			System.out.println("As palavras são iguais.");
		} else {
			System.out.println("As palavras são diferentes.");
		}
					
		ler.close();
	}

	public static boolean comparadorDePalavras(String primeira, String segunda) {
		
		primeira = primeira.trim().toLowerCase();
		segunda = segunda.trim().toLowerCase();
		
		if (primeira.equals(segunda)) {
			return true;
		} else {
			return false;
		}

	}

}
