package aula02;

import java.util.Scanner;

public class Dever13 {

	public static void main(String[] args) {
//		13.	Faça um programa para calcular a área de um círculo. 
//		Peça ao usuário para digitar o valor do raio. 
//		Fórmula: área do círculo = PI * Raio²    ( ou PI * Raio * Raio)
		
		Scanner ler = new Scanner(System.in);
		
		System.out.println("Digite o raio: ");
		
		double raio = ler.nextDouble();
		
		double area = raio * 3.14 * raio;
		
		System.out.println("A área do circulo é " + area + "m².");
		
		ler.close();
				
	}

}
