package aula02;

import java.util.Scanner;

public class Dever2 {

	public static void main(String[] args) {
		// 2.	Faça um programa em Java para armazenar 2 números reais. 
		// Exiba na tela a soma dos números armazenados.

		Scanner ler = new Scanner(System.in);
		
		System.out.println("Digite o primeiro número: ");
		
		int numero1 = ler.nextInt();
		
		System.out.println("Digite o segundo número: ");
		
		int numero2 = ler.nextInt();
		
		int soma = numero1 + numero2;
		
		System.out.println("A soma dos dois números é: " + soma);
		
		ler.close();
		
	}

}
