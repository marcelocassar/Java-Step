package aula02;

import java.util.Scanner;

public class Dever16 {

	public static void main(String[] args) {
//		16.	Faça um programa em Java, para calcular a média de 5 notas. 
//		As notas, do tipo real, serão digitadas pelo usuário. 
//		Calcule a média e diga se o aluno está aprovado ou reprovado. 
//		Para esta aprovado a média deverá ser maior ou igual a 5,0.
	
		Scanner ler = new Scanner(System.in);
		
		System.out.println("Digite o primeiro número: ");		
		int numero1 = ler.nextInt();
		
		System.out.println("Digite o segundo número: ");		
		int numero2 = ler.nextInt();
		
		System.out.println("Digite o terceiro número: ");		
		int numero3 = ler.nextInt();
		
		System.out.println("Digite o quarto número: ");		
		int numero4 = ler.nextInt();
		
		System.out.println("Digite o quinto número: ");		
		int numero5 = ler.nextInt();
					
		double soma = numero1 + numero2 + numero3 + numero4 + numero5;					
		
		double media = soma/5;
		
		if (media >= 5) {
			System.out.println("O aluno está APROVADO e sua média foi: " + media + ".");
			
		} else {
			System.out.println("O aluno está REPROVADO e sua média foi: " + media + ".");
		}
							
		ler.close();
	
	}

}
