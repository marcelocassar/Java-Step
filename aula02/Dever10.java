package aula02;

import java.util.Scanner;

public class Dever10 {

	public static void main(String[] args) {
//		10.	Faça um programa para calcular a área de um retângulo. 
//		Fórmula: Área = Base x Altura. 
//		Peça ao usuário para digitar o valor da base e altura em inteiro.

		Scanner ler = new Scanner(System.in);
		
		System.out.println("Digite a Altura do Triângulo: ");		
		double altura = ler.nextDouble();
		
		System.out.println("Digite a Base do Triângulo: ");		
		double base = ler.nextDouble();
		
		double area = base * altura;
		
		System.out.println("A área do triângulo é de " + area + " m².");
		
		ler.close();
		
	}

}
