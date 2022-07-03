package aula02;

import java.util.Scanner;

public class Dever1 {

	public static void main(String[] args) {

	// Dever 1
		
	Scanner ler = new Scanner(System.in);
	
	System.out.println("Digite o Primeiro Número: ");
	
	double numero1 = ler.nextDouble();
	
	System.out.println("Digite o Segundo Número: ");
	
	double numero2 = ler.nextDouble();
	
	double soma = numero1 + numero2;
	
	System.out.println("A soma é: " + soma);
	
	ler.close();
	
	}

}
