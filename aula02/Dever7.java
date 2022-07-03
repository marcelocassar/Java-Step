package aula02;

import java.util.Scanner;

public class Dever7 {

	public static void main(String[] args) {
//		7.	Faça um programa em Java para armazenar seu nome, sobrenome e sua idade. 
//		O programa deverá imprimir na tela: O nome completo da pessoa, tem X anos de idade.
//		(Ex: João Carlos, tem 20 anos de idade.)

		Scanner ler = new Scanner(System.in);
		
		System.out.println("Digite seu nome: ");
		
		String nome = ler.next();
		
		System.out.println("Digite seu sobre nome: ");
		
		String sobrenome = ler.next();
		
		System.out.println("Digite sua idade: ");
		
		int idade = ler.nextInt();
		
		System.out.println("Seu nome é: " + nome +  ", seu sobre sobrenome é: " + sobrenome + " e sua idade é " + idade + "anos.");

		ler.close();
	}

}
