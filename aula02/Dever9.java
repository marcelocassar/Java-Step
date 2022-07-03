package aula02;

import java.util.Scanner;

public class Dever9 {

	public static void main(String[] args) {

		
	//	9.	Faça um programa para calcular a média aritmética de 5 notas. 
	//	Todas as notas deverão ser do tipo Inteiro. 
	//	Média = (n1 +n2+ n3 +n4+n5)/5

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
		
		int media = (numero1 + numero2 + numero3 + numero4 + numero5)/5;
		
		System.out.println("A media é " + media);
		
		ler.close();
	}

}
