package aula02;

import java.util.Scanner;

public class Dever17 {

	public static void main(String[] args) {
		//Faça um programa para verificar se o número digitado pelo usuário é positivo ou negativo. 
		//O número digitado deve ser do tipo double.  
		//Vamos considerar  que e o número for menor que 0 é negativo. 
		//Se for maior ou igual a 0, ele é positivo.
		
		Scanner ler = new Scanner(System.in);
		
		System.out.println("Digite um número ");
		double numero = ler.nextDouble();
		
		if (numero >= 0) {
			System.out.println("O número é POSITIVO.");
		} else {
			System.out.println("O número é NEGATIVO.");
		}
		
		ler.close();
	
		
	}

}
