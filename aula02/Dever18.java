package aula02;

import java.util.Scanner;

public class Dever18 {

	public static void main(String[] args) {
//		18.	Faça um programa em Java para ler o ano e verifique se ele é bissexto 
//		(considere apenas que um ano bissexto é todo ano divisível por 4. 
//		Ex 2000,2004,2008 e etc.).
	
		Scanner ler = new Scanner(System.in);
		
		System.out.println("Digite um número ");
		int numero = ler.nextInt();
		
		if (numero % 4 == 0) {
			System.out.println("O ano é BISSEXTO.");
		} else {
			System.out.println("O ano não é BISSEXTO.");
		}
		
		ler.close();
			
	}
		
}
