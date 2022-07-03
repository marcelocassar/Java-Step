package aula02;

import java.util.Scanner;

public class Dever12 {

	public static void main(String[] args) {
//		12.	Faça um programa para calcular o perímetro do círculo. 
//		Peça ao usuário para digitar o valor do raio. 
//		Fórmula: perímetro =  2 * PI * Raio.  O valor de PI = 3,14.
	
		Scanner ler = new Scanner(System.in);
		
		System.out.print("Digite o raio : ");
		double raio = ler.nextDouble();
		
		double perimetro = 2* 3.14 * raio;
		
		System.out.println("O perímetro é : " + perimetro + ".");
		
		ler.close();
		
	
	}
}
