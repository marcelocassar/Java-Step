package aula02;

import java.util.Scanner;

public class Dever14 {

	public static void main(String[] args) {

//		14.	Faça um programa em Java para verificar 
//		se o número inteiro digitado pelo usuário é divisível por 3.
		
		Scanner ler = new Scanner(System.in);
		
		System.out.println("Digite um número ");
		double numero = ler.nextDouble();
		
		if (numero%3 == 0) {
			System.out.println("O número é divisível por 3.");
		} else {
			System.out.println("O número não é divisível por 3.");
		}
		
		ler.close();
		
	}

}
