package aula02;

import java.util.Scanner;

public class Dever15 {

	public static void main(String[] args) {
//		15.	Faça um programa em Java, para verificar se 
//		o número inteiro digitado pelo usuário é menor que 50.
	
		Scanner ler = new Scanner(System.in);
		
		System.out.println("Digite um número ");
		double numero = ler.nextDouble();
		
		if (numero < 50) {
			System.out.println("O número é menor que 50.");
		} else {
			System.out.println("O número não é menor que 50.");
		}
		
		ler.close();
	
	}

}
