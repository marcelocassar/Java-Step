package aula02;

import java.util.Scanner;

public class Dever8 {

	public static void main(String[] args) {
//		8.	Faça um programa em Java para fazer a leitura de 2 números inteiros. 
//		Depois exiba na tela o resultado da soma, subtração, multiplicação, divisão e módulo
		
Scanner ler = new Scanner(System.in);
		
		System.out.println("Digite o primeiro número: ");
		
		int numero1 = ler.nextInt();
		
		System.out.println("Digite o segundo número: ");
		
		int numero2 = ler.nextInt();
		
		int soma = numero1 + numero2;
		
		int divisao = numero1 / numero2;
		
		int subtracao = numero1 - numero2;
		
		int multiplicacao = numero1 - numero2;
		
		int modulo = numero1 % numero2;		
		
		System.out.println("A soma dos dois números é: " + soma);
		System.out.println("A divisão dos dois números é: " + divisao);
		System.out.println("A subtração dos dois números é: " + subtracao);
		System.out.println("A multiplicação dos dois números é: " + multiplicacao);
		System.out.println("O modulo dos dois números é: " + modulo);
		
		ler.close();
		
	}

}
		
		

