package aula01;

import java.util.Scanner;

public class Exemplo7 {
	public static void main(String[] args) {

		Scanner ler = new Scanner(System.in);

		System.out.println("Digite a primeira nota ");

		double nota1 = ler.nextDouble();

		System.out.println("Digite a segunda nota ");

		double nota2 = ler.nextDouble();

		System.out.println("Digite a terceira nota ");

		double nota3 = ler.nextDouble();

		System.out.println("Digite a quarta nota ");

		double nota4 = ler.nextDouble();

		double media = (nota1 + nota2 + nota3 + nota4)/4;

		System.out.println("A média é: " + media);
		
		ler.close();
		
	}
}
