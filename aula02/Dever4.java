package aula02;

import java.util.Scanner;

public class Dever4 {
	
		public static void main(String[] args) {
			//4.	Faça um programa em Java para armazenar 4 números reais. 
			//Exiba na tela a soma, a subtração e a multiplicação dos 4 números.

			Scanner ler = new Scanner(System.in);
			
			System.out.println("Digite o primeiro número: ");
			
			double numero1 = ler.nextDouble();
			
			System.out.println("Digite o segundo número: ");
			
			double numero2 = ler.nextDouble();
			
			System.out.println("Digite o terceiro número: ");
			
			double numero3 = ler.nextDouble();
			
			System.out.println("Digite o quarto número: ");
			
			double numero4 = ler.nextDouble();
						
			double soma = numero1 + numero2 + numero3 + numero4;					
			
			double subtracao = numero1 - numero2 - numero3 - numero4;
			
			double multiplicacao = numero1 * numero2 * numero3 * numero4;
						
			System.out.println("A soma dos dois números é: " + soma);			
			System.out.println("A subtração dos dois números é: " + subtracao);
			System.out.println("A multiplicação dos dois números é: " + multiplicacao);
						
			ler.close();
			
		}
	
	}
